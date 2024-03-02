package Arrays.Medium_level;

public class Max_Subarray {
    public static void main(String[] args) {
        int input[]={-2,1,-3,4,-1,2,1,-5,4};
        kadane(input, 9);
    }

    public static void kadane(int input[],int size)
    {
        int max_so_far=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
          max_so_far+=input[i];
          if(max_so_far>max)
          {
            max=max_so_far;
          }
          if(max_so_far<0)
          {
            max_so_far=0;
          }

        }
        System.out.println(max);

    }
}
