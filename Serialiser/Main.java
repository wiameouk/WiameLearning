import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GestionPerson gestionperson = new GestionPerson();
        
        gestionperson.ajouter(21, LocalDate.of(2003, 2, 27));
        
        String filePath = "info.txt";
        
        gestionperson.sauvegarder(filePath);
        
        gestionperson.charger(filePath);
    }
}
