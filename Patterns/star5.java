package Patterns;

import java.util.Scanner;

public class star5 {
// *********
//  *******
//   *****
//    ***
//     *
       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows=sc.nextInt();
        int i=0,j=0,space=0;

        for(i=rows;i>=1;i--)
        {
            for(space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=((2*i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
