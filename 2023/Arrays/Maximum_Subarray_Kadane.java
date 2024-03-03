package Arrays;
import java.util.*;
public class Maximum_Subarray_Kadane {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int inputSet[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        Maximum_Subarray_Kadane ob=new Maximum_Subarray_Kadane();
        ob.maximum_subarrray(inputSet, size);

        sc.close();
    }

    void maximum_subarrray(int input[],int size)
    {
        int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
        int start=0,end=0,s=0;


        for(int i=0;i<size;i++)
        {
            max_ending_here+=input[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here;
                start=s;
                end=i;
            }
            if(max_ending_here<0)
            {
                max_ending_here=0;
                s=i+1;
            }
        }

        System.out.println("The maximum contiguous sum is : "+max_so_far);
        System.out.print("The Maximum subarray is : ");
        for(int i=start;i<=end;i++)
        {
            System.out.print(input[i]);
            if(i!=end)
            System.out.print(",");
        }

        
    }
    
}
