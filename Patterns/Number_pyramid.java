package Patterns;

public class Number_pyramid {
    public static void main(String[] args) {
        Diamond(7);
    }

    public static void Diamond(int n)
    {
        int i,space,j;
        int rows=n;
        for(i=1;i<=rows;i++)
        {
            for(space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=(2*i)-1;k++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=0;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=(2*i)-1;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }

    
}
