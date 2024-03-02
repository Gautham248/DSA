package Practice;

public class ms_kadane2 {
    public static void main(String[] args) {
        int input[]={-2,1,-3,4,-1,2,1,-5,4};
        k(input);
        
    }

    public static void k(int input[])
    {
        int max=Integer.MIN_VALUE;
        int max_so_far=0,start=0,end=0,s=0;
        for(int i=0;i<input.length;i++)
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
        System.out.println("Max Sum : "+max);
        System.out.println("Array : ");
        for(int i=start;i<=end;i++)
        {
            
            System.out.print(input[i]);
            if(i!=end)
            {
                System.out.print(",");
            }
        }
    }
}
