import java.util.Scanner;

class Inversechainecaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("donne la chaine :");
        String chaine = scanner.nextLine();       
        int taille = chaine.length();
        char[] charchaine = chaine.toCharArray();
        char[] charinverse = new char[taille];      
        for (int i = taille - 1, j = 0; i >= 0; i--, j++) {
            charinverse[j] = charchaine[i];
        }       
        String inverse = new String(charinverse);
        System.out.println("chaine inverse " + inverse);
    }
}
