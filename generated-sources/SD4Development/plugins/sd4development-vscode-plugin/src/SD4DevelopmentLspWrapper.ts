
import {
	Executable,
	LanguageClient,
	LanguageClientOptions,
	MessageTransports,
	ServerOptions,
  } from 'vscode-languageclient/node';

import { SocketMessageReader, SocketMessageWriter } from 'vscode-jsonrpc/node'
import { Socket } from 'net';
import { join } from 'path';

export class SD4DevelopmentLspWrapper{
    protected client :LanguageClient | null = null;

    public startWithPort(port: number): void{
        this.client = this.createClient(this.createServerOptionsForPort(port), this.createClientOptions());
        this.client.start();
    }

    public startWithStdio(extensionPath: string, workplaceDirs: string[]){
        this.client = this.createClient(this.createServerOptionsForStdio(extensionPath, workplaceDirs), this.createClientOptions());
        this.client.start();
    }

    protected createClient(serverOptions: ServerOptions, clientOptions: LanguageClientOptions) {
        return new LanguageClient(
            "SD4Development Language Server",
            serverOptions,
            clientOptions,
            false
        );
    }

    protected createClientOptions(): LanguageClientOptions {
        return {
            documentSelector: [{
                language: 'SD4Development',
                scheme: 'file'
            }]
        };
    }

    protected createServerOptionsForStdio(extensionPath: string, workplaceDirs: string[]): ServerOptions {

        let e: Executable;

        if(workplaceDirs.length > 0){
            let modelPath = workplaceDirs.join(";"); 

            e = {
                command: "java",
                args: [
                    "-jar",
                    join(extensionPath, "bin", "sd-language-7.6.0-SNAPSHOT-language-server.jar"),
                    "-mp",
                    modelPath
                ]
            };
        }else{
            e = {
                command: "java",
                args: [
                    "-jar",
                    join(extensionPath, "bin", "sd-language-7.6.0-SNAPSHOT-language-server.jar"),
                ]
            };
        }

        return { run: e, debug: e };
    }

    protected createServerOptionsForPort(port: number): ServerOptions {
        const socket = new Socket().connect({ port: port });

        let messageTransports: MessageTransports = {
            reader: new SocketMessageReader(socket, "utf-8"),
            writer: new SocketMessageWriter(socket, "utf-8")
        };

        return () => Promise.resolve(messageTransports);
    }

    public stop(){
        if(this.client){
            this.client.stop();
        }
    }

    public getClient(){
      return this.client;
    }
}