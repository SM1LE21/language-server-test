/* generated from model SD4Development */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._prettyprint;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SD4DevelopmentPrettyPrinter  implements de.monticore.lang.sd4development._visitor.SD4DevelopmentHandler,de.monticore.lang.sd4development._visitor.SD4DevelopmentVisitor2 {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.prettyprint.IndentPrinter printer
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean printComments
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser traverser
  
;


    /* generated by template cd2java.Constructor*/
 public  SD4DevelopmentPrettyPrinter(de.monticore.prettyprint.IndentPrinter printer,boolean printComments)
 {
  this.printer=printer; this.printComments=printComments;
}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDCall node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

 
    /* generated by template _prettyprinter.pp.Alt*/


      
        /* generated by template _prettyprinter.pp.Block*/

             
                if ( node.isTrigger() )
            { // opt: 0 req: 0
            /* generated by template _prettyprinter.pp.Alt*/


      
            /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("trigger ");



            }
            

          
        /* generated by template _prettyprinter.pp.Block*/

             
                if ( node.isStatic() )
            { // opt: 0 req: 0
            /* generated by template _prettyprinter.pp.Alt*/


      
            /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("static ");



            }
            

          
                getPrinter().print(/* generated by template _prettyprinter.pp.Tokens*/

node.getName()   + " ");
          
            if (node.isPresentArguments()) {
                node.getArguments().accept(getTraverser());
            }
    
if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDNew node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

             
                if ( true || node.isPresentSDActivityBar() )
            { // opt: 1 req: 4
            /* generated by template _prettyprinter.pp.Alt*/


      
            if (node.isPresentSDSource()) {
                node.getSDSource().accept(getTraverser());
            }
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("->");

          
                node.getDeclarationType().accept(getTraverser());
          
                getPrinter().print(/* generated by template _prettyprinter.pp.Tokens*/

node.getName()   + " ");
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("=");

          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("new ");

          
                node.getInitializationType().accept(getTraverser());
          
                node.getArguments().accept(getTraverser());
          
        /* generated by template _prettyprinter.pp.Block*/

             
                if ( node.isPresentSDActivityBar() )
            { // opt: 0 req: 1
            /* generated by template _prettyprinter.pp.Alt*/


      
                node.getSDActivityBar().accept(getTraverser());
    
            }
             else
             
                if ( true )
            { // opt: 0 req: 0
            /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().println(";");

    
            }
            

    
            }
            


if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDReturn node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

 
    /* generated by template _prettyprinter.pp.Alt*/


      
        /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("return ");

          
            if (node.isPresentExpression()) {
                node.getExpression().accept(getTraverser());
            }
    
    // Ignoring 0 other alt(s) (with less NonTerminals)


    
if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDThrow node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("throw ");

          
                node.getMCObjectType().accept(getTraverser());
          
            if (node.isPresentArguments()) {
                node.getArguments().accept(getTraverser());
            }
    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDEndCall node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
            if (node.isPresentSDTarget()) {
                node.getSDTarget().accept(getTraverser());
            }
          
                node.getSDEndCallArrow().accept(getTraverser());
          
            if (node.isPresentSDSource()) {
                node.getSDSource().accept(getTraverser());
            }
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print(":");

          
                node.getSDAction().accept(getTraverser());
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().println(";");

    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDEndCallArrow node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("<");

          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("-");

    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDIncompleteExpression node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("...");

    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDClass node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("class ");

          
                node.getMCObjectType().accept(getTraverser());
    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDCondition node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("assert ");

          
                node.getExpression().accept(getTraverser());
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().println(";");

    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void handle (de.monticore.lang.sd4development._ast.ASTSDVariableDeclaration node)

 {
    /* generated by template _prettyprinter.pp.HandleMethod*/

if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPreComments(node, getPrinter());
}

    /* generated by template _prettyprinter.pp.Block*/

    // Simplified always true
    /* generated by template _prettyprinter.pp.Alt*/


      
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().print("let ");

          
                node.getMCType().accept(getTraverser());
          
                getPrinter().print(/* generated by template _prettyprinter.pp.Tokens*/

node.getName()   + " ");
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().print("=");

          
                node.getAssignment().accept(getTraverser());
          
                    /* generated by template _prettyprinter.pp.Terminal*/

    getPrinter().stripTrailing();
    getPrinter().println(";");

    
    // Ignoring 0 other alt(s) (with less NonTerminals)



if (this.isPrintComments()) {
    de.monticore.prettyprint.CommentPrettyPrinter.printPostComments(node, getPrinter());
}

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.prettyprint.IndentPrinter getPrinter ()

 {
    return this.printer;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isPrintComments ()

 {
    return this.printComments;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setPrintComments (boolean printComments)

 {
    this.printComments = printComments;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser getTraverser ()

 {
    return this.traverser;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setTraverser (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser traverser)

 {
    this.traverser = traverser;
}


}


