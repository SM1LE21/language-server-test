
import * as vscode from 'vscode';
import { ExecuteCommandParams, LanguageClient } from 'vscode-languageclient/node';
import {
	SDBasisLspWrapper
} from './SDBasisLspWrapper'

let wrapper: SDBasisLspWrapper | null = null;
let debugInfoOpened = false;

export function activate(context: vscode.ExtensionContext) {
	wrapper = new SDBasisLspWrapper();
	const config = vscode.workspace.getConfiguration('lsp.sdbasis');
	if(process.env['SDBASIS_LSP_PORT']){
		const p = Number(process.env['SDBASIS_LSP_PORT']);
		wrapper.startWithPort(p);
	} else if(config.get('useRunningServer')){
		const p = config.get('runningServerPort');
		if(p && typeof p == 'number'){
			wrapper.startWithPort(p);
		}else{
			throw new Error("Setting lsp.sdbasis.runningServerPort is invalid");
		}
	}else{
		const folders = vscode.workspace.workspaceFolders;
		let foldersAsString: string[] = [];
		if(folders){
			folders.forEach(f => foldersAsString.push(f.uri.fsPath))
		}
		wrapper.startWithStdio(context.extensionPath, foldersAsString)
	}

	context.subscriptions.push(vscode.commands.registerCommand("sdbasis.executeCommand", (cmd: string, ...args:any) => {
		let params: ExecuteCommandParams = {
			command: cmd,
			arguments: args
		};
		wrapper?.getClient()?.sendRequest("workspace/executeCommand", params)
	}));

	context.subscriptions.push(vscode.commands.registerCommand("sdbasis.debugShowTokenInfo", (cmd: string, ...args:any) => {
		let params: ExecuteCommandParams = {
			command: "debugShowTokenInfo",
			arguments: []
		};
		wrapper?.getClient()?.sendRequest("workspace/executeCommand", params)
		debugInfoOpened = true;
	}));

	vscode.window.onDidChangeTextEditorSelection((e) => {
		if(!debugInfoOpened){
			return;
		}

		let start = vscode.window.activeTextEditor?.selection.start;
		let doc = vscode.window.activeTextEditor?.document

		if(start !== undefined){
			let params: ExecuteCommandParams = {
				command: "debugUpdateCursorPosition",
				arguments: [doc?.uri.toString(), doc?.offsetAt(start)]
			};
			wrapper?.getClient()?.sendRequest("workspace/executeCommand", params)
		}
	});

	let api = {
		getLanguageClient(): LanguageClient | null {
			return wrapper ? wrapper.getClient() : null;
		}
	};

	// Accessible extensions.getExtension(...).exports
	// see https://code.visualstudio.com/api/references/vscode-api#extensions
	return api;
}

export function deactivate() {
	if(wrapper){
		wrapper.stop();
	}
}