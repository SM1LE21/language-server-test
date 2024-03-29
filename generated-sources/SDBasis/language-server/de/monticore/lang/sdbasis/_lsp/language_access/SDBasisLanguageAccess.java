/* generated by template _lsp.language_access.LanguageAccess*/

package de.monticore.lang.sdbasis._lsp.language_access;

import de.monticore.lang.sdbasis._ast.ASTSDArtifact;
import de.monticore.lang.sdbasis._lsp.SDBasisLspAntlrParser;
import de.monticore.lang.sdbasis._lsp.SDBasisLspAntlrLexer;
import de.monticore.lang.sdbasis._lsp.features.completion.SDBasisCompletionAntlrParser;
import de.monticore.lang.sdbasis._parser.SDBasisAntlrLexer;
import de.monticore.lang.sdbasis._parser.SDBasisParserInfo;
import de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope;
import de.monticore.lang.sdbasis._symboltable.SDBasisGlobalScope;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.*;
import de.se_rwth.commons.logging.Log;
import de.monticore.prettyprint.AstPrettyPrinter;
import de.mclsg.lsp.document_management.DocumentManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SDBasisLanguageAccess implements de.mclsg.lsp.features.CoCoCheckProvider {
    private static final Logger logger = LoggerFactory.getLogger(SDBasisLanguageAccess.class);
    protected DocumentManager documentManager;
    protected SDBasisScopeManager scopeManager;
    protected SDBasisLspCoCoRunner lspCoCoRunner;

    public SDBasisLanguageAccess(DocumentManager documentManager, SDBasisScopeManager scopeManager){
        this.scopeManager = scopeManager;
        this.documentManager = documentManager;

        lspCoCoRunner = initializeLspCoCoRunner();
    }

    protected void initParserInfo(){
    	SDBasisParserInfo.init();
    }

    protected SDBasisLspCoCoRunner initializeLspCoCoRunner(){
        return new SDBasisLspCoCoRunner(documentManager);
    }

    public SDBasisCompletionAntlrParser getCompletionParser(String input) {
		SDBasisLspAntlrLexer lexer = getLexer(input);
		SDBasisCompletionAntlrParser parser = new SDBasisCompletionAntlrParser(new CommonTokenStream(lexer));
        lexer.setMCParser(parser);
        initParserInfo();
        return parser;
    }

    public boolean needsSymbolsForCoCos(){
        return lspCoCoRunner.needsSymbols();
    }

    public SDBasisScopeManager getScopeManager(){
        return scopeManager;
    }

    public void runCoCos(ASTSDArtifact ast) {
    	try{
        	lspCoCoRunner.runAllCoCos(ast);
        }catch(Exception e){
        	// Soft fail => All Findings from CoCos run until the Exception is thrown can be displayed to the user
        	logger.warn("Error while running CoCos", e);
        	Log.error("Unknown error in model", e); // Will be reported to user via diagnostics
        }
    }

    public void runCoCosForAllDocuments() {
        try{
            lspCoCoRunner.runCoCosForAllDocuments();
        }catch(Exception e){
            // Soft fail => All Findings from CoCos run until the Exception is thrown can be displayed to the user
            logger.warn("Error while running CoCos", e);
            Log.error("Unknown error in model", e); // Will be reported to user via diagnostics
        }
    }

    public SDBasisLspAntlrParser getLspParser(String input) {
      SDBasisLspAntlrLexer lexer = getLexer(input);
      SDBasisLspAntlrParser parser = new SDBasisLspAntlrParser(new CommonTokenStream(lexer));
      lexer.setMCParser(parser);
      parser.lexer = lexer;
      initParserInfo();
      return parser;
    }

    public SDBasisLspAntlrLexer getLexer(String input) {
        return new SDBasisLspAntlrLexer(CharStreams.fromString(input));
    }

	/**
	 * Needs to be manually defined via the TOP-Mechanism
	 * @return an ASTPrettyPrinter for the start production ASTNode ASTSDArtifact wrapped in an Optional if available, otherwise Optional.empty
	 */
    public Optional<AstPrettyPrinter<ASTSDArtifact>> getPrettyPrinter(){
      return Optional.empty();
    }

}
