/* generated from model SD4Development */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._visitor;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface SD4DevelopmentHandler extends de.monticore.visitor.IHandler  { 
/* Hookpoint: InterfaceContent:Elements */


  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser getTraverser ()

;
  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void setTraverser (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser traverser)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDCall node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDCall node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentArguments()) {
        node.getArguments().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDNew node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDNew node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentSDSource()) {
        node.getSDSource().accept(getTraverser());
      }
      if (null != node.getDeclarationType()) {
        node.getDeclarationType().accept(getTraverser());
      }
      if (null != node.getInitializationType()) {
        node.getInitializationType().accept(getTraverser());
      }
      if (null != node.getArguments()) {
        node.getArguments().accept(getTraverser());
      }
      if (node.isPresentSDActivityBar()) {
        node.getSDActivityBar().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDReturn node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDReturn node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentExpression()) {
        node.getExpression().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDThrow node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDThrow node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getMCObjectType()) {
        node.getMCObjectType().accept(getTraverser());
      }
      if (node.isPresentArguments()) {
        node.getArguments().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDEndCall node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDEndCall node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentSDTarget()) {
        node.getSDTarget().accept(getTraverser());
      }
      if (null != node.getSDEndCallArrow()) {
        node.getSDEndCallArrow().accept(getTraverser());
      }
      if (node.isPresentSDSource()) {
        node.getSDSource().accept(getTraverser());
      }
      if (null != node.getSDAction()) {
        node.getSDAction().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDEndCallArrow node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDEndCallArrow node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.




}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDIncompleteExpression node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDIncompleteExpression node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.




}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDClass node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDClass node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getMCObjectType()) {
        node.getMCObjectType().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDCondition node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDCondition node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getExpression()) {
        node.getExpression().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDVariableDeclaration node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._ast.ASTSDVariableDeclaration node)

 {
    /* generated by template _visitor.handler.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getMCType()) {
        node.getMCType().accept(getTraverser());
      }
      if (null != node.getAssignment()) {
        node.getAssignment().accept(getTraverser());
      }


}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSD4DevelopmentNode node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._symboltable.ICommonSD4DevelopmentSymbol node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._symboltable.ICommonSD4DevelopmentSymbol node)

 {
    /* generated by template cd2java.EmptyBody*/
// empty body

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope node)

 {
    /* generated by template _visitor.handler.TraverseScope*/

  // traverse symbols within the scope
  for (de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol s : node.getLocalOOTypeSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.oosymbols._symboltable.FieldSymbol s : node.getLocalFieldSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.oosymbols._symboltable.MethodSymbol s : node.getLocalMethodSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol s : node.getLocalDiagramSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.basicsymbols._symboltable.TypeSymbol s : node.getLocalTypeSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol s : node.getLocalTypeVarSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.basicsymbols._symboltable.VariableSymbol s : node.getLocalVariableSymbols()) {
    s.accept(getTraverser());
  }
  for (de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol s : node.getLocalFunctionSymbols()) {
    s.accept(getTraverser());
  }

  // traverse sub-scopes
  for (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope scope : node.getSubScopes()) {
    scope.accept(getTraverser());
  }
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope node)

 {
    traverse((de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) node);
}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentGlobalScope node)

 {
    /* generated by template _visitor.handler.Handle*/

  getTraverser().visit(node);
  getTraverser().traverse(node);
  getTraverser().endVisit(node);

}

  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void traverse (de.monticore.lang.sd4development._symboltable.ISD4DevelopmentGlobalScope node)

 {
    traverse((de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope) node);
}

}
