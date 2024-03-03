package Arrays;
import java.util.*;
public class index_of_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int inputSet[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        System.out.print("Enter the target number :");
        int target=sc.nextInt();
        index_of_element ob=new index_of_element();
        ob.indexOfElement(inputSet, target);

        sc.close();
    }

    void indexOfElement(int input[],int target)
    {
     
        List<Integer> list = Arrays.stream(input).boxed().toList();
        if(list.contains(target))
        {
            System.out.println(list.indexOf(target));
        }

        //FASTEST METHOD

    //     int flag=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]==target)
    //         {
    //             flag=1;
    //             return i;
    //         }
    //     }
    //     if(flag==0)
    //     {
    //         return -1;
    //     }
    //     return 0;
    
        
    }
}
