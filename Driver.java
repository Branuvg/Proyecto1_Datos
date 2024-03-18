import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer();
        Stack<String> stack = new Stack<>();

        // pruebas
        String command = "(5 + 1)";
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
        }
    }
}
