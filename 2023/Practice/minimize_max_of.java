package Practice;
import java.util.*;
public class minimize_max_of {
    public static void main(String[] args) {
        minimize_max_of ob=new minimize_max_of();
        ob.minimizeSet(2, 4, 8, 2);
    }
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int max=1;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        //first set- uniqueCnt1 numbers not divisible by divisor1
        for(int i=0;i< uniqueCnt1;i++)
        {
            if(max% divisor1!=0)
            {
                arr1.add(max);
                
            }
            max++;
        }
        Collections.sort(arr1,Collections.reverseOrder());
        //secondset-  uniqueCnt2 numbers not divisible by divisor2, shouldnt be in set1
        max=1;
        for(int i=0;i<uniqueCnt2;i++)
        {
            if(max% divisor2!=0&&max% divisor1!=0)
            {
                arr2.add(max);
            }
            max++;

        }
        Collections.sort(arr2,Collections.reverseOrder());
        int largest=(arr1.get(0)>arr2.get(0))?arr1.get(0):arr2.get(0);
        return largest;

    }
}
