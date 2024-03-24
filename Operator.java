import java.util.ArrayList;

public class Operator {

    //esta clase debe ser intanciada como SmoothOperator

    public void setQ(ArrayList<String> lisp){
        
    }

    /** 
    
    public String quote(String func){
        String value = "";
        String[] tokens = func.split("");
        int control=0;
        for(int i = 0; i < tokens.length-1; i++){
            if(tokens[i].equals("quote")||tokens[i].equals("QUOTE")||tokens[i].equals("'")){
                i++;
                control = i;
            }
        }
        for(int n = control; n< tokens.length-1;n++ ){
            if(n == tokens.length-2){
                value = value + tokens[n];
            }
            else {
                value = value + tokens[n]+" ";
            }
        }
        return value;
    }
    **/
    

    public String equals(String expresion){
        String valor = "";
        String valor2 = "";
        String expresionFinal ="";
        String[] expresionSplit = expresion.split(" ");
        int i =0;
        for(i =0; i <expresionSplit.length-1;i++){
            if(expresionSplit[i].equals("=")||expresionSplit[i].equals("equals")){
                i++;
                break;
            }
        }
        	valor = expresionSplit[i];
            valor2 = expresionSplit[i+1];
        if(valor.equals(valor2)){
            expresionFinal = "verdadero";
            return expresionFinal;
        }else{
            expresionFinal = "Falso";
            return expresionFinal;
        }
    }

    public String menorComparar(String expresion){
        int valor = 0;
        int valor2 = 0;
        String expresionFinal ="";
        String[] expresionSplit = expresion.split(" ");
        int i =0;
        for(i =0; i <expresionSplit.length-1;i++){
            if(expresionSplit[i].equals("<")){
                i++;
                break;
            }
        }
        	valor = Integer.parseInt(expresionSplit[i]);
            valor2 = Integer.parseInt(expresionSplit[i+1]);
        if(valor < valor2){
            expresionFinal = "verdadero";
            return expresionFinal;
        }else{
            expresionFinal = "Falso";
            return expresionFinal;
        }
    }

    public String mayorComparar(String expresion){
        int valor = 0;
        int valor2 = 0;
        String expresionFinal ="";
        String[] expresionSplit = expresion.split(" ");
        int i = 0;
        for(i =0; i <expresionSplit.length-1;i++){
            if(expresionSplit[i].equals(">")){
                i++;
                break;
            }
        }
        	valor = Integer.parseInt(expresionSplit[i]);
            valor2 = Integer.parseInt(expresionSplit[i+1]);
        if(valor > valor2){
            expresionFinal = "verdadero";
            return expresionFinal;
        }else{
            expresionFinal = "Falso";
            return expresionFinal;
        }
    }

    public String isAtom(String expresion){
        String atom = "NIL";
        String[] values= expresion.split(" ");

        int i = 0;
        for(i=0; i < values.length ; i++)
        	if(values[i].contains("Atom")){
        		i++;
        		break;
        	}
        if((values.length-i)<=1) {
            atom = "T";
        }
        return atom;
    }

    public String isList(String expresion){
        String list = "NIL";
        String[] values= expresion.split(" ");

        int i = 0;
        for(i=0; i < values.length ; i++)
        	if(values[i].contains("List")){
        		i++;
        		break;
        	}
        if((values.length-i)>1) {
            list = "T";
        }
        return list;
    }

    
}
