package Patterns;

public class Floyd_triangle {
    public static void main(String[] args) {
        ft(5);
    }
    public static void ft(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }

    }
}
