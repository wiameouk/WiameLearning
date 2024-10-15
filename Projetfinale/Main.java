import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionTache gestiontache = new GestionTache();
        String filepath = "tache.csv"; 
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println(" Menu Gestion de Tâches");
            System.out.println("1. Ajouter une tache");
            System.out.println("2. Afficher toutes les taches");
            System.out.println("3. Supprimer une tâche par description");
            System.out.println("4. Sauvegarder les tâches dans un fichier");
            System.out.println("5. Charger les taches à partir d'un fichier");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Entrez la description de la tache : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez la priorite : ");
                    int priorite = scanner.nextInt();
                    System.out.print("Entrez l'annee de la date limite  : ");
                    int annee = scanner.nextInt();
                    System.out.print("Entrez le mois  : ");
                    int mois = scanner.nextInt();
                    System.out.print("Entrez le jour  : ");
                    int jour = scanner.nextInt();
                    scanner.nextLine();  

                    LocalDate dateLimite = LocalDate.of(annee, mois, jour);
                    gestiontache.ajouter(description, priorite, dateLimite);
                    System.out.println("Tache ajouter avec succes.");
                    break;

                case 2:
                    gestiontache.afficherTaches();
                    break;

                case 3:
                    System.out.print("Entrez la description de la tache à supprimer : ");
                    String descriptions = scanner.nextLine();
                    gestiontache.supprimertache(descriptions);
                    System.out.println("Tache supprimée ");
                    break;

                case 4:
                    gestiontache.sauvegarde(filepath);
                    System.out.println("Enregistrer les tâches " + filepath);
                    break;

                case 5:
                    gestiontache.charger(filepath);
                    System.out.println(" Charger les taches" + filepath);
                    break;

                case 6:
                    
                    continuer = false;
                    System.out.println("Quitter");
                    break;

                default:
                    System.out.println("Invalide");
            }
        }

        scanner.close();
    }
}
