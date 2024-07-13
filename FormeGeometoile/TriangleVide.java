import java.util.Scanner;

public class TriangleVide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner la hauteur du triangle : ");
        int hauteur = scanner.nextInt();
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == hauteur - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

