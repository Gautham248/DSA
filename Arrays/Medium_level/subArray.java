package Arrays.Medium_level;

public class subArray {
    public static void main(String[] args) {
        int input[]={1,2,3,4,5,6};
        sub_array(input);
    }
    
    public static void sub_array(int input[])
    {
       
        int largest_sum=Integer.MIN_VALUE,smallest_sum=Integer.MAX_VALUE;
        for(int i=0;i<input.length;i++)
        {
            int start=i;
            for(int j=i;j<input.length;j++)
            {
                
                int end=j;
                for(int k=start,sum=0;k<=end;k++)
                {
                    System.out.print(input[k]+"");
                    sum+=input[k];
                    if(sum>largest_sum)
                    largest_sum=sum;
                    if(sum<smallest_sum)
                    smallest_sum=sum;
                 
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Largest Sum : "+largest_sum);
        System.out.println("Smallest Sum : "+smallest_sum);
    }
    
    
}
