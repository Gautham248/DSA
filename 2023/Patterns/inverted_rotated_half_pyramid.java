package Patterns;



public class inverted_rotated_half_pyramid {
    public static void main(String[] args) {
        figure(4);
    }

    public static void figure(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i+j>n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
