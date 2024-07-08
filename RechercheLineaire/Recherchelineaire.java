import java.util.Scanner;

class Recherchelineaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donne un nombre recherche");
        int nombre = scanner.nextInt();
        System.out.print("donne la taille du tableau");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        System.out.println("Remplir le tableau");
        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nombre) {
                System.out.println("Rechcerche lineare du nombre est:"+nombre);
                System.out.println("l'indexe "+i);
                break;
            }
        }    
    }
}    

       
            

    

