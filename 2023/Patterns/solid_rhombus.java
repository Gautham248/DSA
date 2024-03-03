package Patterns;

public class solid_rhombus {
    public static void main(String[] args) {
        solidRhombus(4);
    }

    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<(2*n);j++)
            {
                if(i+j>n && i+j<=(n*2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
