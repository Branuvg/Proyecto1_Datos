import java.util.ArrayList;

public class Operator {

    //esta clase debe ser intanciada como SmoothOperator
    
    public String equals(String input){
        String value = "";
        String value2 = "";
        String output = "";
        String[] analyse =  input.split(" ");
        int i = 0;

        if(analyse[i].equals("=")||analyse[i].equals("equals")){
            i++;
        }
        value = analyse[i];
        value2 = analyse[i+1];
        if(value.equals(value2)){
            output = "True";
        }
        else {
            output = "False";
        }
        return output;
            
    }
    public String isSmaller(String lisp){
        int value = 0;
        int value2 = 0;
        String output = "";
        String[] analyse =  lisp.split(" ");
        int i = 0;
        if(analyse[i].equals("<")){
            i++;
        }

        value = Integer.parseInt(analyse[i]);
        value2 = Integer.parseInt(analyse[i+1]);

        if(value < value2){
            output = "True";
        }
        else{
            output = "False";
        }
        return output;

    }
    public String isBigger(String lisp){
        int value = 0;
        int value2 = 0;
        String output = "";
        String[] analyse =  lisp.split(" ");
        int i = 0;
        if(analyse[i].equals(">")){
            i++;
        }

        value = Integer.parseInt(analyse[i]);
        value2 = Integer.parseInt(analyse[i+1]);

        if(value > value2){
            output = "True";
        }
        else{
            output = "False";
        }
        return output;

    }

    public String isAtom(String lisp){
    String atom = "NIL";
    String[] analyse =  lisp.split(" ");
    int i = 0;
    if(analyse[i].contains("Atom")){
        i++;
    }
    if((analyse.length-i)<=1){
        atom = "T";
    }
    return atom;
    }

    public String isList(String lisp){
    String list = "NIL";
    String[] analyse =  lisp.split(" ");
    int i = 0;
    if(analyse[i].contains("List")){
        i++;
    }
    if((analyse.length-i)<=1){
        list = "T";
    }
    return list;
    }
    
}
