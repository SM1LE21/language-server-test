/* generated by template _lsp.features.completion.SymbolCollection*/

package de.monticore.lang.sd4development._lsp.features.completion;

import de.monticore.symbols.oosymbols._symboltable.FieldSymbol;
import de.monticore.symbols.oosymbols._symboltable.MethodSymbol;
import de.monticore.symbols.basicsymbols._symboltable.VariableSymbol;
import de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol;
import de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol;
import de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol;
import de.monticore.symbols.basicsymbols._symboltable.TypeSymbol;
import de.monticore.symboltable.ISymbol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SD4DevelopmentSymbolCollection {
    private List<FieldSymbol> fieldSymbols = new ArrayList<>();
    private List<MethodSymbol> methodSymbols = new ArrayList<>();
    private List<VariableSymbol> variableSymbols = new ArrayList<>();
    private List<OOTypeSymbol> oOTypeSymbols = new ArrayList<>();
    private List<DiagramSymbol> diagramSymbols = new ArrayList<>();
    private List<TypeVarSymbol> typeVarSymbols = new ArrayList<>();
    private List<FunctionSymbol> functionSymbols = new ArrayList<>();
    private List<TypeSymbol> typeSymbols = new ArrayList<>();

    public List<? extends ISymbol> getAllSymbols() {
        ArrayList<ISymbol> allSymbols = new ArrayList<>();
        allSymbols.addAll(fieldSymbols);
        allSymbols.addAll(methodSymbols);
        allSymbols.addAll(variableSymbols);
        allSymbols.addAll(oOTypeSymbols);
        allSymbols.addAll(diagramSymbols);
        allSymbols.addAll(typeVarSymbols);
        allSymbols.addAll(functionSymbols);
        allSymbols.addAll(typeSymbols);
        return allSymbols;
    }

    public List<FieldSymbol> getFieldSymbols() {
        return this.fieldSymbols;
    }

    public void addSymbol(FieldSymbol fieldSymbol) {
        this.fieldSymbols.add(fieldSymbol);
    }

    public void addAllFieldSymbols(Collection<FieldSymbol> fieldSymbols) {
        this.fieldSymbols.addAll(fieldSymbols);
    }
    public List<MethodSymbol> getMethodSymbols() {
        return this.methodSymbols;
    }

    public void addSymbol(MethodSymbol methodSymbol) {
        this.methodSymbols.add(methodSymbol);
    }

    public void addAllMethodSymbols(Collection<MethodSymbol> methodSymbols) {
        this.methodSymbols.addAll(methodSymbols);
    }
    public List<VariableSymbol> getVariableSymbols() {
        return this.variableSymbols;
    }

    public void addSymbol(VariableSymbol variableSymbol) {
        this.variableSymbols.add(variableSymbol);
    }

    public void addAllVariableSymbols(Collection<VariableSymbol> variableSymbols) {
        this.variableSymbols.addAll(variableSymbols);
    }
    public List<OOTypeSymbol> getOOTypeSymbols() {
        return this.oOTypeSymbols;
    }

    public void addSymbol(OOTypeSymbol oOTypeSymbol) {
        this.oOTypeSymbols.add(oOTypeSymbol);
    }

    public void addAllOOTypeSymbols(Collection<OOTypeSymbol> oOTypeSymbols) {
        this.oOTypeSymbols.addAll(oOTypeSymbols);
    }
    public List<DiagramSymbol> getDiagramSymbols() {
        return this.diagramSymbols;
    }

    public void addSymbol(DiagramSymbol diagramSymbol) {
        this.diagramSymbols.add(diagramSymbol);
    }

    public void addAllDiagramSymbols(Collection<DiagramSymbol> diagramSymbols) {
        this.diagramSymbols.addAll(diagramSymbols);
    }
    public List<TypeVarSymbol> getTypeVarSymbols() {
        return this.typeVarSymbols;
    }

    public void addSymbol(TypeVarSymbol typeVarSymbol) {
        this.typeVarSymbols.add(typeVarSymbol);
    }

    public void addAllTypeVarSymbols(Collection<TypeVarSymbol> typeVarSymbols) {
        this.typeVarSymbols.addAll(typeVarSymbols);
    }
    public List<FunctionSymbol> getFunctionSymbols() {
        return this.functionSymbols;
    }

    public void addSymbol(FunctionSymbol functionSymbol) {
        this.functionSymbols.add(functionSymbol);
    }

    public void addAllFunctionSymbols(Collection<FunctionSymbol> functionSymbols) {
        this.functionSymbols.addAll(functionSymbols);
    }
    public List<TypeSymbol> getTypeSymbols() {
        return this.typeSymbols;
    }

    public void addSymbol(TypeSymbol typeSymbol) {
        this.typeSymbols.add(typeSymbol);
    }

    public void addAllTypeSymbols(Collection<TypeSymbol> typeSymbols) {
        this.typeSymbols.addAll(typeSymbols);
    }
}
