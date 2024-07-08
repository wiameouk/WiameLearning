import java.util.Scanner;

class Verificaionnombrepremier{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un nombre1");
        int nombre1 = scanner.nextInt();
        System.out.println("Donner un nombre1");
        int nombre2 = scanner.nextInt();
        if((nombre1==nombre2) && ((nombre1/nombre2)==1))
        {
            System.out.println("le nombre premier est:"+nombre1);
        }
        else{
            System.out.println("n'existe pas le nombre premier");
        }
    }
}