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

    // introduce el nombre de la persona y su numero en la agenda 
    
    public void enterNumber(String name, String number)
    {
        agenda.put(name,number);
    }
    // busca el numero de la persona en la agenda 
    
    public String lookupNumber(String name){
        String resultado = "";
        
        resultado = agenda.get(name);
        
        return resultado;
    }
    
    //imprime todos los nombres de la agenda
    
    public void printAllNames(){
        System.out.println(agenda.keySet());
        
    }
}
