/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SDBasisMill  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill mill
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDArtifactBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSequenceDiagramBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDBodyBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDCompleteModifierBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDFreeModifierBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDInitialModifierBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDVisibleModifierBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDObjectBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDObjectSourceBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDObjectTargetBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDSendMessageBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millASTSDActivityBarBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisTraverserImplementation
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisInheritanceHandler
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisScope
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisScopesGenitorDelegator
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisArtifactScope
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisGlobalScope
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisScopesGenitor
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisFullPrettyPrinter
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._prettyprint.SDBasisFullPrettyPrinter fullPrettyPrinter
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  static  SDBasisMill millSDBasisTypeDispatcher
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._util.SDBasisTypeDispatcher typeDispatcher
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisGlobalScope sDBasisGlobalScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  SDBasisMill()
 {
  /* generated by template cd2java.EmptyBody*/
// empty body

}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  SDBasisMill getMill ()

 {
    /* generated by template mill.GetMillMethod*/

  if (mill == null) {
    mill = new SDBasisMill();
  }
  return mill;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  void init ()

 {
    /* generated by template mill.InitMethod*/

    mill = new SDBasisMill();
    de.monticore.types.mcbasictypes.MCBasicTypesMill.initMe(new de.monticore.lang.sdbasis._auxiliary.MCBasicTypesMillForSDBasis());
    de.monticore.symbols.basicsymbols.BasicSymbolsMill.initMe(new de.monticore.lang.sdbasis._auxiliary.BasicSymbolsMillForSDBasis());
    de.monticore.expressions.expressionsbasis.ExpressionsBasisMill.initMe(new de.monticore.lang.sdbasis._auxiliary.ExpressionsBasisMillForSDBasis());
    de.monticore.umlstereotype.UMLStereotypeMill.initMe(new de.monticore.lang.sdbasis._auxiliary.UMLStereotypeMillForSDBasis());
    de.monticore.mcbasics.MCBasicsMill.initMe(new de.monticore.lang.sdbasis._auxiliary.MCBasicsMillForSDBasis());
    de.monticore.literals.mcliteralsbasis.MCLiteralsBasisMill.initMe(new de.monticore.lang.sdbasis._auxiliary.MCLiteralsBasisMillForSDBasis());
    de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.initMe(new de.monticore.lang.sdbasis._auxiliary.MCCommonLiteralsMillForSDBasis());

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDArtifactBuilder sDArtifactBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDArtifactBuilder == null) {
    millASTSDArtifactBuilder = getMill();
  }
  return millASTSDArtifactBuilder._sDArtifactBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDArtifactBuilder _sDArtifactBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDArtifactBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSequenceDiagramBuilder sequenceDiagramBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSequenceDiagramBuilder == null) {
    millASTSequenceDiagramBuilder = getMill();
  }
  return millASTSequenceDiagramBuilder._sequenceDiagramBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSequenceDiagramBuilder _sequenceDiagramBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSequenceDiagramBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDBodyBuilder sDBodyBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDBodyBuilder == null) {
    millASTSDBodyBuilder = getMill();
  }
  return millASTSDBodyBuilder._sDBodyBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDBodyBuilder _sDBodyBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDBodyBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDCompleteModifierBuilder sDCompleteModifierBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDCompleteModifierBuilder == null) {
    millASTSDCompleteModifierBuilder = getMill();
  }
  return millASTSDCompleteModifierBuilder._sDCompleteModifierBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDCompleteModifierBuilder _sDCompleteModifierBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDCompleteModifierBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDFreeModifierBuilder sDFreeModifierBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDFreeModifierBuilder == null) {
    millASTSDFreeModifierBuilder = getMill();
  }
  return millASTSDFreeModifierBuilder._sDFreeModifierBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDFreeModifierBuilder _sDFreeModifierBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDFreeModifierBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDInitialModifierBuilder sDInitialModifierBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDInitialModifierBuilder == null) {
    millASTSDInitialModifierBuilder = getMill();
  }
  return millASTSDInitialModifierBuilder._sDInitialModifierBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDInitialModifierBuilder _sDInitialModifierBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDInitialModifierBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDVisibleModifierBuilder sDVisibleModifierBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDVisibleModifierBuilder == null) {
    millASTSDVisibleModifierBuilder = getMill();
  }
  return millASTSDVisibleModifierBuilder._sDVisibleModifierBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDVisibleModifierBuilder _sDVisibleModifierBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDVisibleModifierBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDObjectBuilder sDObjectBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDObjectBuilder == null) {
    millASTSDObjectBuilder = getMill();
  }
  return millASTSDObjectBuilder._sDObjectBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDObjectBuilder _sDObjectBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDObjectBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDObjectSourceBuilder sDObjectSourceBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDObjectSourceBuilder == null) {
    millASTSDObjectSourceBuilder = getMill();
  }
  return millASTSDObjectSourceBuilder._sDObjectSourceBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDObjectSourceBuilder _sDObjectSourceBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDObjectSourceBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDObjectTargetBuilder sDObjectTargetBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDObjectTargetBuilder == null) {
    millASTSDObjectTargetBuilder = getMill();
  }
  return millASTSDObjectTargetBuilder._sDObjectTargetBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDObjectTargetBuilder _sDObjectTargetBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDObjectTargetBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDSendMessageBuilder sDSendMessageBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDSendMessageBuilder == null) {
    millASTSDSendMessageBuilder = getMill();
  }
  return millASTSDSendMessageBuilder._sDSendMessageBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDSendMessageBuilder _sDSendMessageBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDSendMessageBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._ast.ASTSDActivityBarBuilder sDActivityBarBuilder ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millASTSDActivityBarBuilder == null) {
    millASTSDActivityBarBuilder = getMill();
  }
  return millASTSDActivityBarBuilder._sDActivityBarBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDActivityBarBuilder _sDActivityBarBuilder ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._ast.ASTSDActivityBarBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  String prettyPrint (de.monticore.ast.ASTNode node,boolean printComments)

 {
    /* generated by template mill.PrettyPrintBuilderMethod*/
/*
* Static getter for the pretty printer that delegates to the non static implementation.
* Only two pretty printer objects are created and reused.
* @param printComments Whether comments should be printed
* @return the pretty printer instance
*/

  if (millSDBasisFullPrettyPrinter == null) {
    millSDBasisFullPrettyPrinter = getMill();
    millSDBasisFullPrettyPrinter.fullPrettyPrinter = null; // reset cached
  }
  return millSDBasisFullPrettyPrinter._prettyPrint(node, printComments);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  String _prettyPrint (de.monticore.ast.ASTNode node,boolean printComments)

 {
    /* generated by template mill.PrettyPrintProtectedBuilderMethod*/

  if (fullPrettyPrinter == null) {
    fullPrettyPrinter = new de.monticore.lang.sdbasis._prettyprint.SDBasisFullPrettyPrinter(new de.monticore.prettyprint.IndentPrinter(), false);
  }
  fullPrettyPrinter.setPrintComments(printComments);
  return fullPrettyPrinter.prettyprint(node);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._util.SDBasisTypeDispatcher typeDispatcher ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisTypeDispatcher == null) {
    millSDBasisTypeDispatcher = getMill();
  }
  return millSDBasisTypeDispatcher._typeDispatcher();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._util.SDBasisTypeDispatcher _typeDispatcher ()

 {
    /* generated by template mill.TypeDispatcherGetter*/


if (millSDBasisTypeDispatcher.typeDispatcher == null) {
millSDBasisTypeDispatcher.typeDispatcher = new de.monticore.lang.sdbasis._util.SDBasisTypeDispatcher();
}
return millSDBasisTypeDispatcher.typeDispatcher;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._visitor.SDBasisTraverser traverser ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisTraverserImplementation == null) {
    millSDBasisTraverserImplementation = getMill();
  }
  return millSDBasisTraverserImplementation._traverser();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._visitor.SDBasisTraverser _traverser ()

 {
    return new de.monticore.lang.sdbasis._visitor.SDBasisTraverserImplementation();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._visitor.SDBasisTraverser inheritanceTraverser ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisInheritanceHandler == null) {
    millSDBasisInheritanceHandler = getMill();
  }
  return millSDBasisInheritanceHandler._inheritanceTraverser();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._visitor.SDBasisTraverser _inheritanceTraverser ()

 {
    /* generated by template mill.InheritanceHandlerMethod*/

  de.monticore.lang.sdbasis._visitor.SDBasisTraverserImplementation traverser = new de.monticore.lang.sdbasis._visitor.SDBasisTraverserImplementation();
  traverser.setSDBasisHandler(new de.monticore.lang.sdbasis._visitor.SDBasisInheritanceHandler());
  traverser.setMCBasicTypesHandler(new de.monticore.types.mcbasictypes._visitor.MCBasicTypesInheritanceHandler());
  traverser.setBasicSymbolsHandler(new de.monticore.symbols.basicsymbols._visitor.BasicSymbolsInheritanceHandler());
  traverser.setExpressionsBasisHandler(new de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisInheritanceHandler());
  traverser.setUMLStereotypeHandler(new de.monticore.umlstereotype._visitor.UMLStereotypeInheritanceHandler());
  traverser.setMCBasicsHandler(new de.monticore.mcbasics._visitor.MCBasicsInheritanceHandler());
  traverser.setMCLiteralsBasisHandler(new de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisInheritanceHandler());
  traverser.setMCCommonLiteralsHandler(new de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsInheritanceHandler());
  return traverser;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._symboltable.ISDBasisGlobalScope globalScope ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisGlobalScope == null) {
    millSDBasisGlobalScope = getMill();
  }
  return millSDBasisGlobalScope._globalScope();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisGlobalScope _globalScope ()

 {
    /* generated by template mill.ProtectedGlobalScopeMethod*/

  if(null == sDBasisGlobalScope){
    sDBasisGlobalScope = new de.monticore.lang.sdbasis._symboltable.SDBasisGlobalScope();
  }
  return sDBasisGlobalScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope artifactScope ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisArtifactScope == null) {
    millSDBasisArtifactScope = getMill();
  }
  return millSDBasisArtifactScope._artifactScope();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope _artifactScope ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._symboltable.SDBasisArtifactScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._symboltable.ISDBasisScope scope ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisScope == null) {
    millSDBasisScope = getMill();
  }
  return millSDBasisScope._scope();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope _scope ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._symboltable.SDBasisScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitor scopesGenitor ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisScopesGenitor == null) {
    millSDBasisScopesGenitor = getMill();
  }
  return millSDBasisScopesGenitor._scopesGenitor();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitor _scopesGenitor ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitor();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitorDelegator scopesGenitorDelegator ()

 {
    /* generated by template mill.BuilderMethod*/

  if (millSDBasisScopesGenitorDelegator == null) {
    millSDBasisScopesGenitorDelegator = getMill();
  }
  return millSDBasisScopesGenitorDelegator._scopesGenitorDelegator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitorDelegator _scopesGenitorDelegator ()

 {
    /* generated by template mill.ProtectedBuilderMethod*/

  return new de.monticore.lang.sdbasis._symboltable.SDBasisScopesGenitorDelegator();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCQualifiedNameBuilder mCQualifiedNameBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCQualifiedNameBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCPackageDeclarationBuilder mCPackageDeclarationBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCPackageDeclarationBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCImportStatementBuilder mCImportStatementBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCImportStatementBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveTypeBuilder mCPrimitiveTypeBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCPrimitiveTypeBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCQualifiedTypeBuilder mCQualifiedTypeBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCQualifiedTypeBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCReturnTypeBuilder mCReturnTypeBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCReturnTypeBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.types.mcbasictypes._ast.ASTMCVoidTypeBuilder mCVoidTypeBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.types.mcbasictypes.MCBasicTypesMill.mCVoidTypeBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.DiagramSymbolBuilder diagramSymbolBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.diagramSymbolBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.DiagramSymbolSurrogateBuilder diagramSymbolSurrogateBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.diagramSymbolSurrogateBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.TypeSymbolBuilder typeSymbolBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.typeSymbolBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.TypeSymbolSurrogateBuilder typeSymbolSurrogateBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.typeSymbolSurrogateBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbolBuilder typeVarSymbolBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.typeVarSymbolBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbolSurrogateBuilder typeVarSymbolSurrogateBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.typeVarSymbolSurrogateBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.VariableSymbolBuilder variableSymbolBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.variableSymbolBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.VariableSymbolSurrogateBuilder variableSymbolSurrogateBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.variableSymbolSurrogateBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.FunctionSymbolBuilder functionSymbolBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.functionSymbolBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.symbols.basicsymbols._symboltable.FunctionSymbolSurrogateBuilder functionSymbolSurrogateBuilder ()

 {
    return de.monticore.symbols.basicsymbols.BasicSymbolsMill.functionSymbolSurrogateBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.expressions.expressionsbasis._ast.ASTNameExpressionBuilder nameExpressionBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.expressions.expressionsbasis.ExpressionsBasisMill.nameExpressionBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.expressions.expressionsbasis._ast.ASTLiteralExpressionBuilder literalExpressionBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.expressions.expressionsbasis.ExpressionsBasisMill.literalExpressionBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.expressions.expressionsbasis._ast.ASTArgumentsBuilder argumentsBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.expressions.expressionsbasis.ExpressionsBasisMill.argumentsBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.umlstereotype._ast.ASTStereotypeBuilder stereotypeBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.umlstereotype.UMLStereotypeMill.stereotypeBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.umlstereotype._ast.ASTStereoValueBuilder stereoValueBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.umlstereotype.UMLStereotypeMill.stereoValueBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder nullLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.nullLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder booleanLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.booleanLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder charLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.charLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder stringLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.stringLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder natLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.natLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder signedNatLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedNatLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder basicLongLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicLongLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder signedBasicLongLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicLongLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder basicFloatLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicFloatLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder signedBasicFloatLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicFloatLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder basicDoubleLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicDoubleLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder signedBasicDoubleLiteralBuilder ()

 {
    /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicDoubleLiteralBuilder();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  void initMe (SDBasisMill a)

 {
    /* generated by template mill.InitMeMethod*/

    mill = a;
    millASTSDArtifactBuilder = a;
    millASTSequenceDiagramBuilder = a;
    millASTSDBodyBuilder = a;
    millASTSDCompleteModifierBuilder = a;
    millASTSDFreeModifierBuilder = a;
    millASTSDInitialModifierBuilder = a;
    millASTSDVisibleModifierBuilder = a;
    millASTSDObjectBuilder = a;
    millASTSDObjectSourceBuilder = a;
    millASTSDObjectTargetBuilder = a;
    millASTSDSendMessageBuilder = a;
    millASTSDActivityBarBuilder = a;
    millSDBasisTraverserImplementation = a;
    millSDBasisInheritanceHandler = a;
    millSDBasisScope = a;
    millSDBasisScopesGenitorDelegator = a;
    millSDBasisArtifactScope = a;
    millSDBasisGlobalScope = a;
    millSDBasisScopesGenitor = a;
    millSDBasisFullPrettyPrinter = a;
    millSDBasisTypeDispatcher = a;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  static  void reset ()

 {
    /* generated by template mill.ResetMethod*/

    mill = null;
    millASTSDArtifactBuilder = null;
    millASTSequenceDiagramBuilder = null;
    millASTSDBodyBuilder = null;
    millASTSDCompleteModifierBuilder = null;
    millASTSDFreeModifierBuilder = null;
    millASTSDInitialModifierBuilder = null;
    millASTSDVisibleModifierBuilder = null;
    millASTSDObjectBuilder = null;
    millASTSDObjectSourceBuilder = null;
    millASTSDObjectTargetBuilder = null;
    millASTSDSendMessageBuilder = null;
    millASTSDActivityBarBuilder = null;
    millSDBasisTraverserImplementation = null;
    millSDBasisInheritanceHandler = null;
    millSDBasisScope = null;
    millSDBasisScopesGenitorDelegator = null;
    millSDBasisArtifactScope = null;
    millSDBasisGlobalScope = null;
    millSDBasisScopesGenitor = null;
    millSDBasisFullPrettyPrinter = null;
    millSDBasisTypeDispatcher = null;
    de.monticore.types.mcbasictypes.MCBasicTypesMill.reset();
    de.monticore.symbols.basicsymbols.BasicSymbolsMill.reset();
    de.monticore.expressions.expressionsbasis.ExpressionsBasisMill.reset();
    de.monticore.umlstereotype.UMLStereotypeMill.reset();
    de.monticore.mcbasics.MCBasicsMill.reset();
    de.monticore.literals.mcliteralsbasis.MCLiteralsBasisMill.reset();
    de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.reset();

}


}


