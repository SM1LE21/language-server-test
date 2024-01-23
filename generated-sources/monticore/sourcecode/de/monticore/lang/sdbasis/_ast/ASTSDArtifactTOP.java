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

 abstract  public  class ASTSDArtifactTOP extends ASTCNode  implements de.monticore.lang.sdbasis._ast.ASTSDBasisNode {

/* Hookpoint: ClassContent:Elements */

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

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTSDArtifactTOP()
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

      ASTSDArtifact comp;
    if ((o instanceof ASTSDArtifact)) {
      comp = (ASTSDArtifact) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing packageDeclaration   
    if ( this.packageDeclaration.isPresent() != comp.packageDeclaration.isPresent() ||
      (this.packageDeclaration.isPresent() && !this.packageDeclaration.get().deepEquals(comp.packageDeclaration.get(), forceSameOrder)) ) {
      return false;
    }
    // comparing mCImportStatements
    if (this.mCImportStatements.size() != comp.mCImportStatements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it1 = this.mCImportStatements.iterator();
        Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it2 = comp.mCImportStatements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it1 = this.mCImportStatements.iterator();
        while (it1.hasNext()) {
          de.monticore.types.mcbasictypes._ast.ASTMCImportStatement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it2 = comp.mCImportStatements.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
     // comparing sequenceDiagram
     if ( (this.sequenceDiagram == null && comp.sequenceDiagram != null) ||
        (this.sequenceDiagram != null && !this.sequenceDiagram.deepEquals(comp.sequenceDiagram, forceSameOrder)) ) {
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

      ASTSDArtifact comp;
    if ((o instanceof ASTSDArtifact)) {
      comp = (ASTSDArtifact) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing packageDeclaration
    if ( this.packageDeclaration.isPresent() != comp.packageDeclaration.isPresent() ||
      (this.packageDeclaration.isPresent() && !this.packageDeclaration.get().deepEqualsWithComments(comp.packageDeclaration.get(), forceSameOrder)) ) {
      return false;
    }
    // comparing mCImportStatements
    if (this.mCImportStatements.size() != comp.mCImportStatements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it1 = this.mCImportStatements.iterator();
        Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it2 = comp.mCImportStatements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it1 = this.mCImportStatements.iterator();
        while (it1.hasNext()) {
          de.monticore.types.mcbasictypes._ast.ASTMCImportStatement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> it2 = comp.mCImportStatements.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
      // comparing sequenceDiagram
      if ( (this.sequenceDiagram == null && comp.sequenceDiagram != null) ||
        (this.sequenceDiagram != null && !this.sequenceDiagram.deepEqualsWithComments(comp.sequenceDiagram, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

    return o instanceof ASTSDArtifact;


}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTSDArtifact comp;
    if ((o instanceof ASTSDArtifact)) {
      comp = (ASTSDArtifact) o;
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
 public  ASTSDArtifact deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDArtifact deepClone (ASTSDArtifact result)

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

    if (isPresentPackageDeclaration()){
      result.setPackageDeclaration(getPackageDeclaration().deepClone());
    } else {
      result.setPackageDeclarationAbsent();
    }
      getMCImportStatementList().forEach(s -> result.mCImportStatements.add(s.deepClone()));
      result.setSequenceDiagram(getSequenceDiagram().deepClone());
    
    return result;

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
 public  void setPackageDeclaration (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName packageDeclaration)

 {
    /* generated by template methods.opt.Set4Opt*/

this.packageDeclaration = Optional.ofNullable(packageDeclaration);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setPackageDeclarationAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.packageDeclaration = Optional.empty();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void clearMCImportStatements ()

 {
    /* generated by template methods.MethodDelegate*/

this.getMCImportStatementList().clear();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addMCImportStatement (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().add(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addAllMCImportStatements (Collection<? extends de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().addAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeMCImportStatement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().remove(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeAllMCImportStatements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().removeAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean retainAllMCImportStatements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().retainAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeIfMCImportStatement (Predicate<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> filter)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().removeIf(filter);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void forEachMCImportStatements (Consumer<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> action)

 {
    /* generated by template methods.MethodDelegate*/

this.getMCImportStatementList().forEach(action);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addMCImportStatement (int index,de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template methods.MethodDelegate*/

this.getMCImportStatementList().add(index, element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addAllMCImportStatements (int index,Collection<? extends de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().addAll(index, collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCImportStatement removeMCImportStatement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().remove(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.types.mcbasictypes._ast.ASTMCImportStatement setMCImportStatement (int index,de.monticore.types.mcbasictypes._ast.ASTMCImportStatement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getMCImportStatementList().set(index, element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void replaceAllMCImportStatements (UnaryOperator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> operator)

 {
    /* generated by template methods.MethodDelegate*/

this.getMCImportStatementList().replaceAll(operator);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void sortMCImportStatements (Comparator<? super de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> comparator)

 {
    /* generated by template methods.MethodDelegate*/

this.getMCImportStatementList().sort(comparator);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setMCImportStatementList (List<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> mCImportStatements)

 {
    /* generated by template methods.Set*/

this.mCImportStatements = mCImportStatements;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSequenceDiagram (de.monticore.lang.sdbasis._ast.ASTSequenceDiagram sequenceDiagram)

 {
    /* generated by template methods.Set*/

this.sequenceDiagram = sequenceDiagram;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTSDArtifact must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTSDArtifact) {
      visitor.handle((ASTSDArtifact) this);
    } else {
      throw new UnsupportedOperationException("0xA7011x50903 Only handwritten class ASTSDArtifact is supported for the visitor");
    }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sdbasis._visitor.SDBasisTraverser) {
    accept((de.monticore.lang.sdbasis._visitor.SDBasisTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0x70000x97954 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x06760 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x04060 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x32023 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x02623 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x69215 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x92523 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x47729 AST node type ASTSDArtifact expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  ASTSDArtifact _construct ()

 {
    return de.monticore.lang.sdbasis.SDBasisMill.sDArtifactBuilder().uncheckedBuild();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.umlstereotype._symboltable.IUMLStereotypeScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92321 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}


}

