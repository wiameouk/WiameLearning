import java.util.Scanner;
class NombrePaireImpaire{
    public static void main (String[]args){
        Scanner scanner = new Scanner( System.in);
        System.out.print( " saisir un nomber : ");

        int number= scanner.nextInt();

        if(number%2==0)
        {
            System.out.println("le nombre est paire");
            System.out.println(number);

        }
        else{
            System.out.println("le nombre est impaire");
            System.out.println(number);

        }
        
        
    }
}