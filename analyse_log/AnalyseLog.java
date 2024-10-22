import java.io.*;
import java.util.*;
import java.util.regex.*;

public class AnalyseLog {

    public static void main(String[] args) {
        String cheminFichier = "desktop/info.txt";
        Map<String, Integer> comptIp = new HashMap<>();
        
        try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            String regexIP = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";
            Pattern pattern = Pattern.compile(regexIP);
            while ((ligne = lecteur.readLine()) != null) {
                Matcher matcher = pattern.matcher(ligne);
                while (matcher.find()) {
                    String adresseIP = matcher.group();
                    comptIp.put(adresseIP, comptIp.getOrDefault(adresseIP, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> ipTriees = new TreeMap<>(comptIp);
        System.out.println("Occurrences des adresses IP :");
        for (Map.Entry<String, Integer> entree : ipTriees.entrySet()) {
            System.out.println(entree.getKey() + " : " + entree.getValue() + " fois");
        }
    }
}
