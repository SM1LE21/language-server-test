/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class FooMillForExample extends FooMill  {

/* Hookpoint: ClassContent:Elements */



    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  OrderBuilder _orderBuilder ()

 {
    /* generated by template sdgenerator.sd2test.MockMillMethods*/



return new OrderMockBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  CustomerBuilder _customerBuilder ()

 {
    /* generated by template sdgenerator.sd2test.MockMillMethods*/



return new CustomerMockBuilder();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  BarMillForFooBuilder _barMillForFooBuilder ()

 {
    /* generated by template sdgenerator.sd2test.MockMillMethods*/



return new BarMillForFooMockBuilder();

}


}


