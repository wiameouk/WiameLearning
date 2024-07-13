import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        System.out.print("Donne le mot: ");
        Scanner scanner = new Scanner(System.in);  
        String chaine = scanner.nextLine();
        System.out.println("la chaine : " + chaine);

        String chaineInverse = new StringBuilder(chaine).reverse().toString();
        System.out.println("chaine inversé: " + chaineInverse);

        if (chaine.equals(chaineInverse)) {
            System.out.println("Le mot est un palindrome.");
        } else {
            System.out.println("Le mot n'est pas un palindrome.");
        }

    }
}



