import java.time.LocalDate;

public class Tache {
    private String description;
    private LocalDate date;

    public Tache(String description , LocalDate date){
        this.description = description;
        this.date=date;
    }
    public String getdescription(){
        return description;

    }
    public LocalDate getlocaldate(){
        return date;
    }
    public void setdescription(String description)
    {
        this.description =description;
    }
    public void setlocaldate(LocalDate date){
        this.date=date;
    }
    @Override
    public String toString() {
        return "Tache: " + description + ", Date limite: " + date;
    }
    
}   




