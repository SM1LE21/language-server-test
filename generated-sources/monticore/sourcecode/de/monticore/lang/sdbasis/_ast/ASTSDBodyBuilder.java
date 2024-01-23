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

 public  class ASTSDBodyBuilder extends de.monticore.ast.ASTNodeBuilder<ASTSDBodyBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTSDBodyBuilder realBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.lang.sdbasis._ast.ASTSDElement> sDElements
  = new java.util.ArrayList<>()
;


    /* generated by template cd2java.Constructor*/
 public  ASTSDBodyBuilder()
 {
  this.realBuilder = (ASTSDBodyBuilder) this;
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBody build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
          throw new IllegalStateException();
        }
        ASTSDBody value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDBody();
    value.setSDElementList(this.sDElements);
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

        return true;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean containsSDElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().contains(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean containsAllSDElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().containsAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isEmptySDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().isEmpty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> iteratorSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().iterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int sizeSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().size();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDElement[] toArraySDElements (de.monticore.lang.sdbasis._ast.ASTSDElement[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().toArray(array);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Object[] toArraySDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().toArray();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Spliterator<de.monticore.lang.sdbasis._ast.ASTSDElement> spliteratorSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().spliterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Stream<de.monticore.lang.sdbasis._ast.ASTSDElement> streamSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().stream();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Stream<de.monticore.lang.sdbasis._ast.ASTSDElement> parallelStreamSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().parallelStream();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDElement getSDElement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().get(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int indexOfSDElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().indexOf(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int lastIndexOfSDElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsSDElements (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().equals(o);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int hashCodeSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().hashCode();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ListIterator<de.monticore.lang.sdbasis._ast.ASTSDElement> listIteratorSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().listIterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ListIterator<de.monticore.lang.sdbasis._ast.ASTSDElement> listIteratorSDElements (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().listIterator(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.lang.sdbasis._ast.ASTSDElement> subListSDElements (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().subList(start, end);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.lang.sdbasis._ast.ASTSDElement> getSDElementList ()

 {
    /* generated by template methods.Get*/

return this.sDElements;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder clearSDElements ()

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().clear();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addSDElement (de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().add(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAllSDElements (Collection<? extends de.monticore.lang.sdbasis._ast.ASTSDElement> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeSDElement (Object element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().remove(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeAllSDElements (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder retainAllSDElements (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeIfSDElement (Predicate<? super de.monticore.lang.sdbasis._ast.ASTSDElement> filter)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder forEachSDElements (Consumer<? super de.monticore.lang.sdbasis._ast.ASTSDElement> action)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().forEach(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addSDElement (int index,de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().add(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAllSDElements (int index,Collection<? extends de.monticore.lang.sdbasis._ast.ASTSDElement> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeSDElement (int index)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().remove(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder setSDElement (int index,de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().set(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder replaceAllSDElements (UnaryOperator<de.monticore.lang.sdbasis._ast.ASTSDElement> operator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder sortSDElements (Comparator<? super de.monticore.lang.sdbasis._ast.ASTSDElement> comparator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getSDElementList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder setSDElementsList (List<de.monticore.lang.sdbasis._ast.ASTSDElement> sDElements)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.sDElements = sDElements;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBodyBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBody uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTSDBody value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDBody();
    value.setSDElementList(this.sDElements);
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

