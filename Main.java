import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer();
        //Stack<String> stack = new Stack<>();
        Leedor fileScanner = new Leedor();
        String file = "Lisp.txt";
        Interprete interprete = new Interprete();
        ArrayList<ArrayList<String>> tokens = new ArrayList<ArrayList<String>>();
        String var;

        System.out.println("Interprete de LISP");
        ArrayList<String> expresions = fileScanner.Parse(file);
        for (String s: expresions) tokens.add(tokenizer.Tokens(s));
        for (ArrayList<String> juan: tokens){
            if (juan != null){
                String expresion = "";
                for (String s: juan) expresion += s + " ";
                System.out.println(expresion);
                var = interprete.operate(juan, tokenizer.getCommandType(juan));
                System.out.println(var.toString());
                System.out.println("\n");
            }
        }


        /** pruebas
        String command = "(+ 5 4 (* 3 4))";
        ArrayList<String> tokens = tokenizer.Tokens(command);
        System.out.println("Tokens: " + tokens);

        for (String token : tokens) {
            stack.push(token);
        }

        System.out.println("Contenido de la pila:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        int commandType = tokenizer.getCommandType(tokens);
        String commandTypeName = getCommandTypeName(commandType);
        System.out.println("Tipo de comando: " + commandTypeName);
    }

    // Método auxiliar para obtener el nombre del tipo de comando
    private static String getCommandTypeName(int commandType) {
        switch (commandType) {
            case 1:
                return "Asignación (setq)";
            case 2:
                return "AOP";
            case 3:
                return "PRINT";
            case 4:
                return ">";
            case 5:
                return "<";
            case 6:
                return "EQUAL";
            case 7:
                return "ATOM";
            case 8:
                return "LIST";
            case 9:
                return "COND";
            case 10:
                return "DEFUN";
            default:
                return "Tipo de Comando Desconocido";
        }**/
    }
}
