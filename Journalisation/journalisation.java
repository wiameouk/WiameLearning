import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class journalisation {

    public static void main(String[] args) {
        
        Path  file = Paths.get("info.txt");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MMM/yyy : HH:mm");
        LocalDateTime now = LocalDateTime.now();
        String timestamp = f.format(now);
        String message = "bonjour je suis wiam";
        String journalMessage = timestamp + " " + message;

        try (  BufferedWriter bfw = Files.newBufferedWriter(file)){

            bfw.write(journalMessage);

            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

} 