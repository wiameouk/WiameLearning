public class Main {
    public static void main(String[] args) {
        Gestionbibliotheque bibliotheque = new Gestionbibliotheque();

        bibliotheque.AjouterLivre(new Livre(1, "antigone", "yassine"));
        bibliotheque.AjouterLivre(new Livre(2, "nana", "wiam"));
        bibliotheque.AjouterLivre(new Livre(2, "nana", "achraf"));
        bibliotheque.AfficherLivres();
        bibliotheque.ModifierLivre(1, "yahya", "2024coro");
        bibliotheque.SupprimerLivre(2);
        bibliotheque.AfficherLivres();
        bibliotheque.AjouterUtilisateur(new Utilisateur(1, "aya"));
        bibliotheque.AjouterUtilisateur(new Utilisateur(2, "fati"));
        bibliotheque.AjouterUtilisateur(new Utilisateur(2, "siham"));
        bibliotheque.SupprimerUtilisateur(1);
        bibliotheque.ModifierUtilisateur(1, "sihamuu");
        bibliotheque.AfficherLivres();

    }
    
}
