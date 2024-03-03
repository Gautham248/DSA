package Arrays.Medium_level;
import java.util.*;

public class permutations_of_an_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int inputSet[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        sc.close();
        findPermutations(inputSet, 0);
    }
    static void findPermutations(int input[],int index)
    {
        if(index==input.length-1)
        {
            System.out.println(Arrays.toString(input));

        }
        else
        {
            for(int i=index;i<input.length;i++)
            {
                swap(input,index,i);
                findPermutations(input, index+1);
                swap(input, index, i);

            }
        }

    }
    static void swap(int input[],int i,int j)
    {
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }
}
