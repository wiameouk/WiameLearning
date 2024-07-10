import java.util.Scanner;

class  Calculemassecorporelle{
    public static void main(String[] args )
    {
        System.out.println("Donne la taille");
        Scanner scanner = new Scanner(System.in);  
        float taille= scanner.nextFloat();
        System.out.println("Donne la taille");
        float poids= scanner.nextFloat();
        float masseCorporelle= poids*(taille/taille);
        if(masseCorporelle<18.5)
        {
            System.out.printf("Maigreur"+masseCorporelle);
        }
        else if(masseCorporelle > 18.5 && masseCorporelle<25)
        {
            System.out.println("normale"+masseCorporelle);
        }
        else if(masseCorporelle>=25 && masseCorporelle<30)
        {
            System.out.println("Surpoids"+masseCorporelle);
        }
        else if(masseCorporelle >=30 && masseCorporelle<35)
        {
            System.out.println("obésité"+masseCorporelle);
        }
        else 
        {
            System.out.println("Obésité sévere "+ masseCorporelle);
        }
        scanner.close();

    }
}
