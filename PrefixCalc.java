public class PrefixCalc {

    public static double calcularPrefijo(String expresion) {
        String[] tokens = expresion.split(" ");

        Stack<Double> pila = new Stack<>();  // Usamos la clase Stack proporcionada

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (esOperador(token)) {
                double num2 = pila.pop();
                double num1 = pila.pop();

                switch (token) {
                    case "+":
                        pila.push(num1 + num2);
                        break;
                    case "-":
                        pila.push(num1 - num2);
                        break;
                    case "*":
                        pila.push(num1 * num2);
                        break;
                    case "/":
                        pila.push(num1 / num2);
                        break;
                }
            } else {
                pila.push(Double.parseDouble(token));
            }
        }

        return pila.top();
    }

    private static boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}


