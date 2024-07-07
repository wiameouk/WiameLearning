class Calculemoyenne{
    public static void main(String[] args)
    {
        int []tab={12,15,4,6,7};
        double somme=0;
        double moyenne=0;
        for(int i=0;i<tab.length;i++)
        {
            somme=somme+tab[i];
        } 

        System.out.println("Affiche la somme est:"+somme);
        moyenne=somme/tab.length;
        System.out.println("Affiche la moyenne est:"+moyenne);
    }
  
}