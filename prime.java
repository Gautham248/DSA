import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range=sc.nextInt();
        int count=0;
        for(int i=2;i<range;i++)
        {
            int flag=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                if(count>1)
                {
                    flag=1;
                    break;
                }

              
            }
              if(flag==0)
                {
                    System.out.println(i);
                }
        }
        sc.close();
    }
    
}
