import java.time.LocalDate;
import java.util.ArrayList;

public class GestionTache {
    ArrayList<Tache> taches = new ArrayList<>();
    public void ajoutertache(String description , LocalDate date ){
        Tache tache = new Tache(description, date);
        taches.add(tache);
        
    }
    public void affichetache() {
        if (taches.isEmpty()) {
            System.out.println("indisponible");
        } else {
            System.out.println("affiche liste des tâches :");
            for (int i = 0; i < taches.size(); i++) {
                System.out.println(taches.get(i));
            }
        }
    }
    public  void supprimetache(int index) {
        if (index >= 0 && index < taches.size()) {
            System.out.println("Tache supprimée : " + taches.remove(index));
        } else {
            System.out.println("n'existe pas.");
        }
    }
}
