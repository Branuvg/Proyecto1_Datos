import java.util.Arrays;

public class PrefixCalc {

    private static String[] operators = { "+", "-", "*", "/" };
    private Stack<Integer> stack;

    public Integer calcularPrefijo(String expresion) {
        String[] val = expresion.split(" ");

        stack = new Stack<Integer>();

        boolean flag = true;
        int num1;
        int num2;
        int result = 0;

        for (int i = val.length - 1; i >= 0; i--) { // Recorrer la expresion
            if (Arrays.asList(operators).contains(val[i])) { // Si es Operador
                if (stack.count() >= 2) { // Si hay dos o mas en la pila es porque se pueden hacer operaciones

                    // Sacar los dos ultimos numeros
                    num1 = stack.pop();
                    num2 = stack.pop();
                    switch (val[i]) {
                        case "+": // Suma
                            stack.push(num1 + num2);
                            break;

                        case "-": // Resta
                            stack.push(num1 - num2);
                            break;

                        case "*": // Multiplicacion
                            stack.push(num1 * num2);
                            break;

                        case "/": // Division
                            if (num1 != 0) // Si el numero es ≠ 0 se puede hacer la division
                                stack.push(num1 / num2);
                            else { // Division indefinida
                                System.out.println("Error: Division entre cero");
                                return null;
                            }
                            break;

                    }
                } else { // Faltan numeros
                    System.out.println("Error: Le faltaron operandos");
                    flag = false;
                }
            } else { // No ingreso datos
                stack.push(Integer.parseInt(val[i]));
            }
        }
        if (stack.count() == 1 && flag) // Si se tiene un elemento en pila
            result = stack.pop();
        else if (!flag) // Si se tinen mas elementos es porque faltaron operadores
            return null;
        else {
            System.out.println("Error: Le faltaron operadores");
            flag = false;
        }
        if (flag) // Si la operacion es valida
            return result;
        else // Existe algun error
            return null;
    }
}
