import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localdatetime {
    public static void main(String[] args) {

        Path file = Paths.get("info.txt");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd /MMM/yyyy : HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime futuredays = now.plusDays(3).plusHours(1);
        LocalDateTime passdays = now.minusDays(3).minusHours(1);

        try (BufferedWriter bfw = Files.newBufferedWriter(file)) {
            String datetimenow = f.format((now));
            String future = f.format((futuredays));
            String pass = f.format((passdays));
            bfw.write(datetimenow);
            bfw.write(future);
            bfw.write(pass);
            System.out.println("Date and Time now: ");
            System.out.println(datetimenow);
            System.out.println("Date and Time future :");
            System.out.println(future);
            System.out.println("Date and Time passe:");
            System.out.println(pass);


        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
