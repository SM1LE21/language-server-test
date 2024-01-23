/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._symboltable;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.symboltable.*;


/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SDBasisScope  implements de.monticore.lang.sdbasis._symboltable.ISDBasisScope {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symboltable.SymbolWithScopeOfUnknownKind> unknownSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> diagramSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> typeSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> typeVarSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> variableSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> functionSymbols
  = com.google.common.collect.LinkedListMultimap.create()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean unknownSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean diagramSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean typeSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean typeVarSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean variableSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean functionSymbolsAlreadyResolved
  = false
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.symboltable.IScopeSpanningSymbol> spanningSymbol
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean shadowing
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean exportingSymbols
  = true
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean ordered
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<String> name
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.ast.ASTNode> astNode
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.lang.sdbasis._symboltable.ISDBasisScope> subScopes
  = new java.util.ArrayList<>()
;


    /* generated by template cd2java.Constructor*/
 public  SDBasisScope()
 {
  super();
    this.name = Optional.empty();
}

    /* generated by template cd2java.Constructor*/
 public  SDBasisScope(boolean shadowing)
 {
  this.shadowing = shadowing;
    this.name = Optional.empty();
}

    /* generated by template cd2java.Constructor*/
 public  SDBasisScope(de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope)
 {
  this(enclosingScope, false);
}

    /* generated by template cd2java.Constructor*/
 public  SDBasisScope(de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope,boolean shadowing)
 {
  this.setEnclosingScope(enclosingScope);
    this.shadowing = shadowing; 
    this.name = Optional.empty();
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symboltable.SymbolWithScopeOfUnknownKind symbol)

 {
    this.unknownSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symboltable.SymbolWithScopeOfUnknownKind symbol)

 {
    this.unknownSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symboltable.SymbolWithScopeOfUnknownKind> getUnknownSymbols ()

 {
    return this.unknownSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol symbol)

 {
    this.diagramSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol symbol)

 {
    this.diagramSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> getDiagramSymbols ()

 {
    return this.diagramSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symbols.basicsymbols._symboltable.TypeSymbol symbol)

 {
    this.typeSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symbols.basicsymbols._symboltable.TypeSymbol symbol)

 {
    this.typeSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> getTypeSymbols ()

 {
    return this.typeSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol symbol)

 {
    this.typeVarSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol symbol)

 {
    this.typeVarSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> getTypeVarSymbols ()

 {
    return this.typeVarSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symbols.basicsymbols._symboltable.VariableSymbol symbol)

 {
    this.variableSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symbols.basicsymbols._symboltable.VariableSymbol symbol)

 {
    this.variableSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> getVariableSymbols ()

 {
    return this.variableSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add (de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol symbol)

 {
    this.functionSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void remove (de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol symbol)

 {
    this.functionSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  com.google.common.collect.LinkedListMultimap<String,de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> getFunctionSymbols ()

 {
    return this.functionSymbols;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isUnknownSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.unknownSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setUnknownSymbolsAlreadyResolved (boolean unknownSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.unknownSymbolsAlreadyResolved = unknownSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isDiagramSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.diagramSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setDiagramSymbolsAlreadyResolved (boolean diagramSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.diagramSymbolsAlreadyResolved = diagramSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isTypeSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.typeSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setTypeSymbolsAlreadyResolved (boolean typeSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.typeSymbolsAlreadyResolved = typeSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isTypeVarSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.typeVarSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setTypeVarSymbolsAlreadyResolved (boolean typeVarSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.typeVarSymbolsAlreadyResolved = typeVarSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isVariableSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.variableSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setVariableSymbolsAlreadyResolved (boolean variableSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.variableSymbolsAlreadyResolved = variableSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isFunctionSymbolsAlreadyResolved ()

 {
    /* generated by template methods.Get*/

return this.functionSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setFunctionSymbolsAlreadyResolved (boolean functionSymbolsAlreadyResolved)

 {
    /* generated by template methods.Set*/

this.functionSymbolsAlreadyResolved = functionSymbolsAlreadyResolved;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._symboltable.ISDBasisScope getEnclosingScope ()

 {
    /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope)

 {
    /* generated by template _symboltable.scope.SetEnclosingScope*/
if (this.enclosingScope != null && enclosingScope != null) {
if (this.enclosingScope == enclosingScope) {
      return;
    }
    Log.warn("0xA1042 Scope \"" + getName() + "\" has already an enclosing scope.");
  }

  // remove this scope from current (old) enclosing scope, if exists.
if (this.enclosingScope != null) {
this.enclosingScope.removeSubScope(this);
  }

  // add this scope to new enclosing scope, if exists.
if (enclosingScope != null) {
enclosingScope.addSubScope(this);
  }

  // set new enclosing scope (or empty)
  this.enclosingScope = enclosingScope;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.IScopeSpanningSymbol getSpanningSymbol ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentSpanningSymbol()) {
        return this.spanningSymbol.get();
    }
    Log.error("0xA7003x90880 get for SpanningSymbol can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentSpanningSymbol ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.spanningSymbol.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)

 {
    /* generated by template _symboltable.scope.SetSpanningSymbol*/

  /* generated by template methods.opt.Set4Opt*/

this.spanningSymbol = Optional.ofNullable(spanningSymbol);

  setName(spanningSymbol.getName());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSpanningSymbolAbsent ()

 {
    /* generated by template _symboltable.scope.SetSpanningSymbolAbsent*/

  /* generated by template methods.opt.SetAbsent*/

this.spanningSymbol = Optional.empty();

  setNameAbsent();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isShadowing ()

 {
    /* generated by template methods.Get*/

return this.shadowing;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setShadowing (boolean shadowing)

 {
    /* generated by template methods.Set*/

this.shadowing = shadowing;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isExportingSymbols ()

 {
    /* generated by template methods.Get*/

return this.exportingSymbols;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setExportingSymbols (boolean exportingSymbols)

 {
    /* generated by template methods.Set*/

this.exportingSymbols = exportingSymbols;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isOrdered ()

 {
    /* generated by template methods.Get*/

return this.ordered;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setOrdered (boolean ordered)

 {
    /* generated by template methods.Set*/

this.ordered = ordered;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String getName ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentName()) {
        return this.name.get();
    }
    Log.error("0xA7003x14796 get for Name can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentName ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.name.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setName (String name)

 {
    /* generated by template methods.opt.Set4Opt*/

this.name = Optional.ofNullable(name);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setNameAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.name = Optional.empty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.ast.ASTNode getAstNode ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentAstNode()) {
        return this.astNode.get();
    }
    Log.error("0xA7003x78297 get for AstNode can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentAstNode ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.astNode.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAstNode (de.monticore.ast.ASTNode astNode)

 {
    /* generated by template methods.opt.Set4Opt*/

this.astNode = Optional.ofNullable(astNode);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAstNodeAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.astNode = Optional.empty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.lang.sdbasis._symboltable.ISDBasisScope subScope)

 {
    /* generated by template _symboltable.scope.AddSubScope*/
  if (!this.subScopes.contains(subScope)) {
    this.subScopes.add(subScope);
    subScope.setEnclosingScope(this);
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.lang.sdbasis._symboltable.ISDBasisScope subScope)

 {
    /* generated by template _symboltable.scope.RemoveSubScope*/
  if (this.subScopes.contains(subScope)) {
    this.subScopes.remove(subScope);
    if (subScope.getEnclosingScope() != null && subScope.getEnclosingScope() == this) {
      subScope.setEnclosingScope(null);
    }
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.lang.sdbasis._symboltable.ISDBasisScope> getSubScopes ()

 {
    /* generated by template _symboltable.scope.GetSubScopes*/
  return java.util.List.copyOf(subScopes);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSubScopes (List<de.monticore.lang.sdbasis._symboltable.ISDBasisScope> subScopes)

 {
    /* generated by template _symboltable.scope.SetSubScopes*/
  this.subScopes.forEach(this::removeSubScope);
  subScopes.forEach(this::addSubScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.umlstereotype._symboltable.IUMLStereotypeScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.umlstereotype._symboltable.IUMLStereotypeScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.umlstereotype._symboltable.IUMLStereotypeScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)

 {
    this.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)

 {
    this.removeSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) subScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope newEnclosingScope)

 {
    this.setEnclosingScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) newEnclosingScope);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> resolveDiagramSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> predicate)

 {
    /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol> res = new ArrayList<>();
  return res;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> resolveTypeSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> predicate)

 {
    /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<de.monticore.symbols.basicsymbols._symboltable.TypeSymbol> res = new ArrayList<>();
  res.addAll(resolveTypeVarLocallyMany(foundSymbols, name, modifier, x -> predicate.test(x)));
  return res;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> resolveTypeVarSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> predicate)

 {
    /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol> res = new ArrayList<>();
  return res;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> resolveVariableSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> predicate)

 {
    /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<de.monticore.symbols.basicsymbols._symboltable.VariableSymbol> res = new ArrayList<>();
  return res;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> resolveFunctionSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> predicate)

 {
    /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol> res = new ArrayList<>();
  return res;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x32188 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x35942 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x80102 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.umlstereotype._visitor.UMLStereotypeTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x40917 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x82947 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x15491 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x85943 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x28333 Scope type SDBasisScope expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}


}


