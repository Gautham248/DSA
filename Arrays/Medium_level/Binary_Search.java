package Arrays.Medium_level;

public class Binary_Search {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int input[],int key)

    {
        int start=0,end=input.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(input[mid]==key)
            {
                return mid;
            }
            if(input[mid]<key)
            {
                 start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;


    }

    
}
