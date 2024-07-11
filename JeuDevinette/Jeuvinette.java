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
                System.out.println("Nombre Aleatoire est plus que nombreUtilisateur "+nombreAleatoire );
            } else if (nombreUtilisateur > nombreAleatoire) {
                System.out.println("Nombre Aleatoire est moins que nombreUtilisateur "+nombreAleatoire);
            }else{
                System.out.println("Nombre Aleatoire egale nombre utilisateur ");
            }
            
        }while((nombreUtilisateur != nombreAleatoire) );
    }
}