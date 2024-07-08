class Calculfactorielle {
    public static void main(String[] args)
    {
        int nombre=5;
        int factorielle=1;
            if(nombre==0)
            {
                System.out.println("n'existe pas le factorielle");
            }
            else{

                for(int i=1;i<=5;i++)
                {
                factorielle=factorielle*i;
                }
            }
            System.out.println(factorielle);

        }
    
}