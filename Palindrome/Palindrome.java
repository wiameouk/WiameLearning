import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        System.out.print("Donne le mot: ");
        Scanner scanner = new Scanner(System.in);  
        String chaine = scanner.nextLine();
        int  taille = chaine.length();
        char[] charArray = chaine.toCharArray();
        for(int i = taille - 1, j = 0; i >= 0; i--,j++)
        {
            if(charArray[i]==charArray[j]){
                System.out.println(" palindrome");
                break;  

            }
        }
        
    }
  

}


