import java.util.Arrays;

public class PrefixCalc {

    private static String[] operators = {"+","-","*","/"};

    public static double calcularPrefijo(String expresion) {
        String[] val = expresion.split(" ");
        Stack<Double> pila = new Stack<>();  // Usamos la clase Stack proporcionada
        boolean flag = true;
        Double num1;
        Double result = (double) 0;
        Double num2;

        for (int i = val.length - 1; i >= 0; i--) {
            if(Arrays.asList(operators).contains(val[i])){
                if (pila.count() >= 2){
                    num1 = pila.pop();
                    num2 = pila.pop();
                    switch (val[i]) {
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
                }
                else{ //Faltan numeros
                    System.out.println("Error: Le faltaron operandos");
                    flag = false;
                }
            } else {
                pila.push(Double.parseDouble(val[i]));
            }
        }
        if (flag) return result;
        else return (Double) null;
    }
}
