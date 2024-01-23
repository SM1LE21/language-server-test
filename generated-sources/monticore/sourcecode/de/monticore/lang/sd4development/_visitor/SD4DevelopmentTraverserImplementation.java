/* generated from model SD4Development */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._visitor;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SD4DevelopmentTraverserImplementation  implements de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  SD4DevelopmentTraverserImplementation realThis
  = (SD4DevelopmentTraverserImplementation) this
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.visitor.IVisitor> iVisitorList
  = new ArrayList<>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.lang.sdbasis._visitor.SDBasisVisitor2> sDBasisVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor2> mCCommonLiteralsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.expressions.commonexpressions._visitor.CommonExpressionsVisitor2> commonExpressionsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.ocl.oclexpressions._visitor.OCLExpressionsVisitor2> oCLExpressionsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.oosymbols._visitor.OOSymbolsVisitor2> oOSymbolsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor2> mCBasicTypesVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._visitor.BasicSymbolsVisitor2> basicSymbolsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisVisitor2> expressionsBasisVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.umlstereotype._visitor.UMLStereotypeVisitor2> uMLStereotypeVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.mcbasics._visitor.MCBasicsVisitor2> mCBasicsVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor2> mCLiteralsBasisVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2> sD4DevelopmentVisitorList
  = new ArrayList<>();
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.lang.sdbasis._visitor.SDBasisHandler> sDBasisHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsHandler> mCCommonLiteralsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.expressions.commonexpressions._visitor.CommonExpressionsHandler> commonExpressionsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.ocl.oclexpressions._visitor.OCLExpressionsHandler> oCLExpressionsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.symbols.oosymbols._visitor.OOSymbolsHandler> oOSymbolsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.types.mcbasictypes._visitor.MCBasicTypesHandler> mCBasicTypesHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.symbols.basicsymbols._visitor.BasicSymbolsHandler> basicSymbolsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisHandler> expressionsBasisHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.umlstereotype._visitor.UMLStereotypeHandler> uMLStereotypeHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.mcbasics._visitor.MCBasicsHandler> mCBasicsHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisHandler> mCLiteralsBasisHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.lang.sd4development._visitor.SD4DevelopmentHandler> sD4DevelopmentHandler
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Set<Object> traversedElements
  = new HashSet<Object>()
