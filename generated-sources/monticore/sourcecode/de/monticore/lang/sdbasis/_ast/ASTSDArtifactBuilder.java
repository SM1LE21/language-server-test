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

 public  class ASTSDArtifactBuilder extends de.monticore.ast.ASTNodeBuilder<ASTSDArtifactBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTSDArtifactBuilder realBuilder
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName> packageDeclaration
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> mCImportStatements
  = new java.util.ArrayList<>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._ast.ASTSequenceDiagram sequenceDiagram
  
;


    /* generated by template cd2java.Constructor*/
 public  ASTSDArtifactBuilder()
 {
  this.realBuilder = (ASTSDArtifactBuilder) this;
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifact build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (sequenceDiagram == null) {
                Log.error("0xA4522 sequenceDiagram of type de.monticore.lang.sdbasis._ast.ASTSequenceDiagram must not be null");
            }
          throw new IllegalStateException();
        }
        ASTSDArtifact value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDArtifact();
    if (this.packageDeclaration.isPresent()) {
      value.setPackageDeclaration(this.packageDeclaration.get());
    } else {
      value.setPackageDeclarationAbsent();
    }
    value.setMCImportStatementList(this.mCImportStatements);
    value.setSequenceDiagram(this.sequenceDiagram);
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

        if (sequenceDiagram == null) {
            return false;
        }
        return true;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName getPackageDeclaration ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentPackageDeclaration()) {
        return this.packageDeclaration.get();
    }
    Log.error("0xA7003x74459 get for PackageDeclaration can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPresentPackageDeclaration ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.packageDeclaration.isPresent();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean containsMCImportStatement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().contains(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean containsAllMCImportStatements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().containsAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isEmptyMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().isEmpty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> iteratorMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().iterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int sizeMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().size();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCImportStatement[] toArrayMCImportStatements (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().toArray(array);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Object[] toArrayMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().toArray();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Spliterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> spliteratorMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().spliterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Stream<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> streamMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().stream();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Stream<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> parallelStreamMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().parallelStream();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCImportStatement getMCImportStatement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().get(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int indexOfMCImportStatement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().indexOf(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int lastIndexOfMCImportStatement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsMCImportStatements (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().equals(o);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  int hashCodeMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().hashCode();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ListIterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> listIteratorMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().listIterator();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ListIterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> listIteratorMCImportStatements (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().listIterator(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> subListMCImportStatements (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().subList(start, end);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> getMCImportStatementList ()

 {
    /* generated by template methods.Get*/

return this.mCImportStatements;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSequenceDiagram getSequenceDiagram ()

 {
    /* generated by template methods.Get*/

return this.sequenceDiagram;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder setPackageDeclaration (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName packageDeclaration)

 {
    /* generated by template _ast.builder.opt.Set4ASTBuilderOpt*/

    this.packageDeclaration = Optional.ofNullable(packageDeclaration);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder setPackageDeclarationAbsent ()

 {
    /* generated by template _ast.builder.opt.SetAbsent4ASTBuilderOpt*/

    this.packageDeclaration = Optional.empty();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder clearMCImportStatements ()

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().clear();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addMCImportStatement (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().add(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAllMCImportStatements (Collection<? extends de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeMCImportStatement (Object element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().remove(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeAllMCImportStatements (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder retainAllMCImportStatements (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeIfMCImportStatement (Predicate<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> filter)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder forEachMCImportStatements (Consumer<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> action)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().forEach(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addMCImportStatement (int index,de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().add(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAllMCImportStatements (int index,Collection<? extends de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeMCImportStatement (int index)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().remove(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder setMCImportStatement (int index,de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().set(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder replaceAllMCImportStatements (UnaryOperator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> operator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder sortMCImportStatements (Comparator<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> comparator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getMCImportStatementList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder setMCImportStatementsList (List<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> mCImportStatements)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.mCImportStatements = mCImportStatements;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder setSequenceDiagram (de.monticore.lang.sdbasis._ast.ASTSequenceDiagram sequenceDiagram)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.sequenceDiagram = sequenceDiagram;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifactBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifact uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTSDArtifact value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSDArtifact();
    if (this.packageDeclaration.isPresent()) {
      value.setPackageDeclaration(this.packageDeclaration.get());
    } else {
      value.setPackageDeclarationAbsent();
    }
    value.setMCImportStatementList(this.mCImportStatements);
    value.setSequenceDiagram(this.sequenceDiagram);
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

