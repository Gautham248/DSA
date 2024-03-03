package Patterns;

public class palindromic_traingle {

    public static void main(String[] args) {
        PalindromicTriangle(4);
    }

    public static void PalindromicTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>1;k--)
            {
                System.out.print(k);
            }
            for(int l=1;l<=i;l++)
            {
                 System.out.print(l);
            }
            System.out.println();
        }
    }
    
}
