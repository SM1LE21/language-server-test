/* generated by template cd2java.Enum*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: EnumContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore;



/* Hookpoint: EnumContent:Imports */



/* Hookpoint: EnumContent:Annotations */

 public   enum ExampleMonitorState
{

    CALL_SendConfirmation

,
    CALL_OrderParts

,
    CALL_ShipItems

,
    CALL_SendInvoice

,
    END


;

/* Hookpoint: EnumContent:Elements */

  /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 public  static  ExampleMonitorState[] vals
 = values();



  /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  ExampleMonitorState next ()

 {
     return vals[(this.ordinal()+1) % vals.length];
}

}
