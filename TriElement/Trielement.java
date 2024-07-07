class Trielement {
    public static void main(String[] args)
    {
        int []tab={8,2,9,4,1};
        int temp=0;
        for(int i=0; i<tab.length;i++)
        {
        	for(int j=1;j<(tab.length-i);j++)
            {
            if (tab[j-1] > tab[j]) { //tab[0]>tab[2]=>8>2
                    temp = tab[j-1];
                    tab[j-1] = tab[j];//2,8
                    tab[j] = temp;
            }
            }     
        }   
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
    }
}