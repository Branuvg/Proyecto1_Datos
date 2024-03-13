import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        // instancia tokenizer
        Tokenizer tokenizer = new Tokenizer();

        // Definir la entrada
        String input = "( + 1 5)";

        ArrayList<String> tokens = tokenizer.tokenize(input);
        tokenizer.processTokens(tokens);

        // Obtener el stack de Tokenizer y mostrar su contenido
        Stack<String> stack = tokenizer.getStack();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


