import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Etudiant> list = new ArrayList<>();
        list.add(new Etudiant("wiam", 21));
        list.add(new Etudiant("yahya", 22));
        list.add(new Etudiant("fati", 21));
        System.out.println("Affiche les info contact simple");
        for (Etudiant etud : list) {
            System.out.println("le nom est :"+etud.getNom() +"  " +"l'age est :"+ etud.getAge());
        }
        System.out.println("Supprime le contact simple de fati index 2");
        list.remove(2);
        for (Etudiant etud : list) {
            System.out.println(etud.getNom() + " :" + etud.getAge());
        }

    }
}