;



    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4SDBasis (de.monticore.lang.sdbasis._visitor.SDBasisVisitor2 sDBasisVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.sDBasisVisitorList.add(sDBasisVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.lang.sdbasis._visitor.SDBasisVisitor2> getSDBasisVisitorList ()

 {
    return sDBasisVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4MCCommonLiterals (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor2 mCCommonLiteralsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.mCCommonLiteralsVisitorList.add(mCCommonLiteralsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor2> getMCCommonLiteralsVisitorList ()

 {
    return mCCommonLiteralsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4CommonExpressions (de.monticore.expressions.commonexpressions._visitor.CommonExpressionsVisitor2 commonExpressionsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.commonExpressionsVisitorList.add(commonExpressionsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.expressions.commonexpressions._visitor.CommonExpressionsVisitor2> getCommonExpressionsVisitorList ()

 {
    return commonExpressionsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4OCLExpressions (de.monticore.ocl.oclexpressions._visitor.OCLExpressionsVisitor2 oCLExpressionsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.oCLExpressionsVisitorList.add(oCLExpressionsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.ocl.oclexpressions._visitor.OCLExpressionsVisitor2> getOCLExpressionsVisitorList ()

 {
    return oCLExpressionsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4OOSymbols (de.monticore.symbols.oosymbols._visitor.OOSymbolsVisitor2 oOSymbolsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.oOSymbolsVisitorList.add(oOSymbolsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._visitor.OOSymbolsVisitor2> getOOSymbolsVisitorList ()

 {
    return oOSymbolsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4MCBasicTypes (de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor2 mCBasicTypesVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.mCBasicTypesVisitorList.add(mCBasicTypesVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor2> getMCBasicTypesVisitorList ()

 {
    return mCBasicTypesVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4BasicSymbols (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsVisitor2 basicSymbolsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.basicSymbolsVisitorList.add(basicSymbolsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._visitor.BasicSymbolsVisitor2> getBasicSymbolsVisitorList ()

 {
    return basicSymbolsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4ExpressionsBasis (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisVisitor2 expressionsBasisVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.expressionsBasisVisitorList.add(expressionsBasisVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisVisitor2> getExpressionsBasisVisitorList ()

 {
    return expressionsBasisVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4UMLStereotype (de.monticore.umlstereotype._visitor.UMLStereotypeVisitor2 uMLStereotypeVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.uMLStereotypeVisitorList.add(uMLStereotypeVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.umlstereotype._visitor.UMLStereotypeVisitor2> getUMLStereotypeVisitorList ()

 {
    return uMLStereotypeVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4MCBasics (de.monticore.mcbasics._visitor.MCBasicsVisitor2 mCBasicsVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.mCBasicsVisitorList.add(mCBasicsVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.mcbasics._visitor.MCBasicsVisitor2> getMCBasicsVisitorList ()

 {
    return mCBasicsVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4MCLiteralsBasis (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor2 mCLiteralsBasisVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.mCLiteralsBasisVisitorList.add(mCLiteralsBasisVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor2> getMCLiteralsBasisVisitorList ()

 {
    return mCLiteralsBasisVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4SD4Development (de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2 sD4DevelopmentVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.sD4DevelopmentVisitorList.add(sD4DevelopmentVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2> getSD4DevelopmentVisitorList ()

 {
    return sD4DevelopmentVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDBasisHandler (de.monticore.lang.sdbasis._visitor.SDBasisHandler sDBasisHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.sDBasisHandler = Optional.ofNullable(sDBasisHandler);
  if (this.sDBasisHandler.isPresent()) {
    this.sDBasisHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.lang.sdbasis._visitor.SDBasisHandler> getSDBasisHandler ()

 {
    return sDBasisHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setMCCommonLiteralsHandler (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsHandler mCCommonLiteralsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.mCCommonLiteralsHandler = Optional.ofNullable(mCCommonLiteralsHandler);
  if (this.mCCommonLiteralsHandler.isPresent()) {
    this.mCCommonLiteralsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsHandler> getMCCommonLiteralsHandler ()

 {
    return mCCommonLiteralsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setCommonExpressionsHandler (de.monticore.expressions.commonexpressions._visitor.CommonExpressionsHandler commonExpressionsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.commonExpressionsHandler = Optional.ofNullable(commonExpressionsHandler);
  if (this.commonExpressionsHandler.isPresent()) {
    this.commonExpressionsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.expressions.commonexpressions._visitor.CommonExpressionsHandler> getCommonExpressionsHandler ()

 {
    return commonExpressionsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setOCLExpressionsHandler (de.monticore.ocl.oclexpressions._visitor.OCLExpressionsHandler oCLExpressionsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.oCLExpressionsHandler = Optional.ofNullable(oCLExpressionsHandler);
  if (this.oCLExpressionsHandler.isPresent()) {
    this.oCLExpressionsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.ocl.oclexpressions._visitor.OCLExpressionsHandler> getOCLExpressionsHandler ()

 {
    return oCLExpressionsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setOOSymbolsHandler (de.monticore.symbols.oosymbols._visitor.OOSymbolsHandler oOSymbolsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.oOSymbolsHandler = Optional.ofNullable(oOSymbolsHandler);
  if (this.oOSymbolsHandler.isPresent()) {
    this.oOSymbolsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.symbols.oosymbols._visitor.OOSymbolsHandler> getOOSymbolsHandler ()

 {
    return oOSymbolsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setMCBasicTypesHandler (de.monticore.types.mcbasictypes._visitor.MCBasicTypesHandler mCBasicTypesHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.mCBasicTypesHandler = Optional.ofNullable(mCBasicTypesHandler);
  if (this.mCBasicTypesHandler.isPresent()) {
    this.mCBasicTypesHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.types.mcbasictypes._visitor.MCBasicTypesHandler> getMCBasicTypesHandler ()

 {
    return mCBasicTypesHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setBasicSymbolsHandler (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsHandler basicSymbolsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.basicSymbolsHandler = Optional.ofNullable(basicSymbolsHandler);
  if (this.basicSymbolsHandler.isPresent()) {
    this.basicSymbolsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.symbols.basicsymbols._visitor.BasicSymbolsHandler> getBasicSymbolsHandler ()

 {
    return basicSymbolsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setExpressionsBasisHandler (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisHandler expressionsBasisHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.expressionsBasisHandler = Optional.ofNullable(expressionsBasisHandler);
  if (this.expressionsBasisHandler.isPresent()) {
    this.expressionsBasisHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisHandler> getExpressionsBasisHandler ()

 {
    return expressionsBasisHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setUMLStereotypeHandler (de.monticore.umlstereotype._visitor.UMLStereotypeHandler uMLStereotypeHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.uMLStereotypeHandler = Optional.ofNullable(uMLStereotypeHandler);
  if (this.uMLStereotypeHandler.isPresent()) {
    this.uMLStereotypeHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.umlstereotype._visitor.UMLStereotypeHandler> getUMLStereotypeHandler ()

 {
    return uMLStereotypeHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setMCBasicsHandler (de.monticore.mcbasics._visitor.MCBasicsHandler mCBasicsHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.mCBasicsHandler = Optional.ofNullable(mCBasicsHandler);
  if (this.mCBasicsHandler.isPresent()) {
    this.mCBasicsHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.mcbasics._visitor.MCBasicsHandler> getMCBasicsHandler ()

 {
    return mCBasicsHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setMCLiteralsBasisHandler (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisHandler mCLiteralsBasisHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.mCLiteralsBasisHandler = Optional.ofNullable(mCLiteralsBasisHandler);
  if (this.mCLiteralsBasisHandler.isPresent()) {
    this.mCLiteralsBasisHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisHandler> getMCLiteralsBasisHandler ()

 {
    return mCLiteralsBasisHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSD4DevelopmentHandler (de.monticore.lang.sd4development._visitor.SD4DevelopmentHandler sD4DevelopmentHandler)

 {
    /* generated by template _visitor.traverser.SetHandler*/

  this.sD4DevelopmentHandler = Optional.ofNullable(sD4DevelopmentHandler);
  if (this.sD4DevelopmentHandler.isPresent()) {
    this.sD4DevelopmentHandler.get().setTraverser(this);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Optional<de.monticore.lang.sd4development._visitor.SD4DevelopmentHandler> getSD4DevelopmentHandler ()

 {
    return sD4DevelopmentHandler;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void add4IVisitor (de.monticore.visitor.IVisitor iVisitor)

 {
    /* generated by template _visitor.traverser.AddVisitor*/

  this.iVisitorList.add(iVisitor);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.visitor.IVisitor> getIVisitorList ()

 {
    return iVisitorList;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Set<Object> getTraversedElements ()

 {
    return traversedElements;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setTraversedElements (Set<Object> traversedElements)

 {
    this.traversedElements = traversedElements;
}


}


