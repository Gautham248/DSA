package Practice;

public class maximum_subarray {
    public static void main(String[] args) {
        int input[]={-2,1,-3,4,-1,2,1,-5,4};
        kadanes_algorithm(input, 9);
    }
    
    public static void kadanes_algorithm(int input[],int size)
    {
        int max_so_far=0;
        int max=Integer.MIN_VALUE;
        int start=0,end=0,s=0;
        for(int i=0;i<size;i++)
            {
                max_so_far+=input[i];
                if(max_so_far>max)
                {
                    max=max_so_far;
                    start=s;
                    end=i;
                }
                if(max_so_far<0)
                {
                    max_so_far=0;
                    s=i+1;
                }
            }
            System.out.println("Max Sum :"+max);
            System.out.println("Maximum Subarray : ");
            for(int i=start;i<=end;i++)
            {
                System.out.print(input[i]);
                if(i!=end)
                System.out.print(",");
            }

        

    }
}
