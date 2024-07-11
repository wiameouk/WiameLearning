import java.util.Scanner;

class  Calculemassecorporelle{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Donne votre taille  : ");
          float taille = scanner.nextFloat();
          System.out.println("Donne votre poids  : ");
          float poids = scanner.nextFloat();
          float masseCorporelle = poids / (taille * taille);
            if (masseCorporelle < 18.5) {
              System.out.printf("Maigreur : "+ masseCorporelle);
          } else if (masseCorporelle >= 18.5 && masseCorporelle < 25) {
              System.out.printf("Normale : "+ masseCorporelle);
          } else if (masseCorporelle >= 25 && masseCorporelle < 30) {
              System.out.printf("Surpoids :"+masseCorporelle);
          } else if (masseCorporelle >= 30 && masseCorporelle < 35) {
              System.out.printf("Obésité : "+masseCorporelle);
          } else {
              System.out.printf("Obésité sévère : " +masseCorporelle);
          }
  
          scanner.close();

    }
}
