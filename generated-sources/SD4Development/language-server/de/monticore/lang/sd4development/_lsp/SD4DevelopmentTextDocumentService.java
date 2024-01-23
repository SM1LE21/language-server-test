/* generated by template _lsp.TextDocumentService*/

package de.monticore.lang.sd4development._lsp;

import de.monticore.lang.sd4development._lsp.features.code_lens.SD4DevelopmentCodeLensProvider;
import de.monticore.lang.sd4development._lsp.language_access.SD4DevelopmentLanguageAccess;
import de.monticore.lang.sd4development._lsp.features.completion.SD4DevelopmentCompletionProvider;
import de.monticore.lang.sd4development._lsp.features.definition.SD4DevelopmentDefinitionProvider;
import de.monticore.lang.sd4development._lsp.features.diagnostics.SD4DevelopmentDiagnosticsProvider;
import de.monticore.lang.sd4development._lsp.features.formatting.*;
import de.monticore.lang.sd4development._lsp.features.symbols.SD4DevelopmentDocumentSymbolProvider;
import de.monticore.lang.sd4development._lsp.features.code_action.*;
import de.monticore.lang.sd4development._lsp.features.references.*;
import de.monticore.lang.sd4development._lsp.features.hover.*;
import de.monticore.lang.sd4development._lsp.features.rename.*;
import de.monticore.lang.sd4development._lsp.features.syntax_highlighting.*;

import de.mclsg.lsp.features.CoCoCheckProvider;
import de.mclsg.lsp.features.reference.CommonReferencesProvider;
import de.mclsg.lsp.CommonTextDocumentService;
import de.mclsg.lsp.document_management.DocumentManager;
import de.mclsg.lsp.ISymbolUsageResolutionProvider;
import de.mclsg.SeCommonsLogParser;
import org.eclipse.lsp4j.services.LanguageClient;
import de.mclsg.lsp.features.sematic_tokens.impl.DelegatingSemanticsTokenProvider;
import de.mclsg.lsp.features.SemanticTokensProvider;
import de.mclsg.UriUtils;

import de.monticore.lang.sdbasis._ast.ASTSDArtifact;
import de.monticore.prettyprint.AstPrettyPrinter;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.lsp4j.*;

public class SD4DevelopmentTextDocumentService extends CommonTextDocumentService {
	private static final Logger logger = LoggerFactory.getLogger(SD4DevelopmentTextDocumentService.class);
    protected SD4DevelopmentLanguageAccess languageAccess;
    protected SeCommonsLogParser logParser;
    protected ISymbolUsageResolutionProvider symbolUsageResolutionProvider;
		protected CommonReferencesProvider referencesProvider;

    public SD4DevelopmentTextDocumentService(de.mclsg.lsp.CommonLanguageServer languageServer, DocumentManager documentManager, LanguageClient languageClient, SD4DevelopmentLanguageAccess languageAccess, ISymbolUsageResolutionProvider symbolUsageResolutionProvider) {
        super(languageServer, documentManager, languageClient);
        this.languageAccess = languageAccess;
        this.symbolUsageResolutionProvider = symbolUsageResolutionProvider;
				registerDefaultProviders();
    }

	protected void registerDefaultProviders(){
		logParser = initLogParser();
		registerDefaultDocumentInformationProvider();
		registerDefaultCompletionProvider();
		registerDefaultDiagnosticsProvider();
		registerDefaultDefinitionProvider();
		registerDefaultSemanticTokensProvider();
		registerDefaultFormattingProvider();
		registerDefaultCodeActionProvider();
		registerDefaultDocumentSymbolProvider();
		registerDefaultCoCoCheckProvider();
		registerDefaultHoverProvider();
		initAndRegisterDefaultReferencesProvider();
		registerDefaultRenameProvider();
		registerDefaultPrepareRenameProvider();
    registerDefaultCodeLensProvider();
	}

    protected SeCommonsLogParser initLogParser(){
    	return new SeCommonsLogParser();
    }

	protected void registerDefaultDocumentInformationProvider(){
		register(new SD4DevelopmentDocumentInformationProvider(documentManager, logParser, languageAccess));
	}

