import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestionTache {

    private ArrayList<Tache> tache = new ArrayList<>();

    public void ajouter( String descreption , int priorite , LocalDate date_limite)
    {
        Tache taches =new Tache(descreption, priorite, date_limite);
        tache.add(taches);
    }
    public void afficherTaches() {
        if (tache.isEmpty()) {
            System.out.println("Aucune tache");
        } else {
            for (Tache t : tache) {
                System.out.println("liste des taches :"+t);
            }
        }
    }

    public void supprimertache(String description)
    {
        for( int i=0 ; i<tache.size() ; i++)
        {
            if (tache.get(i).getdescription().equals(description)) {
                tache.remove(i);
                System.out.println("Tache supprime : " + description);
                return; 
            }
        }
    }
    public void sauvegarde(String filepath )
    {
        Path file = Paths.get(filepath);
        try (ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(file))){

            os.writeObject(tache);
            System.out.println(filepath);       

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    public void charger(String filepath) {
        Path file = Paths.get(filepath);
        if (Files.exists(file)) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))) {
                tache = (ArrayList<Tache>) ois.readObject();
                System.out.println("Tache charger " + filepath);
                for (Tache t : tache) {
                    System.out.println(t);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Fichier non trouvé : " + filepath);
        }
    }
}
