package Arrays.sliding_window;

public class sum_of_subarray {
    //max sum of subarray of length k
   public static void main(String[] args) {
     int input[]={1,2,3,4,5,6};
    int k=3;
    int sum=0;
    //sliding window
    int l=0;
    int max_sum=Integer.MIN_VALUE;
    for(int r=0;r<input.length;r++)
    {
      sum+=input[r];
      
      if(r-l+1>k)
      {
        sum-=input[l];
        l++;
        max_sum=Math.max(max_sum, sum);
      } 
    }
    System.out.println("Max : "+max_sum);
    
   }
   
}
