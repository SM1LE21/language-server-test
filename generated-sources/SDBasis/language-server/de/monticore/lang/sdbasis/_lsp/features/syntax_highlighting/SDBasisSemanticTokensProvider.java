/* generated by template _lsp.features.syntax_highlighting.SemanticTokensProvider*/

package de.monticore.lang.sdbasis._lsp.features.syntax_highlighting;

import de.monticore.lang.sdbasis._lsp.*;
import de.monticore.lang.sdbasis._lsp.language_access.SDBasisLanguageAccess;

public class SDBasisSemanticTokensProvider extends de.mclsg.lsp.features.sematic_tokens.impl.DelegatingSemanticsTokenProvider{

    public SDBasisSemanticTokensProvider(SDBasisLanguageAccess languageAccess){
        super(new SDBasisSyntaxHighlightingService(languageAccess));
    }

}