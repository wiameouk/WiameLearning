import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        System.out.print("Donne le mot: ");
        Scanner scanner = new Scanner(System.in);  
        String chaine = scanner.nextLine();
        int  taille = chaine.length();
        char[] charArray = chaine.toCharArray();
        boolean verification=false;
        for(int i = 0; i < taille/2; i++)
        {
            if(charArray[i]==charArray[taille-1-i]){
                verification=true;
                break;  
            }
        }
        if(verification==true)
        {
            System.out.println("Le mot est un palindrome.");
        }
        else{
            System.out.println("Le mot n'est pas  un palindrome.");

        }
           
        
    }
  

}