	protected void registerDefaultCompletionProvider(){
		register(new SD4DevelopmentCompletionProvider(languageServer, documentManager, languageAccess, symbolUsageResolutionProvider));
	}

	protected void registerDefaultDiagnosticsProvider(){
		register(new SD4DevelopmentDiagnosticsProvider(documentManager, logParser, languageAccess));
	}

	protected void registerDefaultDefinitionProvider(){
		register(new SD4DevelopmentDefinitionProvider(documentManager, symbolUsageResolutionProvider));
	}

	public void registerDefaultFormattingProvider(){
		Optional<AstPrettyPrinter<ASTSDArtifact>> prettyPrinter = languageAccess.getPrettyPrinter();
		if(prettyPrinter.isPresent()){
			register(new SD4DevelopmentPrettyPrintingFormattingProvider(documentManager, prettyPrinter.get()));
		}else{
			register(new SD4DevelopmentFormattingProvider(languageAccess));
		}
	}

    protected void registerDefaultSemanticTokensProvider(){
    	register(new SD4DevelopmentSemanticTokensProvider(languageAccess));
    }

    protected void registerDefaultCodeActionProvider(){
    	Optional<AstPrettyPrinter<ASTSDArtifact>> prettyPrinter = languageAccess.getPrettyPrinter();
    	if(prettyPrinter.isPresent()){
				register(new SD4DevelopmentCodeActionProvider(documentManager, prettyPrinter.get()));
    	}else{
    		logger.warn("Can not register the default CodeActionProvider since no pretty printer is provided by the language access. You can provide one by using the TOP-mechanism on SD4DevelopmentLanguageAccess");
    	}
    }

    protected void registerDefaultDocumentSymbolProvider(){
    	register(new SD4DevelopmentDocumentSymbolProvider(documentManager));
    }

    protected void registerDefaultCoCoCheckProvider(){
        register(languageAccess);
    }

    protected void registerDefaultHoverProvider(){
        register(new SD4DevelopmentHoverProvider(documentManager, symbolUsageResolutionProvider));
     }

     protected void initAndRegisterDefaultReferencesProvider(){
				referencesProvider = new SD4DevelopmentReferencesProvider(documentManager, symbolUsageResolutionProvider);
				register(referencesProvider);
     }

		protected void registerDefaultRenameProvider(){
				register(new SD4DevelopmentRenameProvider(documentManager, symbolUsageResolutionProvider, referencesProvider));
		}

	  protected void registerDefaultPrepareRenameProvider(){
			try{
				register(new SD4DevelopmentPrepareRenameProvider(documentManager, symbolUsageResolutionProvider));
			}catch(Exception e){
				logger.warn("Can not register PrepareRenameProvider", e);
			}
		}

    protected void registerDefaultCodeLensProvider(){
      register(new SD4DevelopmentCodeLensProvider(documentManager));
    }

		@Deprecated
		public void didChange(String uri, ASTSDArtifact ast){
			didChange(uri, ast, de.mclsg.lsp.ChangeSource.UNKNOWN);
		}

		/**
     * Overload, that can update a document based on a changed ast
     */
		public void didChange(String uri, ASTSDArtifact ast, de.mclsg.lsp.ChangeSource changeSource){
      var prettyPrinterOpt = languageAccess.getPrettyPrinter();
      if(!prettyPrinterOpt.isPresent()){
				logger.warn("The language server can not convert the ast to text, since no pretty printer is registered in the language access. "
									+ "This can be fixed by overriding SD4DevelopmentLanguageAccess#getPrettyPrinter with the TOP-mechanism");
        return;
      }

			uri = UriUtils.toNormalizedFileUri(uri).toString();

			// Build resulting string
      var prettyPrinter = prettyPrinterOpt.get();
      String res = prettyPrinter.prettyPrint(ast);

			languageClient.applyEdit(new ApplyWorkspaceEditParams(new WorkspaceEdit(
				Map.of(uri, List.of(new TextEdit(
					new Range(new Position(0,0), new Position(Integer.MAX_VALUE, Integer.MAX_VALUE)),
					res
				))))));

      didChange(new DidChangeTextDocumentParams(
				new VersionedTextDocumentIdentifier(uri, 0),
				List.of(new TextDocumentContentChangeEvent(res))
      ), changeSource);
		}
}
