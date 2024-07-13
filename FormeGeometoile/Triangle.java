import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner la hauteur du triangle : ");
        int hauteur = scanner.nextInt();
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
