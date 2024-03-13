import java.util.ArrayList;

public class Tokenizer {

    private Stack<String> stack;

    public Tokenizer() {
        this.stack = new Stack<>();
    }
    public Stack<String> getStack() {
        return this.stack;
    }

    public ArrayList<String> tokenize(String input) {
        ArrayList<String> tokens = new ArrayList<>();
        StringBuilder currentToken = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (currentToken.length() > 0) {
                    tokens.add(currentToken.toString());
                    currentToken.setLength(0);
                }
            } else if (c == '(' || c == ')') {
                if (currentToken.length() > 0) {
                    tokens.add(currentToken.toString());
                    currentToken.setLength(0);
                }
                tokens.add(String.valueOf(c));
            } else {
                currentToken.append(c);
            }
        }

        if (currentToken.length() > 0) {
            tokens.add(currentToken.toString());
        }

        return tokens;
    }

    public void processTokens(ArrayList<String> tokens) {
        for (String token : tokens) {
            // Eliminar paréntesis
            if (token.equals("(") || token.equals(")")) {
                continue; // Ignorar los paréntesis
            }
    
            // Reconocer nombres de funciones, operadores y otros tokens
            switch (token) {
                case "DEFUN":
                case "COND":
                case "EQUAL":
                case "LT":
                case "GT":
                    stack.push(token);
                    break;
                default:
                    if (token.matches("[a-zA-Z]+")) {
                        // Es un identificador
                        stack.push("IDENTIFIER");
                    } else if (token.matches("-?\\d+")) {
                        // Es un número
                        stack.push("NUMBER");
                    } else {
                        System.out.println("Token no reconocido: " + token);
                    }
            }
        }
    }    
}
