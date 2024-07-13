import java.util.Random;
import java.util.Scanner;

class Jeuvinette{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int nombreAleatoire = rand.nextInt(100) + 1;
        int nombreUtilisateur = 0; 
        System.out.println("Donne un nombre:");
        do{
            nombreUtilisateur = scanner.nextInt(); 
            if (nombreUtilisateur < nombreAleatoire) {
                System.out.println("Le nombre aléatoire est plus grand que le nombre utilisateur  ");
            } else if (nombreUtilisateur > nombreAleatoire) {
                System.out.println("Nombre Aleatoire est moins que le nombre utilisateur ");
            }else {
                System.out.println("le nombre est trouvé:" + nombreAleatoire);
            }
            
        }while((nombreUtilisateur != nombreAleatoire) );
    }
}