package Patterns;

public class hollow_rectangle2 {
    public static void main(String[] args) {
        hollow_rectangle(5, 4);
    }

    public static void hollow_rectangle(int l,int b)
    {
        for(int i=1;i<=b;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(i==1||i==b||j==1||j==l)
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
