import java.time.LocalDate;

public class main {
     public static void main(String[] args) {
        GestionTache gestionTache = new GestionTache();

        gestionTache.ajoutertache("java", LocalDate.of(2024, 10, 8));
        gestionTache.ajoutertache("ERP", LocalDate.of(2024, 10, 8));

        gestionTache.affichetache();

        gestionTache.supprimetache(0);

        gestionTache.affichetache();
    }
    
}
