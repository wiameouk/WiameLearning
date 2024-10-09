import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestionPerson {

    private ArrayList<Person> personne = new ArrayList<>();

    public void ajouter(double age, LocalDate datenaissance) {
        Person person = new Person(age, datenaissance);
        personne.add(person);
    }

    public void sauvegarder(String filePath) {
        Path file = Paths.get(filePath);
        try (ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(file))) {
            os.writeObject(personne);
            System.out.println("sauvegarde la liste " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void charger(String filePath) {
        Path file = Paths.get(filePath);
        if (Files.exists(file)) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))) {
                personne = (ArrayList<Person>) ois.readObject();  
                System.out.println("Lire la liste des personnes " + filePath);
                for (Person p : personne) {
                    System.out.println(p);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Le fichier n'existe pas : " + filePath);
        }
    }
}
