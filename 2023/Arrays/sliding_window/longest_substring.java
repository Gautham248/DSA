package Arrays.sliding_window;
import java.util.*;
public class longest_substring {
    public static void main(String[] args) {
        String s="qrsvbspk";
        int max_len=Integer.MIN_VALUE;
       HashSet<Character> set=new HashSet<>();
       // ArrayList<Character> set=new ArrayList<>();
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            if(s.length()==0)
            {
                max_len=0;
                break;
            }
            if(s.length()==1)
            {
                max_len=1;
                break;
            }
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            
            set.add(s.charAt(r));
            max_len=Math.max(max_len, set.size());
            
            
            // if(!set.contains(s.charAt(i)))
            // {
            //     set.add(s.charAt(i));
            //     max_len=Math.max(max_len, set.size());
            // }
            // else
            // {
            //     set.remove(s.charAt(i));
            // }
        }
        System.out.println(max_len);
       
    }
    
}
