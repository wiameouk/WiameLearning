import java.time.LocalDate;

public class Tache {

    private String description;
    private int priorite;
    private LocalDate date_limite;
    
    public Tache(String description, int priorite , LocalDate date_limite)
    {
        this.description=description;
        this.priorite=priorite;
        this.date_limite=date_limite;
    }
    public void settdescription(String description){
        this.description=description;

    }
    public void setpriorite(int priorite)
    {
        this.priorite=priorite;
    }
    public void setdatelimite(LocalDate date_limite)
    {
        this.date_limite=date_limite;
    }
    public String getdescription()
    {
        return this.description;
    }
    public int setpriorite()
    {
        return this.priorite;
    }
    public LocalDate setdatelimite()
    {
        return this.date_limite;
    }
    @Override
    public String toString() {
        return "Tache:  Description :" + description + " Priorite: " +priorite  + "date_limite" + date_limite ;
    }
}