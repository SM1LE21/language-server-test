/* generated from model SDBasis */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._cocos;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface SDBasisASTSDBodyCoCo extends de.monticore.lang.sdbasis._visitor.SDBasisVisitor2  { 
/* Hookpoint: InterfaceContent:Elements */


  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  void check (de.monticore.lang.sdbasis._ast.ASTSDBody node)

;
  default /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void visit (de.monticore.lang.sdbasis._ast.ASTSDBody node)

 {
    check(node);
}

}
