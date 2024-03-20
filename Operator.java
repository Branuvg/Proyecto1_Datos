import java.util.ArrayList;

public class Operator {

    //esta clase debe ser intanciada como SmoothOperator

<<<<<<< HEAD
    public void setQ(ArrayList<String> lisp){
        
    }

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

    public String cond(){
        String cond = "";

        return cond;
    }

=======
>>>>>>> ee5f551df18c80f01902d641596dab6dc11a7c70
    
}
