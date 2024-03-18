import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interprete {

    private HashMap<String, String> variables = new HashMap<String, String>();
    
    //private AritmethicOperation aritmethicOperation = new AritmethicOperation();
    //private LispLogicFuction logicFuction = new LispLogicFuction();

    private ArrayList<String> instructions = new ArrayList<String>(Arrays.asList("setq", "print", "+", "-", "*", "/",
            "'", "quote", ">", "<", "equals", "=", "Atom", "List", "Cond", "defun"));
    private ArrayList<String> FunctionsNames = new ArrayList<String>();

    private Tokenizer tokenizer = new Tokenizer();
    private HashMap<String, ArrayList<String>> functions = new HashMap<String, ArrayList<String>>();
    private HashMap<String, LinkedHashMap<String, String>> parameters = new HashMap<String, LinkedHashMap<String, String>>();
    private boolean end = false;
    private int created_instructions = 1;

    // metodo que evalua un comando y ejecuta una operacion segun la opcion dada

    // metodo para hacer una nueva funcion a partir de un comando, tmb sirve para recursion

    // metodo que utiliza una funcion anteriormente creada, recursion

    // rrear una nueva variable segun en el comando

    // instrucciones

}
