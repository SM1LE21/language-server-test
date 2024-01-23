/* generated by template _lsp.LspAntlrLexer*/

package de.monticore.lang.sd4development._lsp;

import de.monticore.lang.sd4development._parser.SD4DevelopmentAntlrLexer;

import de.mclsg.lsp.extensions.syntax_highlighting.lexer.Token;
import org.antlr.v4.runtime.CharStream;
import java.util.*;

public class SD4DevelopmentLspAntlrLexer extends SD4DevelopmentAntlrLexer {
    public List<Token> commentTokens = new ArrayList<>();

    public SD4DevelopmentLspAntlrLexer(CharStream input) {
        super(input);
    }

    @Override
    protected void storeComment() {
        super.storeComment();
        int end = _tokenStartCharIndex + getText().length();
        Token token = new Token(_tokenStartCharIndex, end, -1, "COMMENT");
        commentTokens.add(token);
    }
}