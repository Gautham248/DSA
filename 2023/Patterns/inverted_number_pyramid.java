package Patterns;

public class inverted_number_pyramid {
    public static void main(String[] args) {
        pyramid(5);
    }
    public static void pyramid(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
