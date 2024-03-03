package Arrays.Medium_level;
import java.util.*;
public class longest_substring {
    public static void main(String[] args) {
        String input="pwwkew";
        //left ptr marks the beginning of the set, right marks the end
        HashSet<Character> set = new HashSet<>();
        int left=0,max=0;
        for(int right=0;right<input.length();right++)
        {
            if(set.contains(input.charAt(right)))
            {
                    set.remove(input.charAt(left));
                    left++;
            }
            else{
                set.add(input.charAt(right));
            }
            max=Math.max(max, right-left+1);
        }
        System.out.println(max);
    }
}
