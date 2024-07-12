
public class Livre  {
    private int id;
    private String titre;
    private String auteur;
    private boolean disponibilite;

    public Livre(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.disponibilite = true;  
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isDisponible() {
        return disponibilite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

   
}


