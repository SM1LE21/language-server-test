/* generated by template _lsp.features.completion.strategy.DefaultCompletionStrategy*/

package de.monticore.lang.sd4development._lsp.features.completion.strategy;

import de.monticore.lang.sd4development._lsp.features.completion.SD4DevelopmentSymbolCollection;
import de.monticore.lang.sd4development._lsp.features.completion.SD4DevelopmentSymbolCollector;
import de.monticore.lang.sd4development._symboltable.*;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope;
import de.monticore.symbols.oosymbols._symboltable.FieldSymbol;
import de.monticore.symbols.oosymbols._symboltable.MethodSymbol;
import de.monticore.symbols.basicsymbols._symboltable.VariableSymbol;
import de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol;
import de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol;
import de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeSymbol;

import de.monticore.visitor.IVisitor;
import org.eclipse.lsp4j.Position;
import de.mclsg.PositionUtils;
import de.mclsg.lsp.document_management.DocumentInformation;
import de.mclsg.lsp.features.completion.ExpectedToken;
import de.mclsg.lsp.features.completion.strategy.TokenPath;
import de.mclsg.lsp.features.completion.strategy.CompletionStrategy;
import de.mclsg.lsp.ISymbolUsageResolutionProvider;
import de.mclsg.lsp.document_management.DocumentManager;
import de.monticore.symboltable.ImportStatement;

import de.monticore.lang.sd4development.SD4DevelopmentMill;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope;
import de.monticore.symboltable.ISymbol;
import de.monticore.symboltable.IScope;
import de.monticore.lang.sd4development._symboltable.ICommonSD4DevelopmentSymbol;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope;
import de.monticore.lang.sdbasis._ast.ASTSDArtifact;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class SD4DevelopmentDefaultCompletionStrategy implements CompletionStrategy {
    protected DocumentManager documentManager;

    protected ISymbolUsageResolutionProvider symbolUsageResolutionProvider;

    public SD4DevelopmentDefaultCompletionStrategy(ISymbolUsageResolutionProvider symbolUsageResolutionProvider, DocumentManager documentManager){
        this.symbolUsageResolutionProvider = symbolUsageResolutionProvider;
        this.documentManager = documentManager;
    }

    @Override
    public List<? extends ISymbol> getSymbols(ExpectedToken expectedToken, DocumentInformation documentInformation) {
        return getNameCompletion(expectedToken, documentInformation);
    }

    @Override
    public List<? extends ISymbol> getImportedSymbols(ExpectedToken expectedToken, DocumentInformation documentInformation) {
        final List<ISymbol> res = new ArrayList<>();
        documentInformation.syncAccessArtifactScope (asOpt -> asOpt.map(as -> (ISD4DevelopmentArtifactScope) as).ifPresent(as -> {
            as
                .streamImports()
                .filter(i -> !i.isStar())
                .map(i -> symbolUsageResolutionProvider.resolve(as, i.getStatement(), expectedToken.parserState))
                .flatMap(symColl -> symColl.stream())
                .distinct()
                .forEach(res::add);
        }));

        return res;
    }

    @Override
    public boolean matches(ExpectedToken expectedToken) {
        return true;
    }

    private List<? extends ISymbol> getNameCompletion(ExpectedToken expectedToken, DocumentInformation documentInformation) {
        SD4DevelopmentSymbolCollector collector = new SD4DevelopmentSymbolCollector();
        AtomicReference<SD4DevelopmentSymbolCollection> symbolCollection = new AtomicReference<>(new SD4DevelopmentSymbolCollection());
        documentInformation.syncAccessArtifactScope((artifactScope) -> {
        	if(artifactScope.isPresent()){
        		symbolCollection.set(
                collector.collectSymbolsFromSymbolTable(
                    (ASTSDArtifact) documentInformation.ast,
                    (ISD4DevelopmentArtifactScope) artifactScope.get()
                )
            );
        	}
        });

        List<? extends ISymbol> result = symbolCollection.get().getAllSymbols();

        if(!expectedToken.tokensMatchedBefore.isEmpty()) {
            List<IScope> scopes = new ArrayList<>();
            var t = SD4DevelopmentMill.inheritanceTraverser();
            t.add4IVisitor(new IVisitor() {
                public void visit(IScope scope) {
                    scopes.add(scope);
                }
            });
            documentInformation.ast.accept(t);

            var p = expectedToken
                        .tokensMatchedBefore
                        .get(expectedToken.tokensMatchedBefore.size() - 1)
                        .range.getEnd();
            p = new Position(p.getLine(), p.getCharacter() + 1);
            Optional<IScope> scopeOpt = PositionUtils.getClosestMatchingScope(scopes, p);
            if (scopeOpt.isPresent()) {
                result = filterVisibleSymbols((ISD4DevelopmentScope) scopeOpt.get(), result);
            }
        }
        return result;
    }

    public List<ISymbol> filterVisibleSymbols(ISD4DevelopmentScope scope, List<? extends ISymbol> symbols) {
        return symbols.stream()
                .filter(symbol -> {
                    boolean isSymbolInScope = false;
                    if (symbol instanceof FieldSymbol) {
						isSymbolInScope = scope.resolveFieldMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof MethodSymbol) {
						isSymbolInScope = scope.resolveMethodMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof VariableSymbol) {
						isSymbolInScope = scope.resolveVariableMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof OOTypeSymbol) {
						isSymbolInScope = scope.resolveOOTypeMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof DiagramSymbol) {
						isSymbolInScope = scope.resolveDiagramMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof TypeVarSymbol) {
						isSymbolInScope = scope.resolveTypeVarMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof FunctionSymbol) {
						isSymbolInScope = scope.resolveFunctionMany(symbol.getName()).size() > 0;
                    } else                    if (symbol instanceof TypeSymbol) {
						isSymbolInScope = scope.resolveTypeMany(symbol.getName()).size() > 0;
                    } 
                    return isSymbolInScope;
                })
                .collect(Collectors.toList());
    }
}