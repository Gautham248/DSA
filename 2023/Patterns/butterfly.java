package Patterns;

import java.util.Scanner;

public class butterfly {
// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows=sc.nextInt();
        int i=0,j=0,space=0,k=0;

        for(i=1;i<=rows;i++)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
          for(space=1;space<=((rows*2)-(2*i));space++)
          {
            System.out.print(" ");
          }
           for(k=1;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.print("\n");

        }
        for(i=rows-1;i>=1;i--)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
          for(space=1;space<=((rows*2)-(2*i));space++)
          {
            System.out.print(" ");
          }
           for(k=1;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.print("\n");

        }
        sc.close();
    }
    
}
