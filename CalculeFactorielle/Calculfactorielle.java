class Calculfactorielle {

    public static void main(String[] args)
    {
        int nombre=5;
        for(int i=1;i<=5;i++){
            if(nombre==0)
            {
                System.out.println("n'existe pas le factorielle");
            }
            else{

                nombre=nombre*i;
            }
            System.out.println(nombre);


        }
    }
}