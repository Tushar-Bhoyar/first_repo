public class fabo
{
    public static void main(String[]args)
    {
        int term=5;
        int a=0;
        int b=1;
        int c;
        while(term!=0)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            
            term--;
        }
    }
    
}
