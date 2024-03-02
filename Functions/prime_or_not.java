package Functions;

public class prime_or_not {
    public static void main(String[] args) {
        System.out.println(prime(5));
    }
    public static boolean prime(int a)
    {
        boolean isPrime=true;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                isPrime=false;
            }
        }
        return isPrime;
    }
    
}
