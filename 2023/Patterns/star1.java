package Patterns;
import java.util.*;

public class star1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
        for(int i=rows-1;i>=0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
                        System.out.print("\n");

        }

        sc.close();
    }
}
