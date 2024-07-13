import java.util.Scanner;
public class RectangleVide {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner la hauteur : ");
        int h= scanner.nextInt();
        System.out.print("Donner la largeur : ");
        int l = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == l - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

    

