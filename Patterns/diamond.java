package Patterns;

public class diamond {
    public static void main(String[] args) {
        Diamond(4);
    }

    public static void Diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
