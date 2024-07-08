import java.util.Scanner;

class TableMultiple{
    public static void main(String[]args)
    {
        int tabmultiple=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre ");
        int number = scanner.nextInt(); 
        for(int i=0;i<=6;i++)
        {
            tabmultiple=number*i;
            System.out.println(tabmultiple);
        }

    }
}
