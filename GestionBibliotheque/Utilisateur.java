import java.util.ArrayList;

public class Utilisateur {
    private int id;
    private String nom;
    private ArrayList<Livre> livresDispo;

    public Utilisateur(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.livresDispo = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Livre> getLivresDispo() {
        return livresDispo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom='" + nom + " " + ", livresDispo=" + livresDispo + '}';
    }
}

