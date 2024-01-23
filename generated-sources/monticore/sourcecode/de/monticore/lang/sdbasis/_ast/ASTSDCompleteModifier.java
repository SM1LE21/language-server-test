/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._ast;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.ast.ASTCNode;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;


/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class ASTSDCompleteModifier extends ASTCNode  implements de.monticore.lang.sdbasis._ast.ASTSDModifier,de.monticore.lang.sdbasis._ast.ASTSDBasisNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTSDCompleteModifier()
 {
  /* generated by template cd2java.EmptyBody*/
// empty body

}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean deepEquals (Object o)

 {
         return deepEquals(o, true);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean deepEquals (Object o,boolean forceSameOrder)

 {
    return o instanceof ASTSDCompleteModifier;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean deepEqualsWithComments (Object o)

 {
         return deepEqualsWithComments(o, true);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)

 {
    return o instanceof ASTSDCompleteModifier;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

    return o instanceof ASTSDCompleteModifier;


}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTSDCompleteModifier comp;
    if ((o instanceof ASTSDCompleteModifier)) {
      comp = (ASTSDCompleteModifier) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDCompleteModifier deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDCompleteModifier deepClone (ASTSDCompleteModifier result)

 {
    /* generated by template data.DeepCloneWithParameters*/


  result.set_SourcePositionStart(get_SourcePositionStart().clone());
  result.set_SourcePositionEnd(get_SourcePositionEnd().clone());
  for (de.monticore.ast.Comment x : get_PreCommentList()) {
    result.get_PreCommentList().add(new de.monticore.ast.Comment(x.getText()));
  }
  for (de.monticore.ast.Comment x : get_PostCommentList()) {
    result.get_PostCommentList().add(new de.monticore.ast.Comment(x.getText()));
  }

    
    return result;

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
    de.se_rwth.commons.logging.Log.error("0x70000x94204 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x77402 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x37594 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x81365 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x34237 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x72643 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x17481 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x04051 AST node type ASTSDCompleteModifier expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  ASTSDCompleteModifier _construct ()

 {
    return de.monticore.lang.sdbasis.SDBasisMill.sDCompleteModifierBuilder().uncheckedBuild();
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
    /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.umlstereotype._symboltable.IUMLStereotypeScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.umlstereotype._symboltable.IUMLStereotypeScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sdbasis._symboltable.ISDBasisScope){
    this.enclosingScope = (de.monticore.lang.sdbasis._symboltable.ISDBasisScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x64415 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}


}


