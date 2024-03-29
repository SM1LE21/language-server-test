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

 public  class ASTSDVariableDeclarationBuilder extends de.monticore.ast.ASTNodeBuilder<ASTSDVariableDeclarationBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTSDVariableDeclarationBuilder realBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.types.mcbasictypes._ast.ASTMCType mCType
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.expressions.expressionsbasis._ast.ASTExpression assignment
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  String name
  
;


    /* generated by template cd2java.Constructor*/
 public  ASTSDVariableDeclarationBuilder()
 {
  this.realBuilder = (ASTSDVariableDeclarationBuilder) this;
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclaration build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (mCType == null) {
                Log.error("0xA4522 mCType of type de.monticore.types.mcbasictypes._ast.ASTMCType must not be null");
            }
            if (assignment == null) {
                Log.error("0xA4522 assignment of type de.monticore.expressions.expressionsbasis._ast.ASTExpression must not be null");
            }
            if (name == null) {
                Log.error("0xA4522 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTSDVariableDeclaration value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDVariableDeclaration();
    value.setMCType(this.mCType);
    value.setAssignment(this.assignment);
    value.setName(this.name);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isValid ()

 {
    /* generated by template _ast.builder.IsValidMethod*/

        if (mCType == null) {
            return false;
        }
        if (assignment == null) {
            return false;
        }
        if (name == null) {
            return false;
        }
        return true;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCType getMCType ()

 {
    /* generated by template methods.Get*/

return this.mCType;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.expressions.expressionsbasis._ast.ASTExpression getAssignment ()

 {
    /* generated by template methods.Get*/

return this.assignment;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String getName ()

 {
    /* generated by template methods.Get*/

return this.name;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder setMCType (de.monticore.types.mcbasictypes._ast.ASTMCType mCType)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.mCType = mCType;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder setAssignment (de.monticore.expressions.expressionsbasis._ast.ASTExpression assignment)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.assignment = assignment;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder setName (String name)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclarationBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDVariableDeclaration uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTSDVariableDeclaration value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDVariableDeclaration();
    value.setMCType(this.mCType);
    value.setAssignment(this.assignment);
    value.setName(this.name);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}


}


