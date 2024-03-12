import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private final String input;
    private int position;

    public Tokenizer(String input) {
        this.input = input;
        this.position = 0;
    }

    public List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>();
        while (position < input.length()) {
            char currentChar = input.charAt(position);
            if (Character.isWhitespace(currentChar)) {
                position++;
                continue;
            }
            if (Character.isDigit(currentChar)) {
                tokens.add(readNumber());
            } else if (Character.isLetter(currentChar)) {
                tokens.add(readIdentifier());
            } else {
                tokens.add(new Token(Token.Type.OPERATOR, Character.toString(currentChar)));
                position++;
            }
        }
        return tokens;
    }

    private Token readNumber() {
        StringBuilder sb = new StringBuilder();
        while (position < input.length() && Character.isDigit(input.charAt(position))) {
            sb.append(input.charAt(position));
            position++;
        }
        return new Token(Token.Type.NUMBER, sb.toString());
    }

    private Token readIdentifier() {
        StringBuilder sb = new StringBuilder();
        while (position < input.length() && (Character.isLetterOrDigit(input.charAt(position)) || input.charAt(position) == '_')) {
            sb.append(input.charAt(position));
            position++;
        }
        String identifier = sb.toString();
        switch (identifier) {
            case "QUOTE":
            case "'":
                return new Token(Token.Type.QUOTE, identifier);
            case "DEFUN":
                return new Token(Token.Type.DEFUN, identifier);
            case "SETQ":
                return new Token(Token.Type.SETQ, identifier);
            case "ATOM":
                return new Token(Token.Type.ATOM, identifier);
            case "LIST":
                return new Token(Token.Type.LIST, identifier);
            case "EQUAL":
                return new Token(Token.Type.EQUAL, identifier);
            case "<":
                return new Token(Token.Type.LT, identifier);
            case ">":
                return new Token(Token.Type.GT, identifier);
            case "COND":
                return new Token(Token.Type.COND, identifier);
            default:
                return new Token(Token.Type.IDENTIFIER, identifier);
        }
    }
}


