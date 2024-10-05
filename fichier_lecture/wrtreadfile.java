import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class wrtreadfile{
    public static void main(String[] args) {
        Path fileSource = Paths.get("info.txt");
        Path fileDestination = Paths.get("new.txt");

        try {
        
                BufferedWriter writer = Files.newBufferedWriter(fileSource);
                writer.write("Bonjour wiam ");
                writer.write("je suis etudiante emsi");
                writer.close();
                System.out.println("Le fichier info.txt ");
            
            BufferedReader reader = Files.newBufferedReader(fileSource);
            BufferedWriter writerfw = Files.newBufferedWriter(fileDestination);
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                writerfw.write(ligne);
                writerfw.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Fichier copié ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
