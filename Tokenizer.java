import java.util.ArrayList;

public class Tokenizer {

    
     // de string de un comando dado, a un array de caracteres
    protected ArrayList<Character> stringToChar(String command){
        ArrayList<Character> characters = new ArrayList<Character>();
        for (int i =0 ; i < command.length(); i++){
            characters.add(command.charAt(i));
        }
        return characters;
    }

    
    // crear los tokens segun  comando dado
    public ArrayList<String> Tokens(String command){
        String temp = "";
        ArrayList<String> commands = new ArrayList<String>();
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.addAll(stringToChar(command));
        for (Character current_char: characters){
            if(current_char == '(');
            else{
                if(current_char == ')'){
                    if(temp !=""){
                        commands.add(temp);
                        temp = "";
                    }
                }
                else{
                    if (current_char != ' ')
                        temp += current_char+"";
                    else{
                        if(temp != ""){
                            commands.add(temp);
                            temp = "";
                        }
                    }
                }
            }
        }
        
        return commands;
    }

    
     // dovolver un numero segun que se comando sed debe ejecutar
    public int getCommandType(ArrayList<String> command){
        if (command.get(0).contains("setq"))
            return 1;
        else if (command.get(0).contains("+")||command.get(0).contains("-")||command.get(0).contains("*")||command.get(0).contains("/"))
            return 2;
        else if (command.get(0).contains("'")||command.get(0).contains("quote")||command.get(0).contains("print"))
            return 3;
        else if(command.get(0).contains(">"))
            return 4;
        else if(command.get(0).contains("<"))
            return 5;
        else if(command.get(0).contains("equals")||command.get(0).contains("="))
            return 6;
        else if(command.get(0).contains("Atom"))
            return 7;
        else if(command.get(0).contains("List"))
            return 8;
        else if(command.get(0).contains("Cond"))
            return 9;
        else if (command.get(0).contains("defun"))
            return 10;
        else
            return -1; // Si no encuentra la expresion
    }
}
