/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._auxiliary;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class UMLStereotypeMillForSDBasis extends de.monticore.umlstereotype.UMLStereotypeMill  {

/* Hookpoint: ClassContent:Elements */



    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope _artifactScope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sdbasis.SDBasisMill.artifactScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisGlobalScope _globalScope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sdbasis.SDBasisMill.globalScope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.lang.sdbasis._symboltable.ISDBasisScope _scope ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sdbasis.SDBasisMill.scope();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.umlstereotype._visitor.UMLStereotypeTraverser _traverser ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sdbasis.SDBasisMill.traverser();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  de.monticore.umlstereotype._visitor.UMLStereotypeTraverser _inheritanceTraverser ()

 {
    /* generated by template mill.ProtectedMethodForSuper*/

  return de.monticore.lang.sdbasis.SDBasisMill.inheritanceTraverser();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  String _prettyPrint (de.monticore.ast.ASTNode node,boolean printComments)

 {
    return de.monticore.lang.sdbasis.SDBasisMill.prettyPrint(node, printComments);
}


}


