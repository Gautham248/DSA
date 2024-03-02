package Arrays;
import java.util.*;
public class max_min_element_in_array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int size=sc.nextInt();
        int[] inputSet= new int[size];

        System.out.println("Enter the inputs : ");
        for(int i=0;i<size;i++)
        {
            inputSet[i]=sc.nextInt();
        }

        sc.close();

        max_min_element_in_array ob=new max_min_element_in_array();
        ob.mergeSort(inputSet, 0, size-1);

        System.out.println("Sorted Array : ");
          for(int i=0;i<size;i++)
        {
             System.out.println(inputSet[i]);
        }

        System.out.println("Max Element : "+ inputSet[size-1]);
        System.out.println("Min Element : "+ inputSet[0]);

    }

    void mergeSort(int input[],int left,int right){
        if(left<right)
        {
            int mid=(left+right)/2;
            mergeSort(input, left, mid);
            mergeSort(input, mid+1, right);
            merge(input,left,mid,right);
        }

    
        
    }
    
    void merge(int input[],int left,int mid,int right){
        int left_sub=mid-left+1;
        int right_sub=right-mid;

        int left_subArray[]=new int[left_sub];
        int right_subArray[]=new int[right_sub];

        for(int i=0;i<left_sub;i++)
        {left_subArray[i]=input[left+i];}
        for(int i=0;i<right_sub;i++)
        {right_subArray[i]=input[mid+i+1];}

        int i=0,j=0,k=left;
        while(i<left_sub && j<right_sub)
        {
            if(left_subArray[i]<=right_subArray[j])
            {
                input[k]=left_subArray[i];
                i++;
            }
            else{
                input[k]=right_subArray[j];
                j++;
            }
            k++;
        }

        while(i<left_sub){
            input[k]=left_subArray[i];
            i++;k++;
        }
        while(j<right_sub)
        {
            input[k]=right_subArray[j];
            j++;k++;
        }



    }
    

}
