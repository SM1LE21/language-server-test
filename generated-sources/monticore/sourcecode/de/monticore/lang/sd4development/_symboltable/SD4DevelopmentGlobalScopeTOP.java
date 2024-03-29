/* generated from model SD4Development */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.lang.sd4development._symboltable;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 abstract  public  class SD4DevelopmentGlobalScopeTOP extends de.monticore.lang.sd4development._symboltable.SD4DevelopmentScope  implements de.monticore.lang.sd4development._symboltable.ISD4DevelopmentGlobalScope {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.io.paths.MCPath symbolPath
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  String fileExt
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 public  de.monticore.symboltable.serialization.IDeSer deSer
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Map<String,de.monticore.symboltable.serialization.ISymbolDeSer> symbolDeSers
   = com.google.common.collect.Maps.newHashMap()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  SD4DevelopmentSymbols2Json symbols2Json
  
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  Set<String> cache
  = new java.util.HashSet<>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.oosymbols._symboltable.IOOTypeSymbolResolver> adaptedOOTypeSymbolResolver
   = new ArrayList<de.monticore.symbols.oosymbols._symboltable.IOOTypeSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.oosymbols._symboltable.IFieldSymbolResolver> adaptedFieldSymbolResolver
   = new ArrayList<de.monticore.symbols.oosymbols._symboltable.IFieldSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.oosymbols._symboltable.IMethodSymbolResolver> adaptedMethodSymbolResolver
   = new ArrayList<de.monticore.symbols.oosymbols._symboltable.IMethodSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._symboltable.IDiagramSymbolResolver> adaptedDiagramSymbolResolver
   = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.IDiagramSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._symboltable.ITypeSymbolResolver> adaptedTypeSymbolResolver
   = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.ITypeSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._symboltable.ITypeVarSymbolResolver> adaptedTypeVarSymbolResolver
   = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.ITypeVarSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._symboltable.IVariableSymbolResolver> adaptedVariableSymbolResolver
   = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.IVariableSymbolResolver>()
;

    /* generated by template cd2java.Attribute*/

/* Hookpoint: AttributeContent:Annotations */
 protected  List<de.monticore.symbols.basicsymbols._symboltable.IFunctionSymbolResolver> adaptedFunctionSymbolResolver
   = new ArrayList<de.monticore.symbols.basicsymbols._symboltable.IFunctionSymbolResolver>()
;


    /* generated by template cd2java.Constructor*/
 public  SD4DevelopmentGlobalScopeTOP(de.monticore.io.paths.MCPath symbolPath,String fileExt)
 {
  /* generated by template _symboltable.globalscope.ConstructorGlobalScope*/

  this.symbolPath = Log.errorIfNull(symbolPath);
  this.fileExt = Log.errorIfNull(fileExt);
  init();

}

    /* generated by template cd2java.Constructor*/
 public  SD4DevelopmentGlobalScopeTOP()
 {
  /* generated by template _symboltable.globalscope.ZeroArgsConstructorGlobalScope*/

  this.symbolPath = new de.monticore.io.paths.MCPath();
  this.fileExt = ".*sym";
  init();

}


    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.io.paths.MCPath getSymbolPath ()

 {
    /* generated by template methods.Get*/

return this.symbolPath;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSymbolPath (de.monticore.io.paths.MCPath symbolPath)

 {
    /* generated by template methods.Set*/

this.symbolPath = symbolPath;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  String getFileExt ()

 {
    /* generated by template methods.Get*/

return this.fileExt;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setFileExt (String fileExt)

 {
    /* generated by template methods.Set*/

this.fileExt = fileExt;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  de.monticore.symboltable.serialization.IDeSer getDeSer ()

 {
    /* generated by template methods.Get*/

return this.deSer;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setDeSer (de.monticore.symboltable.serialization.IDeSer deSer)

 {
    /* generated by template methods.Set*/

this.deSer = deSer;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  Map<String,de.monticore.symboltable.serialization.ISymbolDeSer> getSymbolDeSers ()

 {
    /* generated by template methods.Get*/

return this.symbolDeSers;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSymbolDeSers (Map<String,de.monticore.symboltable.serialization.ISymbolDeSer> symbolDeSers)

 {
    /* generated by template methods.Set*/

this.symbolDeSers = symbolDeSers;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setSymbols2Json (SD4DevelopmentSymbols2Json symbols2Json)

 {
    /* generated by template methods.Set*/

this.symbols2Json = symbols2Json;

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  SD4DevelopmentSymbols2Json getSymbols2Json ()

 {
    /* generated by template _symboltable.globalscope.GetSymbols2Json*/

  if(null == symbols2Json) {
    //initialize on demand to avoid cyclic constructor calls
    symbols2Json = new de.monticore.lang.sd4development._symboltable.SD4DevelopmentSymbols2Json();
  }
 return symbols2Json;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void addLoadedFile (String name)

 {
    cache.add(name);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void clearLoadedFiles ()

 {
    cache.clear();
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  boolean isFileLoaded (String name)

 {
    return cache.contains(name);
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void init ()

 {
    /* generated by template _symboltable.globalscope.Init*/

  deSer = new de.monticore.lang.sd4development._symboltable.SD4DevelopmentDeSer();
  symbolDeSers.put("de.monticore.symbols.oosymbols._symboltable.OOTypeSymbol", new de.monticore.symbols.oosymbols._symboltable.OOTypeSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.oosymbols._symboltable.FieldSymbol", new de.monticore.symbols.oosymbols._symboltable.FieldSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.oosymbols._symboltable.MethodSymbol", new de.monticore.symbols.oosymbols._symboltable.MethodSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.basicsymbols._symboltable.DiagramSymbol", new de.monticore.symbols.basicsymbols._symboltable.DiagramSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.basicsymbols._symboltable.TypeSymbol", new de.monticore.symbols.basicsymbols._symboltable.TypeSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbol", new de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.basicsymbols._symboltable.VariableSymbol", new de.monticore.symbols.basicsymbols._symboltable.VariableSymbolDeSer());
  symbolDeSers.put("de.monticore.symbols.basicsymbols._symboltable.FunctionSymbol", new de.monticore.symbols.basicsymbols._symboltable.FunctionSymbolDeSer());

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.IOOTypeSymbolResolver> getAdaptedOOTypeSymbolResolverList ()

 {
    return this.adaptedOOTypeSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedOOTypeSymbolResolverList (List<de.monticore.symbols.oosymbols._symboltable.IOOTypeSymbolResolver> adaptedOOTypeSymbolResolver)

 {
    this.adaptedOOTypeSymbolResolver = adaptedOOTypeSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.IFieldSymbolResolver> getAdaptedFieldSymbolResolverList ()

 {
    return this.adaptedFieldSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedFieldSymbolResolverList (List<de.monticore.symbols.oosymbols._symboltable.IFieldSymbolResolver> adaptedFieldSymbolResolver)

 {
    this.adaptedFieldSymbolResolver = adaptedFieldSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.oosymbols._symboltable.IMethodSymbolResolver> getAdaptedMethodSymbolResolverList ()

 {
    return this.adaptedMethodSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedMethodSymbolResolverList (List<de.monticore.symbols.oosymbols._symboltable.IMethodSymbolResolver> adaptedMethodSymbolResolver)

 {
    this.adaptedMethodSymbolResolver = adaptedMethodSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.IDiagramSymbolResolver> getAdaptedDiagramSymbolResolverList ()

 {
    return this.adaptedDiagramSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedDiagramSymbolResolverList (List<de.monticore.symbols.basicsymbols._symboltable.IDiagramSymbolResolver> adaptedDiagramSymbolResolver)

 {
    this.adaptedDiagramSymbolResolver = adaptedDiagramSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.ITypeSymbolResolver> getAdaptedTypeSymbolResolverList ()

 {
    return this.adaptedTypeSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedTypeSymbolResolverList (List<de.monticore.symbols.basicsymbols._symboltable.ITypeSymbolResolver> adaptedTypeSymbolResolver)

 {
    this.adaptedTypeSymbolResolver = adaptedTypeSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.ITypeVarSymbolResolver> getAdaptedTypeVarSymbolResolverList ()

 {
    return this.adaptedTypeVarSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedTypeVarSymbolResolverList (List<de.monticore.symbols.basicsymbols._symboltable.ITypeVarSymbolResolver> adaptedTypeVarSymbolResolver)

 {
    this.adaptedTypeVarSymbolResolver = adaptedTypeVarSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.IVariableSymbolResolver> getAdaptedVariableSymbolResolverList ()

 {
    return this.adaptedVariableSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedVariableSymbolResolverList (List<de.monticore.symbols.basicsymbols._symboltable.IVariableSymbolResolver> adaptedVariableSymbolResolver)

 {
    this.adaptedVariableSymbolResolver = adaptedVariableSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  List<de.monticore.symbols.basicsymbols._symboltable.IFunctionSymbolResolver> getAdaptedFunctionSymbolResolverList ()

 {
    return this.adaptedFunctionSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void setAdaptedFunctionSymbolResolverList (List<de.monticore.symbols.basicsymbols._symboltable.IFunctionSymbolResolver> adaptedFunctionSymbolResolver)

 {
    this.adaptedFunctionSymbolResolver = adaptedFunctionSymbolResolver;
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadOOType (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForOOType(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadField (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForField(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadMethod (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForMethod(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadDiagram (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForDiagram(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadType (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForType(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadTypeVar (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForTypeVar(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadVariable (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForVariable(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadFunction (String name)

 {
    /* generated by template _symboltable.globalscope.Load*/

  for (String modelName : calculateModelNamesForFunction(name)) {
    loadFileForModelName(modelName);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void loadFileForModelName (String modelName)

 {
    /* generated by template _symboltable.globalscope.LoadFileForModelName*/

  java.util.Optional<java.net.URL> location = getSymbolPath().find(modelName, getFileExt());
  if(location.isPresent() && !isFileLoaded(location.get().toString())){
    addLoadedFile(location.get().toString());
    ISD4DevelopmentArtifactScope as = getSymbols2Json().load(location.get());
    addSubScope(as);
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 abstract  public  SD4DevelopmentGlobalScope getRealThis ()

;
    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void clear ()

 {
    /* generated by template _symboltable.globalscope.Clear*/

  clearLoadedFiles();
  getAdaptedOOTypeSymbolResolverList().clear();
  getAdaptedFieldSymbolResolverList().clear();
  getAdaptedMethodSymbolResolverList().clear();
  getAdaptedDiagramSymbolResolverList().clear();
  getAdaptedTypeSymbolResolverList().clear();
  getAdaptedTypeVarSymbolResolverList().clear();
  getAdaptedVariableSymbolResolverList().clear();
  getAdaptedFunctionSymbolResolverList().clear();
  getOOTypeSymbols().clear();
  getFieldSymbols().clear();
  getMethodSymbols().clear();
  getDiagramSymbols().clear();
  getTypeSymbols().clear();
  getTypeVarSymbols().clear();
  getVariableSymbols().clear();
  getFunctionSymbols().clear();
  this.symbolPath = new de.monticore.io.paths.MCPath();
  this.subScopes.clear();
  this.symbolDeSers.clear();
  this.fileExt = ".*sym";
  init();

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putOOTypeSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.OOTypeSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putFieldSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.FieldSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putMethodSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.oosymbols._symboltable.MethodSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putDiagramSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.DiagramSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putTypeSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.TypeSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putTypeVarSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.TypeVarSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putVariableSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.VariableSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void putFunctionSymbolDeSer (String kind)

 {
    putSymbolDeSer(kind, new de.monticore.symbols.basicsymbols._symboltable.FunctionSymbolDeSer());
}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass SD4DevelopmentGlobalScope must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof SD4DevelopmentGlobalScope) {
      visitor.handle((SD4DevelopmentGlobalScope) this);
    } else {
      throw new UnsupportedOperationException("0xA7011x88837 Only handwritten class SD4DevelopmentGlobalScope is supported for the visitor");
    }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.lang.sdbasis._visitor.SDBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x18667 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.lang.sdbasis._visitor.SDBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x06923 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.expressions.commonexpressions._visitor.CommonExpressionsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x89596 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.expressions.commonexpressions._visitor.CommonExpressionsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.ocl.oclexpressions._visitor.OCLExpressionsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x43449 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.ocl.oclexpressions._visitor.OCLExpressionsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.symbols.oosymbols._visitor.OOSymbolsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x12412 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.symbols.oosymbols._visitor.OOSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x21890 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x26792 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.symbols.basicsymbols._visitor.BasicSymbolsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x64892 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.expressions.expressionsbasis._visitor.ExpressionsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.umlstereotype._visitor.UMLStereotypeTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x71383 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.umlstereotype._visitor.UMLStereotypeTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x52097 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x08159 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/

/* Hookpoint: MethodContent:Annotations */
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template data.AcceptSuper*/

  if (visitor instanceof de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) {
    accept((de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7011x47633 Scope type SD4DevelopmentGlobalScope expected a visitor of type de.monticore.lang.sd4development._visitor.SD4DevelopmentTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on Symbols containing nodes of the sub language. Use a visitor of the sub language.");
  }

}


}


