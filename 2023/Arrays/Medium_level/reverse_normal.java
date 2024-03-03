package Arrays.Medium_level;



public class reverse_normal {
    public static void main(String[] args) {
        int input[]={1,2,3,4,5};
        int left=0,right=input.length-1,temp;
    
        while(left<right)
        {
            temp=input[left];
            input[left]=input[right];
            input[right]=temp;
            left++;right--;
        }

        for(int x: input)
        {
            System.err.print(x+",");
        }

    }
}
