package Arrays;
import java.util.*;
public class contains_duplicate_hashset {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int inputSet[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        contains_duplicate_hashset ob=new contains_duplicate_hashset();
        System.out.println(ob.containsDuplicate(inputSet));
        sc.close();
        
    }

    public boolean containsDuplicate(int input[])
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i : input)
        {
            if(!set.add(i))
            {
                return true;
            }

        }
        return false;
    }
    
}
