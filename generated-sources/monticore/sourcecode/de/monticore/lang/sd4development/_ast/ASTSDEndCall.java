/* generated from model SD4Development */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._ast;


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

 public  class ASTSDEndCall extends ASTCNode  implements de.monticore.lang.sdbasis._ast.ASTSDInteraction,de.monticore.lang.sd4development._ast.ASTSD4DevelopmentNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.lang.sdbasis._ast.ASTSDTarget> sDTarget
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sd4development._ast.ASTSDEndCallArrow sDEndCallArrow
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.lang.sdbasis._ast.ASTSDSource> sDSource
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSDAction sDAction
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTSDEndCall()
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
    /* generated by template data.DeepEqualsWithOrder*/

      ASTSDEndCall comp;
    if ((o instanceof ASTSDEndCall)) {
      comp = (ASTSDEndCall) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing sDTarget   
    if ( this.sDTarget.isPresent() != comp.sDTarget.isPresent() ||
      (this.sDTarget.isPresent() && !this.sDTarget.get().deepEquals(comp.sDTarget.get(), forceSameOrder)) ) {
      return false;
    }
     // comparing sDEndCallArrow
     if ( (this.sDEndCallArrow == null && comp.sDEndCallArrow != null) ||
        (this.sDEndCallArrow != null && !this.sDEndCallArrow.deepEquals(comp.sDEndCallArrow, forceSameOrder)) ) {
        return false;
     }
    // comparing sDSource   
    if ( this.sDSource.isPresent() != comp.sDSource.isPresent() ||
      (this.sDSource.isPresent() && !this.sDSource.get().deepEquals(comp.sDSource.get(), forceSameOrder)) ) {
      return false;
    }
     // comparing sDAction
     if ( (this.sDAction == null && comp.sDAction != null) ||
        (this.sDAction != null && !this.sDAction.deepEquals(comp.sDAction, forceSameOrder)) ) {
        return false;
     }
    return true;     


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
    /* generated by template data.DeepEqualsWithComments*/

      ASTSDEndCall comp;
    if ((o instanceof ASTSDEndCall)) {
      comp = (ASTSDEndCall) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing sDTarget
    if ( this.sDTarget.isPresent() != comp.sDTarget.isPresent() ||
      (this.sDTarget.isPresent() && !this.sDTarget.get().deepEqualsWithComments(comp.sDTarget.get(), forceSameOrder)) ) {
      return false;
    }
      // comparing sDEndCallArrow
      if ( (this.sDEndCallArrow == null && comp.sDEndCallArrow != null) ||
        (this.sDEndCallArrow != null && !this.sDEndCallArrow.deepEqualsWithComments(comp.sDEndCallArrow, forceSameOrder)) ) {
        return false;
      }
    // comparing sDSource
    if ( this.sDSource.isPresent() != comp.sDSource.isPresent() ||
      (this.sDSource.isPresent() && !this.sDSource.get().deepEqualsWithComments(comp.sDSource.get(), forceSameOrder)) ) {
      return false;
    }
      // comparing sDAction
      if ( (this.sDAction == null && comp.sDAction != null) ||
        (this.sDAction != null && !this.sDAction.deepEqualsWithComments(comp.sDAction, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

    return o instanceof ASTSDEndCall;


}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTSDEndCall comp;
    if ((o instanceof ASTSDEndCall)) {
      comp = (ASTSDEndCall) o;
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
 public  ASTSDEndCall deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDEndCall deepClone (ASTSDEndCall result)

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

    if (isPresentSDTarget()){
      result.setSDTarget(getSDTarget().deepClone());
    } else {
      result.setSDTargetAbsent();
    }
      result.setSDEndCallArrow(getSDEndCallArrow().deepClone());
    if (isPresentSDSource()){
      result.setSDSource(getSDSource().deepClone());
    } else {
      result.setSDSourceAbsent();
    }
      result.setSDAction(getSDAction().deepClone());
    
    return result;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDTarget getSDTarget ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentSDTarget()) {
        return this.sDTarget.get();
    }
    Log.error("0xA7003x14225 get for SDTarget can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentSDTarget ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.sDTarget.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sd4development._ast.ASTSDEndCallArrow getSDEndCallArrow ()

 {
    /* generated by template methods.Get*/

return this.sDEndCallArrow;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDSource getSDSource ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentSDSource()) {
        return this.sDSource.get();
    }
    Log.error("0xA7003x73327 get for SDSource can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentSDSource ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.sDSource.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDAction getSDAction ()

 {
    /* generated by template methods.Get*/

return this.sDAction;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDTarget (de.monticore.lang.sdbasis._ast.ASTSDTarget sDTarget)

 {
    /* generated by template methods.opt.Set4Opt*/

this.sDTarget = Optional.ofNullable(sDTarget);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDTargetAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.sDTarget = Optional.empty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDEndCallArrow (de.monticore.lang.sd4development._ast.ASTSDEndCallArrow sDEndCallArrow)

 {
    /* generated by template methods.Set*/

this.sDEndCallArrow = sDEndCallArrow;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDSource (de.monticore.lang.sdbasis._ast.ASTSDSource sDSource)

 {
    /* generated by template methods.opt.Set4Opt*/

this.sDSource = Optional.ofNullable(sDSource);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDSourceAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.sDSource = Optional.empty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDAction (de.monticore.lang.sdbasis._ast.ASTSDAction sDAction)

 {
    /* generated by template methods.Set*/

this.sDAction = sDAction;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x53690 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.lang.sdbasis._visitor.SDBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x81788 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.expressions.commonexpressions._visitor.CommonExpressionsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x99797 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.expressions.commonexpressions._visitor.CommonExpressionsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.ocl.oclexpressions._visitor.OCLExpressionsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x26794 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.ocl.oclexpressions._visitor.OCLExpressionsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.symbols.oosymbols._visitor.OOSymbolsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x71659 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.symbols.oosymbols._visitor.OOSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x57615 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x10137 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x32077 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.umlstereotype._visitor.UMLStereotypeTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x87864 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x07088 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x37168 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x94880 AST node type ASTSDEndCall expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  ASTSDEndCall _construct ()

 {
    return de.monticore.lang.sd4development.SD4DevelopmentMill.sDEndCallBuilder().uncheckedBuild();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope getEnclosingScope ()

 {
    /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope enclosingScope)

 {
    /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.expressions.commonexpressions._symboltable.ICommonExpressionsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.expressions.commonexpressions._symboltable.ICommonExpressionsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.ocl.oclexpressions._symboltable.IOCLExpressionsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.ocl.oclexpressions._symboltable.IOCLExpressionsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.symbols.oosymbols._symboltable.IOOSymbolsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.symbols.oosymbols._symboltable.IOOSymbolsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.umlstereotype._symboltable.IUMLStereotypeScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.umlstereotype._symboltable.IUMLStereotypeScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope){
    this.enclosingScope = (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x97522 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope");
  }
}


}


