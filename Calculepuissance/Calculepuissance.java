class Calculepuissance{
    public static void main(String[] args)
    {
       int degre=4;
       int nombre=3;
       int total=1;  
       for(int i=0;i<degre;i++)
       {
        if(degre==0)
       {
       System.out.println("Existe toujours :"+total);
       }
       else{
              total=total*nombre;
       }
                     System.out.println("Affiche puissances"+total);   
       }
    
    }
}