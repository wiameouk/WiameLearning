import java.util.Scanner;

class Conversiontemperature{
    public static void main(String[] args)
    {
        System.out.println("DegreTemp");
        Scanner scanner = new Scanner(System.in); 
        double degretemp= scanner.nextDouble() ;
        double  fahrenheit=0;
        System.out.println("Convertit DegreTemp Celsius à Fahrenheit.");
        fahrenheit=(degretemp*1.8)+32;
        System.out.println("Fahrenheit est : " +fahrenheit);

    }
}