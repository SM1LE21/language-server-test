/* generated from model SD4Development */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._ast;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.ast.ASTNode;


/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface ASTSD4DevelopmentNode extends ASTNode  { 
/* Hookpoint: InterfaceContent:Elements */


  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void accept (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser visitor)

;
}
