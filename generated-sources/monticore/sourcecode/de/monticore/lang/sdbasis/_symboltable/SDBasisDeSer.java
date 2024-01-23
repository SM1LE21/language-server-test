/* generated from model SDBasis */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sdbasis._symboltable;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.symboltable.*;
import de.monticore.symboltable.serialization.*;


/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 public  class SDBasisDeSer  implements de.monticore.symboltable.serialization.IDeSer<de.monticore.lang.sdbasis._symboltable.ISDBasisScope, de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope, de.monticore.lang.sdbasis._symboltable.SDBasisSymbols2Json> {

/* Hookpoint: ClassContent:Elements */



    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String serialize (de.monticore.lang.sdbasis._symboltable.ISDBasisScope toSerialize,de.monticore.lang.sdbasis._symboltable.SDBasisSymbols2Json s2j)

 {
    /* generated by template _symboltable.serialization.scopeDeSer.SerializeS2J4ScopeDeSer*/

  de.monticore.symboltable.serialization.JsonPrinter printer = s2j.getJsonPrinter();
  printer.member(de.monticore.symboltable.serialization.JsonDeSers.IS_SHADOWING_SCOPE, toSerialize.isShadowing());
  return printer.toString();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String serialize (de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope toSerialize,de.monticore.lang.sdbasis._symboltable.SDBasisSymbols2Json s2j)

 {
    /* generated by template _symboltable.serialization.scopeDeSer.SerializeAS4ScopeDeSer*/

  de.monticore.symboltable.serialization.JsonPrinter printer = s2j.getJsonPrinter();
  printer.member("generated-using","www.MontiCore.de technology");
  if(toSerialize.isPresentName()) {
    printer.member(de.monticore.symboltable.serialization.JsonDeSers.NAME, toSerialize.getName());
  }
  if(!toSerialize.getPackageName().isEmpty()) {
    printer.member(de.monticore.symboltable.serialization.JsonDeSers.PACKAGE, toSerialize.getPackageName());
  }
  return printer.toString();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void serializeAddons (de.monticore.lang.sdbasis._symboltable.ISDBasisScope toSerialize,de.monticore.lang.sdbasis._symboltable.SDBasisSymbols2Json s2j)

 {
    /* generated by template cd2java.EmptyBody*/
// empty body

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void serializeAddons (de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope toSerialize,de.monticore.lang.sdbasis._symboltable.SDBasisSymbols2Json s2j)

 {
    /* generated by template cd2java.EmptyBody*/
// empty body

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._symboltable.ISDBasisScope deserializeScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson)

 {
    /* generated by template _symboltable.serialization.scopeDeSer.DeserializeScope*/

  boolean isShadowingScope = scopeJson
      .getBooleanMemberOpt(de.monticore.symboltable.serialization.JsonDeSers.IS_SHADOWING_SCOPE)
      .orElse(false);
  de.monticore.lang.sdbasis._symboltable.ISDBasisScope scope = de.monticore.lang.sdbasis.SDBasisMill.scope();
  scope.setShadowing(isShadowingScope);
  scope.setExportingSymbols(true);


  deserializeAddons(scope,scopeJson);
  deserializeSymbols(scope, scopeJson);
  return scope;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope deserializeArtifactScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson)

 {
    /* generated by template _symboltable.serialization.scopeDeSer.DeserializeArtifactScope*/

  de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope scope = de.monticore.lang.sdbasis.SDBasisMill.artifactScope();
  scope.setPackageName(de.monticore.symboltable.serialization.JsonDeSers.getPackage(scopeJson));
  if (scopeJson.hasStringMember(de.monticore.symboltable.serialization.JsonDeSers.NAME)) {
    scope.setName(scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonDeSers.NAME));
  }
  scope.setExportingSymbols(true);


  deserializeAddons(scope,scopeJson);
  deserializeSymbols(scope, scopeJson);
  return scope;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 protected  void deserializeSymbols (de.monticore.lang.sdbasis._symboltable.ISDBasisScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson)

 {
    /* generated by template _symboltable.serialization.scopeDeSer.DeserializeSymbols*/


  for (de.monticore.symboltable.serialization.json.JsonObject symbol :
      de.monticore.symboltable.serialization.JsonDeSers.getSymbols(scopeJson)) {
    Optional<String> kind = de.monticore.symboltable.serialization.JsonDeSers.getKindOpt(symbol);

    if (!kind.isPresent()) {
      Log.error("0xA1238 Serialized object does not have a kind attribute: '" + symbol + "'.");
      continue;
    }

    de.monticore.symboltable.serialization.ISymbolDeSer deSer = de.monticore.lang.sdbasis.SDBasisMill.globalScope().getSymbolDeSer(kind.get());

    if (null == deSer) {
      Log.debug(
        "0xA1234xx81662 No DeSer found to deserialize symbol of kind `" + kind
        + "`. Falling back to default for symbols of unknown kinds.",
        SDBasisDeSer.class.getName()
      );

      deSer = new SymbolWithScopeOfUnknownKindDeSer(this, de.monticore.lang.sdbasis.SDBasisMill::scope);
      SymbolWithScopeOfUnknownKind s0 = (SymbolWithScopeOfUnknownKind) deSer.deserialize(symbol);
      scope.add(s0);
      scope.addSubScope((de.monticore.lang.sdbasis._symboltable.ISDBasisScope) s0.getSpannedScope());
    }
  else if ("de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol".equals(kind)
        || "de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol".equals(deSer.getSerializedKind())) {
      de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol s0 = (de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol) deSer.deserialize(symbol);
      scope.add(s0);
    }
  else if ("de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol".equals(kind)
        || "de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol".equals(deSer.getSerializedKind())) {
      de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol s1 = (de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol) deSer.deserialize(symbol);
      scope.add(s1);
      scope.addSubScope(s1.getSpannedScope());
    }
  else if ("de.monticore.symbols.basicsymbols._symboltable.TypeSymbol".equals(kind)
        || "de.monticore.symbols.basicsymbols._symboltable.TypeSymbol".equals(deSer.getSerializedKind())) {
      de.monticore.symbols.basicsymbols._symboltable.TypeSymbol s2 = (de.monticore.symbols.basicsymbols._symboltable.TypeSymbol) deSer.deserialize(symbol);
      scope.add(s2);
      scope.addSubScope(s2.getSpannedScope());
    }
  else if ("de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol".equals(kind)
        || "de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol".equals(deSer.getSerializedKind())) {
      de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol s3 = (de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol) deSer.deserialize(symbol);
      scope.add(s3);
    }
  else if ("de.monticore.symbols.basicsymbols._symboltable.VariableSymbol".equals(kind)
        || "de.monticore.symbols.basicsymbols._symboltable.VariableSymbol".equals(deSer.getSerializedKind())) {
      de.monticore.symbols.basicsymbols._symboltable.VariableSymbol s4 = (de.monticore.symbols.basicsymbols._symboltable.VariableSymbol) deSer.deserialize(symbol);
      scope.add(s4);
    }
    else {
      Log.warn("0xA1634xx44279 Unable to integrate deserialization with DeSer for kind `" + kind
        + "`. The following will be ignored: " + symbol);
    }
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void deserializeAddons (de.monticore.lang.sdbasis._symboltable.ISDBasisScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson)

 {
    /* generated by template cd2java.EmptyBody*/
// empty body

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void deserializeAddons (de.monticore.lang.sdbasis._symboltable.ISDBasisArtifactScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson)

 {
    /* generated by template cd2java.EmptyBody*/
// empty body

}


}


