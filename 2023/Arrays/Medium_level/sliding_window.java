package Arrays.Medium_level;
import java.util.*;
public class sliding_window {
    //Given an array, return true if there are any two elements within a window of size k that are the same
    //2 ways-> Bruteforce Checking and Maintaining a window of unique elements using hashset

    //1
    public static boolean Brute(int input[],int k)
    {
        for(int l=0;l<input.length;l++)
        {
            for(int r=l+1;r<Math.min(input.length, l+k);r++)
            {
                if(input[l]==input[r])
                {
                    return true;
                }
            }
        }
        return false;

    }

    //2
    public static boolean window(int input[],int k)
    {
        HashSet<Integer> set = new HashSet<>(); 
        int l=0;
        for(int r=0;r<input.length;r++)
        {
            if(l+r-1>k)
            {
                set.remove(input[l]);
            }
            if(set.contains(input[r]))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int input[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Brute(input,3));
        window(input,3);

    }
}
