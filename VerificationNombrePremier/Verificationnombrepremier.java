import java.util.Scanner;

class Verificationnombrepremier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner un nombre: ");
        int nombre = scanner.nextInt();
        boolean VerificationNombrePremier = true;

        if (nombre <= 1) {
            VerificationNombrePremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) {
                    VerificationNombrePremier = false;
                    break;
                }
            }
        }
        if (VerificationNombrePremier) {
            System.out.println("Le nombre est un nombre premier" + nombre );
        } else {
            System.out.println("Le nombre  n'est pas un nombre premier" + nombre );
        }
    }
}
