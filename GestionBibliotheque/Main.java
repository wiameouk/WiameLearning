import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestionbibliotheque bibliotheque = new Gestionbibliotheque();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Modifier un livre");
            System.out.println("3. Supprimer un livre");
            System.out.println("4. Afficher les livres");
            System.out.println("5. Ajouter un utilisateur");
            System.out.println("6. Modifier un utilisateur");
            System.out.println("7. Supprimer un utilisateur");
            System.out.println("8. Afficher  les utilisateurs");
            System.out.print("Choisissez une option: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("ID du livre: ");
                    int idlivre = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Titre du livre: ");
                    String titre = scanner.nextLine();
                    System.out.print("Auteur du livre: ");
                    String auteur = scanner.nextLine();
                    bibliotheque.AjouterLivre(new Livre(idlivre, titre, auteur));
                    break;
                case 2:
                    System.out.print("livre modifier: ");
                    int idlivrenv= scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nouveau titre du livre: ");
                    String titre1 = scanner.nextLine();
                    System.out.print("Nouvel auteur du livre: ");
                    String auteur1 = scanner.nextLine();
                    bibliotheque.ModifierLivre(idlivrenv, titre1, auteur1);
                    break;
                case 3:
                    System.out.print("livre supprimer: ");
                    int idlivreSup = scanner.nextInt();
                    bibliotheque.SupprimerLivre(idlivreSup);
                    break;
                case 4:
                    bibliotheque.AfficherLivres();
                    break;
                case 5:
                    System.out.print("ID de l'utilisateur: ");
                    int idUtilisateur = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nom de l'utilisateur: ");
                    String nom = scanner.nextLine();
                    bibliotheque.AjouterUtilisateur(new Utilisateur(idUtilisateur, nom));
                    break;
                case 6:
                    System.out.print(" l'utilisateur à modifier par ID: ");
                    int idUtilisateurnv = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nouveau nom de l'utilisateur: ");
                    String nom1 = scanner.nextLine();
                    bibliotheque.ModifierUtilisateur(idUtilisateurnv, nom1);
                    break;
                case 7:
                    System.out.print("l'utilisateur à supprimer: ");
                    int idutilisateurSup = scanner.nextInt();
                    bibliotheque.SupprimerUtilisateur(idutilisateurSup);
                    break;
                case 8:
                    bibliotheque.AfficherUtilisateur();
                    break;
                
                default:
                    System.out.println("Option n'existe pas ");
            }
        } while (choix != 8);

        scanner.close();
    }
}
