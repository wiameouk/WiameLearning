import java.util.Scanner;

class Conversiontemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne Celsius : ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Convertit de celsius à fahrenheut est :"+ fahrenheit );
        System.out.println("Donne Fahrenheit : ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Convertit de celsius à fahrenheit est :"+ celsius );

        
    }
}
