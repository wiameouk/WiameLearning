import java.util.HashMap;
import java.util.Map;

public class Analysetexte{
    public static Map<String, Integer>frequence(String paraghraphe ){
                
        paraghraphe = paraghraphe.replaceAll("[^a-zA-Z ]", "");
        String[] prg = paraghraphe.split("\\s+"); 
        Map<String, Integer> frq = new HashMap<>();

        for (String mot : prg) {
            mot = mot.toLowerCase();
            frq.put(mot, frq.getOrDefault(mot, 0) + 1); 
        }

        return frq;
    }



}



     

