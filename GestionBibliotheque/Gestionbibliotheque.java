import java.util.ArrayList;

class Gestionbibliotheque{    
        private ArrayList<Livre> livres;
        private ArrayList<Utilisateur> utilisateurs;

        public Gestionbibliotheque() {
            livres = new ArrayList<>();
            utilisateurs=new ArrayList<>();
        }
            public void AjouterLivre(Livre livre) {
            livres.add(livre);
        }
    
        public void ModifierLivre(int id, String titre1, String auteur1) {
            for (Livre livre : livres) {
                if (livre.getId() == id) {
                    livre.setTitre(titre1);
                    livre.setAuteur(auteur1);
                    break;
                }
            }
        }
        public void SupprimerLivre(int id) {
            livres.removeIf(livre -> livre.getId() == id);
        }
        
        public Livre RechercherLivre(int id) {
            for (Livre livre : livres) {
                if (livre.getId() == id) {
                return livre;
                }
            }
            return null;
        } 
        public void AfficherLivres() {
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        }
        public void AjouterUtilisateur(Utilisateur utilisateur) {
            utilisateurs.add(utilisateur);
        }
    
        public void ModifierUtilisateur(int id, String Nom1) {
            for (Utilisateur utilisateur : utilisateurs) {
                if (utilisateur.getId() == id) {
                    utilisateur.setNom(Nom1);
                    break;
                }
            }
        }
    
        public void SupprimerUtilisateur(int id) {
            utilisateurs.removeIf(utilisateur -> utilisateur.getId() == id);
        }
        public void AfficherUtilisateur() {
            for (Utilisateur utilisateur: utilisateurs) {
                System.out.println(utilisateur);
            }
        }
        public Utilisateur RechercherUtilisateur(int id) {
            for (Utilisateur utilisateur : utilisateurs) {
                if (utilisateur.getId() == id) {
                    return utilisateur;
                }
            }
            return null;
        }

      

}

    
