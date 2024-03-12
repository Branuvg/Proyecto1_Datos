public class Token {
    public enum Type { OPERATOR, IDENTIFIER, NUMBER, QUOTE, DEFUN, SETQ, ATOM, LIST, EQUAL, LT, GT, COND }

    private final Type type;
    private final String value;

    public Token(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}