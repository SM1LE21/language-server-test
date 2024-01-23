/* generated by template _lsp.language_access.LspCoCoRunner*/

package de.monticore.lang.sdbasis._lsp.language_access;

import de.monticore.lang.sdbasis._ast.ASTSDArtifact;
import de.monticore.lang.sdbasis._lsp.*;
import de.monticore.lang.sdbasis.SDBasisTool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.mclsg.lsp.document_management.DocumentManager;
import de.se_rwth.commons.logging.Log;

public class SDBasisLspCoCoRunner implements de.mclsg.lsp.features.CoCoCheckProvider{
    private static final Logger logger = LoggerFactory.getLogger(SDBasisLspCoCoRunner.class);
    protected DocumentManager documentManager;
    protected SDBasisTool tool = new SDBasisTool();

    public SDBasisLspCoCoRunner(DocumentManager documentManager){
        this.documentManager = documentManager;
    }

    public void runAllCoCos(ASTSDArtifact ast){
        tool.runDefaultCoCos(ast);
        tool.runAdditionalCoCos(ast);
    }

    public void runCoCosForAllDocuments(){
        documentManager.getAllDocumentInformation(new SDBasisDocumentInformationFilter()).forEach(di -> {
                Log.enableFailQuick(false);

                if(di.ast != null){
                    Log.getFindings().clear();
                    try {
                      runAllCoCos((ASTSDArtifact) di.ast);
                    } finally {
                      di.findings.addAll(Log.getFindings());
                    }
                }
        });
    }

    public boolean needsSymbols(){
        return false;
    }
}
