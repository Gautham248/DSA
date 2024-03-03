package Arrays.Medium_level;

public class buy_sell_stock {
      

      // // public static void buySellStock(int input[],int size)
      // {
      //   int l=0,r=1;
      //   int profit=0,max_profit=0;
      
       
      //  while(r<size)
      //  {
      //    if(input[l]<input[r])
      //   {
      //       profit=input[r]-input[l];
      //       max_profit=Math.max(max_profit, profit);
      //       System.out.println(max_profit);
      //   }
      //   else{
      //       r=l;
      //       r++;

      //   }

      //  }
      //  System.out.println("Max : "+max_profit);
    
      // }
      public static void main(String[] args) {
        int input[]={7,1,5,3,6,4};
        // buySellStock(input,6);
        buy_sell_stock bss=new buy_sell_stock();
        System.out.println(bss.maxProfit(input));
        

      }
      public int maxProfit(int[] prices) {
        int maxProf = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < prices.length ; i++){
            if( prices[i] < min ){
                min = prices[i];
            }
            else{
                maxProf = Math.max(maxProf, prices[i] - min);
            }
        }
        return maxProf;
    }

}
