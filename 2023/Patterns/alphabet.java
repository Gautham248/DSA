package Patterns;

import java.util.Scanner;

public class alphabet {
//      A
//     BC
//    DEF
//   GHIJ
//  KLMNO
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows=sc.nextInt();
        int i=0,j=0;
        char c='A';
    

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=rows;j++)
            {
                if(i+j<=rows)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(c++);
                }
               
            }
             System.out.print("\n");
        }
        sc.close();
        
    }

}
