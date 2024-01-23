
import * as vscode from 'vscode';
import { ExecuteCommandParams, LanguageClient } from 'vscode-languageclient/node';
import {
	SD4DevelopmentLspWrapper
} from './SD4DevelopmentLspWrapper'

let wrapper: SD4DevelopmentLspWrapper | null = null;
let debugInfoOpened = false;

export function activate(context: vscode.ExtensionContext) {
	wrapper = new SD4DevelopmentLspWrapper();
	const config = vscode.workspace.getConfiguration('lsp.sd4development');
	if(process.env['SD4DEVELOPMENT_LSP_PORT']){
		const p = Number(process.env['SD4DEVELOPMENT_LSP_PORT']);
		wrapper.startWithPort(p);
	} else if(config.get('useRunningServer')){
		const p = config.get('runningServerPort');
		if(p && typeof p == 'number'){
			wrapper.startWithPort(p);
		}else{
			throw new Error("Setting lsp.sd4development.runningServerPort is invalid");
		}
	}else{
		const folders = vscode.workspace.workspaceFolders;
		let foldersAsString: string[] = [];
		if(folders){
			folders.forEach(f => foldersAsString.push(f.uri.fsPath))
		}
		wrapper.startWithStdio(context.extensionPath, foldersAsString)
	}

	context.subscriptions.push(vscode.commands.registerCommand("sd4development.executeCommand", (cmd: string, ...args:any) => {
		let params: ExecuteCommandParams = {
			command: cmd,
			arguments: args
		};
		wrapper?.getClient()?.sendRequest("workspace/executeCommand", params)
	}));

	context.subscriptions.push(vscode.commands.registerCommand("sd4development.debugShowTokenInfo", (cmd: string, ...args:any) => {
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