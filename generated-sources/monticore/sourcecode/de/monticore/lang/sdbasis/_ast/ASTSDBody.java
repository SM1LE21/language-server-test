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

 public  class ASTSDBody extends ASTCNode  implements de.monticore.lang.sdbasis._ast.ASTSDBasisNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.lang.sdbasis._ast.ASTSDElement> sDElements
  = new java.util.ArrayList<>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope spannedScope
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTSDBody()
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

      ASTSDBody comp;
    if ((o instanceof ASTSDBody)) {
      comp = (ASTSDBody) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing sDElements
    if (this.sDElements.size() != comp.sDElements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it1 = this.sDElements.iterator();
        Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it2 = comp.sDElements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it1 = this.sDElements.iterator();
        while (it1.hasNext()) {
          de.monticore.lang.sdbasis._ast.ASTSDElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it2 = comp.sDElements.iterator();
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

      ASTSDBody comp;
    if ((o instanceof ASTSDBody)) {
      comp = (ASTSDBody) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing sDElements
    if (this.sDElements.size() != comp.sDElements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it1 = this.sDElements.iterator();
        Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it2 = comp.sDElements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it1 = this.sDElements.iterator();
        while (it1.hasNext()) {
          de.monticore.lang.sdbasis._ast.ASTSDElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.lang.sdbasis._ast.ASTSDElement> it2 = comp.sDElements.iterator();
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
    return true;     

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

    return o instanceof ASTSDBody;


}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTSDBody comp;
    if ((o instanceof ASTSDBody)) {
      comp = (ASTSDBody) o;
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
 public  ASTSDBody deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ASTSDBody deepClone (ASTSDBody result)

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

      getSDElementList().forEach(s -> result.sDElements.add(s.deepClone()));
    
    return result;

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
 public  void clearSDElements ()

 {
    /* generated by template methods.MethodDelegate*/

this.getSDElementList().clear();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addSDElement (de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().add(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addAllSDElements (Collection<? extends de.monticore.lang.sdbasis._ast.ASTSDElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().addAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeSDElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().remove(element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeAllSDElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().removeAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean retainAllSDElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().retainAll(collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean removeIfSDElement (Predicate<? super de.monticore.lang.sdbasis._ast.ASTSDElement> filter)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().removeIf(filter);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void forEachSDElements (Consumer<? super de.monticore.lang.sdbasis._ast.ASTSDElement> action)

 {
    /* generated by template methods.MethodDelegate*/

this.getSDElementList().forEach(action);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addSDElement (int index,de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template methods.MethodDelegate*/

this.getSDElementList().add(index, element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean addAllSDElements (int index,Collection<? extends de.monticore.lang.sdbasis._ast.ASTSDElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().addAll(index, collection);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDElement removeSDElement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().remove(index);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._ast.ASTSDElement setSDElement (int index,de.monticore.lang.sdbasis._ast.ASTSDElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSDElementList().set(index, element);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void replaceAllSDElements (UnaryOperator<de.monticore.lang.sdbasis._ast.ASTSDElement> operator)

 {
    /* generated by template methods.MethodDelegate*/

this.getSDElementList().replaceAll(operator);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void sortSDElements (Comparator<? super de.monticore.lang.sdbasis._ast.ASTSDElement> comparator)

 {
    /* generated by template methods.MethodDelegate*/

this.getSDElementList().sort(comparator);

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSDElementList (List<de.monticore.lang.sdbasis._ast.ASTSDElement> sDElements)

 {
    /* generated by template methods.Set*/

this.sDElements = sDElements;

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
    de.se_rwth.commons.logging.Log.error("0x70000x26094 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x33080 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x46740 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x22471 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x55535 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x90673 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x81701 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
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
    de.se_rwth.commons.logging.Log.error("0x70000x79775 AST node type ASTSDBody expected a visitor of type de.monticore.lang.sdbasis._visitor.SDBasisTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  ASTSDBody _construct ()

 {
    return de.monticore.lang.sdbasis.SDBasisMill.sDBodyBuilder().uncheckedBuild();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._symboltable.ISDBasisScope getSpannedScope ()

 {
    /* generated by template methods.Get*/

return this.spannedScope;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSpannedScope (de.monticore.lang.sdbasis._symboltable.ISDBasisScope spannedScope)

 {
    /* generated by template methods.Set*/

this.spannedScope = spannedScope;

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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.symbols.basicsymbols._symboltable.IBasicSymbolsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.expressions.expressionsbasis._symboltable.IExpressionsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.umlstereotype._symboltable.IUMLStereotypeScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
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
    de.se_rwth.commons.logging.Log.error("0xA7005x10929 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.lang.sdbasis._symboltable.ISDBasisScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.lang.sdbasis._symboltable.ISDBasisScope");
  }
}


}


