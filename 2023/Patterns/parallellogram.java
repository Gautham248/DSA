package Patterns;


import java.util.Scanner;

public class parallellogram {
//      * * * * * 
//     * * * * * 
//    * * * * * 
//   * * * * *
//  * * * * *
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows=sc.nextInt();
        int i=0,j=0,space=0;

        for(i=1;i<=rows;i++)
        {
            for(space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=rows;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
