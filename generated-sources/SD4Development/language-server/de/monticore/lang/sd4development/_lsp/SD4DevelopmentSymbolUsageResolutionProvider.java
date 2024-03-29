/* generated by template _lsp.SymbolUsageResolutionProvider*/

package de.monticore.lang.sd4development._lsp;

import de.mclsg.lsp.AbstractSymbolUsageResolutionProvider;

import de.monticore.symboltable.IScope;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope;
import de.monticore.symboltable.IScope;
import de.monticore.symboltable.ISymbol;

import de.monticore.lang.sd4development._parser.SD4DevelopmentParserInfo;

import de.mclsg.PositionUtils;
import de.mclsg.lsp.document_management.DocumentInformation;
import de.mclsg.parser.MatchedToken;
import org.eclipse.lsp4j.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class SD4DevelopmentSymbolUsageResolutionProvider extends AbstractSymbolUsageResolutionProvider {

    @Override
    public <T extends IScope> List<ISymbol> resolve(T enclosingScope, String name, int parserState) {
        List<ISymbol> symbols = new ArrayList<>();

        if(enclosingScope instanceof ISD4DevelopmentScope){
          ISD4DevelopmentScope scope = ((ISD4DevelopmentScope) enclosingScope);
          if(SD4DevelopmentParserInfo.stateReferencesVariableSymbol(parserState)){
            symbols.addAll(scope.resolveVariableMany(name));
          }else
          {
            symbols.addAll(scope.resolveFieldMany(name));
            symbols.addAll(scope.resolveMethodMany(name));
            symbols.addAll(scope.resolveVariableMany(name));
            symbols.addAll(scope.resolveOOTypeMany(name));
            symbols.addAll(scope.resolveDiagramMany(name));
            symbols.addAll(scope.resolveTypeVarMany(name));
            symbols.addAll(scope.resolveFunctionMany(name));
            symbols.addAll(scope.resolveTypeMany(name));
          }
        }
        return symbols;
    }

    @Override
    public IScope getEnclosingScope(DocumentInformation information, MatchedToken token) {
        AtomicReference<IScope> res = new AtomicReference<>(null);

        information.syncAccessArtifactScope(aOpt -> aOpt.ifPresent(ascope -> {
            ISD4DevelopmentScope cur = (ISD4DevelopmentScope) ascope;;
            ISD4DevelopmentScope last = null;
            Range bestFit = PositionUtils.toRange(cur)
                                .orElse(new Range(new Position(0, 0), new Position(Integer.MAX_VALUE, Integer.MAX_VALUE)));

            while(cur != last){
                last = cur;
                for(IScope subScope : cur.getSubScopes()){
                    Optional<Range> rOpt = PositionUtils.toRange(subScope);
                    if(rOpt.isPresent()){
                        Range r = rOpt.get();
                        if(PositionUtils.contains(r, token.range)){
                            if(PositionUtils.contains(bestFit, r)){
                                bestFit = r;
                                cur = (ISD4DevelopmentScope) subScope;
                            }
                        }
                    }
                }
            }

            res.set(cur);
        }));

        return res.get();
    }

}