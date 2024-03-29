/* generated from model SD4Development */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._symboltable;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface ISD4DevelopmentGlobalScope extends de.monticore.lang.sdbasis._symboltable.ISDBasisGlobalScope,de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsGlobalScope,de.monticore.expressions.commonexpressions._symboltable.ICommonExpressionsGlobalScope,de.monticore.ocl.oclexpressions._symboltable.IOCLExpressionsGlobalScope,de.monticore.symbols.oosymbols._symboltable.IOOSymbolsGlobalScope,de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope  { 
/* Hookpoint: InterfaceContent:Elements */


  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> resolveAdaptedOOType (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol>();
    for (de.monticore.symbols.oosymbols._symboltable.IOOTypeSymbolResolver symDel : getAdaptedOOTypeSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedOOTypeSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> resolveAdaptedField (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.oosymbols._symboltable.FieldSymbol>();
    for (de.monticore.symbols.oosymbols._symboltable.IFieldSymbolResolver symDel : getAdaptedFieldSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedFieldSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> resolveAdaptedMethod (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.oosymbols._symboltable.MethodSymbol>();
    for (de.monticore.symbols.oosymbols._symboltable.IMethodSymbolResolver symDel : getAdaptedMethodSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedMethodSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> resolveAdaptedDiagram (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol>();
    for (de.monticore.symbols.basicsymbols._symboltable.IDiagramSymbolResolver symDel : getAdaptedDiagramSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedDiagramSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> resolveAdaptedType (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol>();
    for (de.monticore.symbols.basicsymbols._symboltable.ITypeSymbolResolver symDel : getAdaptedTypeSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedTypeSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> resolveAdaptedTypeVar (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol>();
    for (de.monticore.symbols.basicsymbols._symboltable.ITypeVarSymbolResolver symDel : getAdaptedTypeVarSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedTypeVarSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> resolveAdaptedVariable (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol>();
    for (de.monticore.symbols.basicsymbols._symboltable.IVariableSymbolResolver symDel : getAdaptedVariableSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedVariableSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> resolveAdaptedFunction (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> adaptedSymbols = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol>();
    for (de.monticore.symbols.basicsymbols._symboltable.IFunctionSymbolResolver symDel : getAdaptedFunctionSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedFunctionSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> resolveOOTypeMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol> resolvedSymbol = resolveOOTypeDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadOOType(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveOOTypeDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isOOTypeSymbolsAlreadyResolved()){
    setOOTypeSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedOOType(foundSymbols, name, modifier, predicate));
  }
  setOOTypeSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadOOType (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> resolveFieldMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.oosymbols._symboltable.FieldSymbol> resolvedSymbol = resolveFieldDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadField(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveFieldDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isFieldSymbolsAlreadyResolved()){
    setFieldSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedField(foundSymbols, name, modifier, predicate));
  }
  setFieldSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadField (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> resolveMethodMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.oosymbols._symboltable.MethodSymbol> resolvedSymbol = resolveMethodDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadMethod(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveMethodDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isMethodSymbolsAlreadyResolved()){
    setMethodSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedMethod(foundSymbols, name, modifier, predicate));
  }
  setMethodSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadMethod (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> resolveDiagramMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> resolvedSymbol = resolveDiagramDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadDiagram(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveDiagramDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isDiagramSymbolsAlreadyResolved()){
    setDiagramSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedDiagram(foundSymbols, name, modifier, predicate));
  }
  setDiagramSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadDiagram (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> resolveTypeMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> resolvedSymbol = resolveTypeDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadType(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveTypeDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isTypeSymbolsAlreadyResolved()){
    setTypeSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedType(foundSymbols, name, modifier, predicate));
  }
  setTypeSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadType (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> resolveTypeVarMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> resolvedSymbol = resolveTypeVarDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadTypeVar(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveTypeVarDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isTypeVarSymbolsAlreadyResolved()){
    setTypeVarSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedTypeVar(foundSymbols, name, modifier, predicate));
  }
  setTypeVarSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadTypeVar (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> resolveVariableMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> resolvedSymbol = resolveVariableDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadVariable(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveVariableDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isVariableSymbolsAlreadyResolved()){
    setVariableSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedVariable(foundSymbols, name, modifier, predicate));
  }
  setVariableSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadVariable (String name)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> resolveFunctionMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> predicate)

 {
    /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> resolvedSymbol = resolveFunctionDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadFunction(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveFunctionDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isFunctionSymbolsAlreadyResolved()){
    setFunctionSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedFunction(foundSymbols, name, modifier, predicate));
  }
  setFunctionSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadFunction (String name)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void loadFileForModelName (String modelName)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope getEnclosingScope ()

 {
    Log.error("0xA6100x93870 GlobalScope SD4DevelopmentGlobalScope has no EnclosingScope, so you cannot call methodgetEnclosingScope.");
    return null;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope enclosingScope)

 {
    Log.error("0xA6100x93870 GlobalScope SD4DevelopmentGlobalScope has no EnclosingScope, so you cannot call methodsetEnclosingScope.");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String getName ()

 {
    Log.error("0xA6101x38201 Global scopes do not have names.");
    return null;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentName ()

 {
    return false;
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean checkIfContinueAsSubScope (String symbolName)

 {
    return false;
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  Map<String,de.monticore.symboltable.serialization.ISymbolDeSer> getSymbolDeSers ()

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putSymbolDeSer (String key,de.monticore.symboltable.serialization.ISymbolDeSer value)

 {
    getSymbolDeSers().put(key, value);
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getSymbolDeSer (String key)

 {
    return getSymbolDeSers().get(key);
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putOOTypeSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.OOTypeSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putFieldSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.FieldSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putMethodSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.MethodSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putDiagramSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.DiagramSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putTypeSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.TypeSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putTypeVarSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putVariableSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.VariableSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putFunctionSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.FunctionSymbolDeSer());
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getOOTypeSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getFieldSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getMethodSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getDiagramSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getTypeSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getTypeVarSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getVariableSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.ISymbolDeSer getFunctionSymbolDeSer ()

 {
    return getSymbolDeSer("de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope");
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  ISD4DevelopmentGlobalScope getRealThis ()

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.expressions.commonexpressions._visitor.CommonExpressionsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.ocl.oclexpressions._visitor.OCLExpressionsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.symbols.oosymbols._visitor.OOSymbolsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.umlstereotype._visitor.UMLStereotypeTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.visitor.ITraverser visitor)

;
}
