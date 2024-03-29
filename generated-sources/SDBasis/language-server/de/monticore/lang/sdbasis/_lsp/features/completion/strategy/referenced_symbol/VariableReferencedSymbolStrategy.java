/* generated by template _lsp.features.completion.strategy.referenced_symbol.ReferencedSymbolStrategy*/

package de.monticore.lang.sdbasis._lsp.features.completion.strategy.referenced_symbol;

import de.monticore.symboltable.ISymbol;
import de.monticore.lang.sdbasis._parser.SDBasisParserInfo;
import de.monticore.lang.sdbasis._lsp.features.completion.strategy.SDBasisDefaultCompletionStrategy;

import de.mclsg.lsp.document_management.DocumentInformation;
import de.mclsg.lsp.features.completion.ExpectedToken;
import de.mclsg.lsp.features.completion.strategy.CompletionStrategy;
import java.util.stream.Collectors;
import java.util.List;

import de.mclsg.lsp.ISymbolUsageResolutionProvider;
import de.mclsg.lsp.document_management.DocumentManager;

import de.monticore.symbols.basicsymbols._symboltable.VariableSymbol;
import de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol;
import de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeSymbol;

public class VariableReferencedSymbolStrategy extends SDBasisDefaultCompletionStrategy {
    public VariableReferencedSymbolStrategy(ISymbolUsageResolutionProvider symbolUsageResolutionProvider, DocumentManager documentManager){
        super(symbolUsageResolutionProvider, documentManager);
    }

    public List<? extends ISymbol> getSymbols(ExpectedToken token, DocumentInformation documentInformation){
        List<? extends ISymbol> res = super.getSymbols(token, documentInformation);
        return res.stream().filter(s -> s instanceof VariableSymbol).collect(Collectors.toList());
    }

    public boolean matches(ExpectedToken expectedToken){
        return expectedToken.isSymbol
                && SDBasisParserInfo.stateReferencesVariableSymbol(expectedToken.parserState);
    }

}