import java.util.ArrayList;

public class Driver {

public String quote(Stack<String> stack){
    return stack.pop();
}

public void setQ(ArrayList<Variable> vars){
    vars.add(new Variable());
}

    public static void main(String[] args) {
        ArrayList<Variable> vars = new ArrayList<Variable>();
        // instancia tokenizer
        Tokenizer tokenizer = new Tokenizer();

        // Definir la entrada
        String input = "( a + b = c)";

        ArrayList<String> tokens = tokenizer.tokenize(input);
        tokenizer.processTokens(tokens);

        // Obtener el stack de Tokenizer y mostrar su contenido
        Stack<String> stack = tokenizer.getStack();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


