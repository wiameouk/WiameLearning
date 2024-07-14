import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donne nombre: ");
        int n = scanner.nextInt();        
        int a = 0, b = 1;
        System.out.print("Les nombres de Fibonacci sont ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a);
            int fibonaci = a + b;
            a = b;
            b = fibonaci;

        }


    }
}
