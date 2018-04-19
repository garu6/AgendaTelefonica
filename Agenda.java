import java.util.HashMap;

public class Agenda
{
    
    private HashMap<String, String> agenda;

    /**
     * Constructor for objects of class Agenda
     */
    public Agenda()
    {
        agenda = new HashMap<>();
    }

    
    public void enterNumber(String name, String number)
    {
        agenda.put(name,number);
    }
    
    
    
    public String lookupNumber(String name){
        String resultado = "";
        
        resultado = agenda.get(name);
        
        return resultado;
    }
}
