package Arrays.sliding_window;

public class sum_greater_than_x {
    public static void main(String[] args) {
        //smallest subarray that sums up to k
        int input[]={1,2,3,4,5,6};
        int k=7,total=0,l=0,size=Integer.MAX_VALUE;
        for(int i=0;i<input.length;i++)
        {
            total+=input[i];
            while(total>=k)
            {
                size=Math.min(size, i-l+1);
                total-=input[l];
                l++;
            }

        }
        System.out.println(size);
    }
    
}
