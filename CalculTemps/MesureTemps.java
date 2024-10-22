import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MesureTemps { 
    public static void main(String[] args) {
        int taille = 10;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < taille; i++) {
            randomNumbers.add(new Random().nextInt(100));
        }
        long start = System.currentTimeMillis();
        Collections.sort(randomNumbers);
        long end = System.currentTimeMillis();
        long temps_mesure = end - start;
        System.out.println("temps mesure entre les deux est : "+temps_mesure);
    }
    
}
