/* generated from model SD4Development */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._auxiliary;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class UMLStereotypeMillForSD4Development extends de.monticore.umlstereotype.UMLStereotypeMill  {

/* Hookpoint: ClassContent:Elements */



    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentArtifactScope _artifactScope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sd4development.SD4DevelopmentMill.artifactScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentGlobalScope _globalScope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sd4development.SD4DevelopmentMill.globalScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sd4development._symboltable.ISD4DevelopmentScope _scope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sd4development.SD4DevelopmentMill.scope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.umlstereotype._visitor.UMLStereotypeTraverser _traverser ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sd4development.SD4DevelopmentMill.traverser();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.umlstereotype._visitor.UMLStereotypeTraverser _inheritanceTraverser ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sd4development.SD4DevelopmentMill.inheritanceTraverser();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  String _prettyPrint (de.monticore.ast.ASTNode node,boolean printComments)

 {
    return de.monticore.lang.sd4development.SD4DevelopmentMill.prettyPrint(node, printComments);
}


}


