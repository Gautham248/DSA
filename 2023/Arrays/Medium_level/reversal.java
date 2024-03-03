package Arrays.Medium_level;

public class reversal {
    public static void main(String[] args) {
        int input[]={1,2,3,4,5};
        reverse(input, 0, input.length-1);
        for(int x: input)
        {
            System.err.print(x+",");
        }
    }
    public static void reverse(int input[],int left,int right)
    {
        if(left>right)
        {
            return;
        }
              int temp;
        temp=input[left];
        input[left]=input[right];
        input[right]=temp;
            reverse(input, left+1, right-1);

      
    }
}
