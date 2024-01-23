/* generated by template _lsp.features.completion.SymbolCollector*/

package de.monticore.lang.sd4development._lsp.features.completion;

import de.monticore.lang.sd4development.SD4DevelopmentMill;
import de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser;
import de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope;
import de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope;
import de.monticore.symboltable.ISymbol;
import de.monticore.symboltable.IScope;
import de.monticore.lang.sdbasis._ast.ASTSDArtifact;

import java.util.Collections;
import java.util.function.Consumer;
import de.monticore.symbols.oosymbols._symboltable.FieldSymbol;
import de.monticore.symbols.oosymbols._symboltable.MethodSymbol;
import de.monticore.symbols.basicsymbols._symboltable.VariableSymbol;
import de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol;
import de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol;
import de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeSymbol;

import java.util.stream.Collectors;

public class SD4DevelopmentSymbolCollector implements
    de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2,
    de.monticore.lang.sdbasis._visitor.SDBasisVisitor2,
    de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor2,
    de.monticore.mcbasics._visitor.MCBasicsVisitor2,
    de.monticore.symbols.basicsymbols._visitor.BasicSymbolsVisitor2,
    de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisVisitor2,
    de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor2,
    de.monticore.umlstereotype._visitor.UMLStereotypeVisitor2,
    de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor2,
    de.monticore.expressions.commonexpressions._visitor.CommonExpressionsVisitor2,
    de.monticore.ocl.oclexpressions._visitor.OCLExpressionsVisitor2,
    de.monticore.symbols.oosymbols._visitor.OOSymbolsVisitor2
{
    protected SD4DevelopmentSymbolCollection symbolCollection = new SD4DevelopmentSymbolCollection();

    protected SD4DevelopmentTraverser traverser = SD4DevelopmentMill.traverser();

    protected SD4DevelopmentTraverser getTraverser() {
      return traverser;
    }

    public SD4DevelopmentSymbolCollection collectSymbolsFromSymbolTable(ASTSDArtifact ast, ISD4DevelopmentArtifactScope artifactScope)
    {
      getTraverser().add4SD4Development(this);
      getTraverser().add4SDBasis(this);
      getTraverser().add4MCBasicTypes(this);
      getTraverser().add4MCBasics(this);
      getTraverser().add4BasicSymbols(this);
      getTraverser().add4ExpressionsBasis(this);
      getTraverser().add4MCLiteralsBasis(this);
      getTraverser().add4UMLStereotype(this);
      getTraverser().add4MCCommonLiterals(this);
      getTraverser().add4CommonExpressions(this);
      getTraverser().add4OCLExpressions(this);
      getTraverser().add4OOSymbols(this);

      artifactScope.accept(getTraverser());
      ast.accept(getTraverser());
      return this.symbolCollection;
    }

    @Override
    public void visit(FieldSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(MethodSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(VariableSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(OOTypeSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(DiagramSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(TypeVarSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(FunctionSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

    @Override
    public void visit(TypeSymbol sym) {
      symbolCollection.addSymbol(sym);
    }

}
