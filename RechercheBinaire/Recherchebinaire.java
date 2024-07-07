class Rechercherbinaire{
    public static void main(String[] args)
    {
       int [] tab={2,0,1,4,1};
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==0 || tab[i]==1){
                System.out.println("le nombre est binaire="+tab[i]);
            }
        }
    }
}