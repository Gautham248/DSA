package Arrays.sliding_window;

public class buy_sell {
    public static void main(String[] args) {
        int input[]={7,1,5,3,6,4};
        int l=0,r;
        int max_profit=Integer.MIN_VALUE;
        for(r=1;r<input.length;r++)
        {

            if(input[r]>input[l])
            {
                int profit=input[r]-input[l];
                max_profit=Math.max(max_profit, profit);
            }
            else{
                l=r;
                r++;
            }

        }
        System.out.println(max_profit);
    }
}
