class Recherchelineaire{
    public static void main(String[] args)
    {
        int []tab={12,13,14,15,16,17,18};
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i] == 13)
            {
                System.out.println("existe l'element recherche"+tab[i]);
                break;
            }
            else{
                System.out.println("n'existe pas l'element");
            }

        }
    }
}