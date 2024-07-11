import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<GestionContact> list = new ArrayList<>();
        list.add(new GestionContact("wiam", 06041574));
        list.add(new GestionContact("yahya", 06041574));
        list.add(new GestionContact("fati", 06041574));
        System.out.println("Affiche les info contact simple");
        for (GestionContact etud : list) {
            System.out.println("le nom est :"+etud.getNom() +"  " +"numero est :"+ etud.getNumero());
        }
        System.out.println("Supprime le contact simple de fati index 2");
        list.remove(2);
        for (GestionContact etud : list) {
            System.out.println(etud.getNom() + " :" + etud.getNumero());
        }

    }
}


