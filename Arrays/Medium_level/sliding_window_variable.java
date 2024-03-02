package Arrays.Medium_level;

public class sliding_window_variable {
//Q: Find the length of the longest
//subarray, with the same value in
//each position.
public static void main(String[] args) {
    int input[]={4,2,2,2,2,3,3,3};
   System.out.println(swv(input));
   System.out.println(swv2(input,6));
}

public static int swv(int input[])
{
    int length=0,l=0;
    for(int r=0;r<input.length;r++)
    {
        if(input[l]!=input[r])
        {
            l=r;
        }
        length=Math.max(length, r-l+1);
    }
    return length;
}

 // Find length of minimum size subarray where the sum is 
    // greater than or equal to the target: O(n)

    public static int swv2(int input[],int target)
    {
        int total=0,l=0;
        int length=Integer.MAX_VALUE;
        for(int r=0;r<input.length;r++)
        {
            total+=input[r];
            while(total>=target)
            {
                length = Math.min(r-l+1, length);
                total-=input[l];
                l++;

            }
           
        }
      
        return length;
    }

// public static int swv(int input[])
// {
//     int l=0,max=0;
//     int count=0;
//     for(int r=l;r<input.length;r++)
//     {
        
//         if(input[l]==input[r])
//         {
//             count++;
//             if(count>max)
//             {
//                 max=count;
                
//             }
//         }
//         else{
//             l=r;
//             count=0;
//         }
//     }
//     return max;

// }
    
}
