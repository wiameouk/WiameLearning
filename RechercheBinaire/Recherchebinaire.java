public class Recherchebinaire {
    public static void main(String[] args) {
        int[] tab = {2, 3, 4, 10, 40, 50, 80};
        int elementbinaire = 10;
        int debut = 0;
        int fin = tab.length - 1;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;

            if (tab[milieu] == elementbinaire) {
                System.out.println("element Binaire est:"+elementbinaire );
                System.out.println("indice est :"+milieu);
                break; 
            }

            if (tab[milieu] < elementbinaire) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }
    }
}


