/* generated by template _lsp.features.formatting.FormattingProvider*/

package de.monticore.lang.sd4development._lsp.features.formatting;

import de.monticore.lang.sd4development._lsp.language_access.SD4DevelopmentLanguageAccess;
import de.monticore.lang.sd4development._lsp.SD4DevelopmentLspAntlrParser;

import de.mclsg.lsp.features.formatting.AbstractFormattingProvider;
import de.mclsg.parser.MatchedToken;

import java.util.*;
import org.eclipse.lsp4j.TextDocumentItem;

public class SD4DevelopmentFormattingProvider extends AbstractFormattingProvider  {
	protected SD4DevelopmentLanguageAccess languageAccess;

	public SD4DevelopmentFormattingProvider(SD4DevelopmentLanguageAccess languageAccess){
		super();
		this.languageAccess = languageAccess;
	}

	@Override
	protected List<MatchedToken> getMatchedTokens(TextDocumentItem document) {
		SD4DevelopmentLspAntlrParser parser = languageAccess.getLspParser(document.getText());
		parser.parse();
		return parser.getMatchedTokens();
	}
}