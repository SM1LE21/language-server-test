/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._prettyprint;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SDBasisFullPrettyPrinter  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.prettyprint.IndentPrinter printer
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._visitor.SDBasisTraverser traverser
  
;


    /* generated by template cd2java.Constructor*/
 public  SDBasisFullPrettyPrinter(de.monticore.prettyprint.IndentPrinter printer,boolean printComments)
 {
  /* generated by template _prettyprinter.full.FPPConstructor*/



/* Hookpoint: <Statement>*FPPConstructor:begin */
this.printer = printer;
this.traverser = de.monticore.lang.sdbasis.SDBasisMill.traverser();

this.initializeTraverser(printComments);

/* Hookpoint: <Statement>*FPPConstructor:end */

}

    /* generated by template cd2java.Constructor*/
 public  SDBasisFullPrettyPrinter(de.monticore.prettyprint.IndentPrinter printer)
 {
  this(printer, true);
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.prettyprint.IndentPrinter getPrinter ()

 {
    return this.printer;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._visitor.SDBasisTraverser getTraverser ()

 {
    return this.traverser;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setTraverser (de.monticore.lang.sdbasis._visitor.SDBasisTraverser traverser)

 {
    this.traverser = traverser;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  void initializeTraverser (boolean printComments)

 {
    /* generated by template _prettyprinter.full.FPPTraverserInit*/



SDBasisPrettyPrinter sDBasis = new SDBasisPrettyPrinter(getPrinter(), printComments);
getTraverser().setSDBasisHandler(sDBasis);
getTraverser().add4SDBasis(sDBasis);

// SuperGrammars
    de.monticore.types.mcbasictypes._prettyprint.MCBasicTypesPrettyPrinter mCBasicTypes = new de.monticore.types.mcbasictypes._prettyprint.MCBasicTypesPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setMCBasicTypesHandler(mCBasicTypes);
    getTraverser().add4MCBasicTypes(mCBasicTypes);
    de.monticore.symbols.basicsymbols._prettyprint.BasicSymbolsPrettyPrinter basicSymbols = new de.monticore.symbols.basicsymbols._prettyprint.BasicSymbolsPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setBasicSymbolsHandler(basicSymbols);
    getTraverser().add4BasicSymbols(basicSymbols);
    de.monticore.expressions.expressionsbasis._prettyprint.ExpressionsBasisPrettyPrinter expressionsBasis = new de.monticore.expressions.expressionsbasis._prettyprint.ExpressionsBasisPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setExpressionsBasisHandler(expressionsBasis);
    getTraverser().add4ExpressionsBasis(expressionsBasis);
    de.monticore.umlstereotype._prettyprint.UMLStereotypePrettyPrinter uMLStereotype = new de.monticore.umlstereotype._prettyprint.UMLStereotypePrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setUMLStereotypeHandler(uMLStereotype);
    getTraverser().add4UMLStereotype(uMLStereotype);
    de.monticore.mcbasics._prettyprint.MCBasicsPrettyPrinter mCBasics = new de.monticore.mcbasics._prettyprint.MCBasicsPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setMCBasicsHandler(mCBasics);
    getTraverser().add4MCBasics(mCBasics);
    de.monticore.literals.mcliteralsbasis._prettyprint.MCLiteralsBasisPrettyPrinter mCLiteralsBasis = new de.monticore.literals.mcliteralsbasis._prettyprint.MCLiteralsBasisPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setMCLiteralsBasisHandler(mCLiteralsBasis);
    getTraverser().add4MCLiteralsBasis(mCLiteralsBasis);
    de.monticore.literals.mccommonliterals._prettyprint.MCCommonLiteralsPrettyPrinter mCCommonLiterals = new de.monticore.literals.mccommonliterals._prettyprint.MCCommonLiteralsPrettyPrinter(getPrinter(), printComments)
        ;
    getTraverser().setMCCommonLiteralsHandler(mCCommonLiterals);
    getTraverser().add4MCCommonLiterals(mCCommonLiterals);

/* Hookpoint: <Statement>*FPPTraverserInit:end */

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setPrintComments (boolean printComments)

 {
    /* generated by template _prettyprinter.full.FPPSetPrintComments*/



((SDBasisPrettyPrinter)getTraverser().getSDBasisHandler().get()).setPrintComments(printComments);

// SuperGrammars
    ((de.monticore.types.mcbasictypes._prettyprint.MCBasicTypesPrettyPrinter)getTraverser().getMCBasicTypesHandler().get()).setPrintComments(printComments);
    ((de.monticore.symbols.basicsymbols._prettyprint.BasicSymbolsPrettyPrinter)getTraverser().getBasicSymbolsHandler().get()).setPrintComments(printComments);
    ((de.monticore.expressions.expressionsbasis._prettyprint.ExpressionsBasisPrettyPrinter)getTraverser().getExpressionsBasisHandler().get()).setPrintComments(printComments);
    ((de.monticore.umlstereotype._prettyprint.UMLStereotypePrettyPrinter)getTraverser().getUMLStereotypeHandler().get()).setPrintComments(printComments);
    ((de.monticore.mcbasics._prettyprint.MCBasicsPrettyPrinter)getTraverser().getMCBasicsHandler().get()).setPrintComments(printComments);
    ((de.monticore.literals.mcliteralsbasis._prettyprint.MCLiteralsBasisPrettyPrinter)getTraverser().getMCLiteralsBasisHandler().get()).setPrintComments(printComments);
    ((de.monticore.literals.mccommonliterals._prettyprint.MCCommonLiteralsPrettyPrinter)getTraverser().getMCCommonLiteralsHandler().get()).setPrintComments(printComments);

/* Hookpoint: <Statement>*FPPSetComments:end */

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String prettyprint (de.monticore.ast.ASTNode node)

 {
    /* generated by template _prettyprinter.full.FullPrettyPrintMethod*/
getPrinter().clearBuffer();
getTraverser().clearTraversedElements();
node.accept(getTraverser());

// do not overzealous strip trailing linebreaks, only trailing spaces within the last line
getPrinter().stripTrailing();
return getPrinter().getContent();

}


}

