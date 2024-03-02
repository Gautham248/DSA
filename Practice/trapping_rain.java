package Practice;

public class trapping_rain {
    public static void main(String[] args) {
        int input[]={4,2,0,6,3,2,5};
        trapped(input, 7);
   
    }

    public static void trapped(int input[],int size)
    {
        int trapped_water;
        int total=0;
        for(int i=0;i<size;i++)
        {
            int right_bound=0,left_bound=0;
            for(int j=i+1;j<size;j++)
            {
                if(input[j]>right_bound)
                {
                    right_bound=input[j];
                }
            }
            for(int k=i-1;k>=0;k--)
            {
                if(input[k]>left_bound)
                {
                    left_bound=input[k];
                }   
            }
            /*  int left_bound=0,right_bound=0; 
            for(int j=i-1;j>=0;j--)
            {
                if(input[j]>left_bound)
                {
                    left_bound=input[j];
                }
            }
            for(int k=i+1;k<size;k++)
            {
                if(input[k]>right_bound)
                {
                    right_bound=input[k];
                }
            } */
            System.err.println("leftmax of "+input[i]+"="+left_bound );
            System.err.println("rightmax of "+input[i]+"="+right_bound );
            int water_level=Math.min(left_bound, right_bound);
            trapped_water=(water_level-input[i])*1;
            if(trapped_water<0)
            {
                trapped_water=0;
            }
            else
            {
                total+=trapped_water;
            }
        }
        System.out.println("Total trapped water: "+total);
    }
}
