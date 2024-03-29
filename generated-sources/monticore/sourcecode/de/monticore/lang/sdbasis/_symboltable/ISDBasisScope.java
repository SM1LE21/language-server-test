/* generated from model SDBasis */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._symboltable;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.symboltable.*;


/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface ISDBasisScope extends de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope,de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope,de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope,de.monticore.umlstereotype._symboltable.IUMLStereotypeScope  { 
/* Hookpoint: InterfaceContent:Elements */


  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  List<? extends ISDBasisScope> getSubScopes ()

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSubScope (ISDBasisScope subScope)

 {
    Log.error("0xA7014x15221 The method \"addSubScope\" of interface \"ISDBasisScope\" is not implemented.");
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void removeSubScope (ISDBasisScope subScope)

 {
    Log.error("0xA7013x20536 The method \"removeSubScope\" of interface \"ISDBasisScope\" is not implemented.");
}

  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  ISDBasisScope getEnclosingScope ()

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void setEnclosingScope (ISDBasisScope enclosingScope)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int getSymbolsSize ()

 {
    /* generated by template _symboltable.iscope.GetSymbolSize*/


Set<ISymbol> allSymbols = new HashSet<>();
    allSymbols.addAll(getDiagramSymbols().values());
    allSymbols.addAll(getTypeSymbols().values());
    allSymbols.addAll(getTypeVarSymbols().values());
    allSymbols.addAll(getVariableSymbols().values());
    allSymbols.addAll(getFunctionSymbols().values());
return allSymbols.size();
}

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
 abstract  public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.visitor.ITraverser visitor)

;
}
