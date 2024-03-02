package Functions;


public class binomial_coefficient {

    public static int factorial(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }

    public static int binomialCoefficient(int a,int b)
    {
        int a_fact=factorial(a);
        int b_fact=factorial(b);
        int dmr_fact=factorial(a-b);
        int bc;
        bc=a_fact/(b_fact*dmr_fact);
        return bc;
    }
    public static void main(String[] args) {
      
      System.out.println(binomialCoefficient(5, 2));


    }
}
