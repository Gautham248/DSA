package Arrays.Medium_level;

public class Pairs_in_array {

    public static void main(String[] args) {
        int input[]={1,2,3,4,5};
        pairs(input);
    }
    public static void pairs(int input[])
    {
        for(int i=1;i<=input.length;i++)
        {
            for(int j=i+1;j<=input.length;j++)
            {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }
}
