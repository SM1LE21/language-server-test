/* generated by template _lsp.features.diagnostics.DiagnosticsProvider*/

package de.monticore.lang.sd4development._lsp.features.diagnostics;

import de.monticore.lang.sdbasis._ast.ASTSDArtifact;
import de.monticore.lang.sd4development._lsp.language_access.SD4DevelopmentLanguageAccess;
import de.monticore.lang.sd4development._lsp.*;
import de.mclsg.SeCommonsLogParser;
import de.mclsg.lsp.document_management.DocumentManager;
import de.mclsg.lsp.features.diagnostics.CommonDiagnosticsProvider;

public class SD4DevelopmentDiagnosticsProvider extends CommonDiagnosticsProvider  {
    protected SD4DevelopmentLanguageAccess languageAccess;

    public SD4DevelopmentDiagnosticsProvider(DocumentManager documentManager, SeCommonsLogParser logParser, SD4DevelopmentLanguageAccess languageAccess) {
        super(documentManager, logParser);
        this.languageAccess = languageAccess;
    }
}
