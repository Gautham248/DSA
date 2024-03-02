package Arrays;
import java.util.*;

public class reverse_array_recursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size=sc.nextInt();
        int inputSet[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        reverse_array_recursive ob=new reverse_array_recursive();
        ob.reverse(inputSet, 0, size-1);
        System.out.println("Reverse array : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(inputSet[i]);
        }
        sc.close();
    
    }

    void reverse(int input[],int left,int right)
    {
        if(left>right)
        {
            return;
        } 
        int temp;
        temp=input[left];
        input[left]=input[right];
        input[right]=temp;
        reverse(input, left+1, right-1);

    }
}
