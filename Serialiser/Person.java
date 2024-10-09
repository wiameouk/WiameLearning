import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private static final long serialVersionUID = 1;  
    private double age;
    private LocalDate datenaissance;

    public Person(double age, LocalDate datenaissance) {
        this.age = age;
        this.datenaissance = datenaissance;
    }

    public double getAge() {
        return this.age;
    }

    public LocalDate getDatenaissance() {
        return this.datenaissance;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Date naissance: " + datenaissance;
    }
}
