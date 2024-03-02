package Patterns;

import java.util.Scanner;

public class hollow_rectangle {
// *****
// *   *
// *   *
// *   *
// *****
    
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length :");
        int Rows=sc.nextInt();
        System.out.println("Enter the Breadth :");
        int Cols=sc.nextInt();
        int i=0,j=0;
       for(i=1;i<=Rows;i++)
       {
        for(j=0;j<=Cols;j++)
        {
            if(j==0||j==Cols||i==1||i==Rows)
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
    

     
        sc.close();
        
    }

}
