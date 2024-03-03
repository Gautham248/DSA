package Arrays;
import java.util.*;

public class chocolate_distribution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the number of chocolate packets : ");
        int size=sc.nextInt();
        System.out.print("Enter the number of students : ");
        int student_number=sc.nextInt();
        System.out.println("Enter the elements: ");
        int inputSet[]=new int[size];
        for(int i=0;i<size;i++)
        {inputSet[i]=sc.nextInt();}
        chocolate_distribution ob=new chocolate_distribution();
        ob.mergesort(inputSet, 0, size-1);
        // System.out.println("Sorted set :");
        //  for(int i=0;i<size;i++)
        // {System.out.println(inputSet[i]);}
        ob.chocolate(inputSet, student_number, size);




        sc.close();
    }

    void mergesort(int input[],int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergesort(input, left, mid);
            mergesort(input, mid+1, right);
            merge(input, left, mid, right);

        }
    }

    void merge(int input[],int left,int mid,int right)
    {
        int left_sub=mid-left+1;
        int right_sub=right-mid;
        int left_subArray[]=new int[left_sub];
        int right_subArray[]=new int[right_sub];
        for(int i=0;i<left_sub;i++)
        {
            left_subArray[i]=input[left+i];
        }
        for(int i=0;i<right_sub;i++)
        {
            right_subArray[i]=input[mid+1+i];
        }
        int i=0,j=0,k=left;
        while (i<left_sub && j<right_sub) {
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
        while(i<left_sub)
        {
            input[k]=left_subArray[i];
            i++;k++;
        }

        while(j<right_sub)
        {
            input[k]=right_subArray[j];
            j++;k++;
        }
    }
    
    int chocolate(int input[],int student_number,int size)
    {
        if(size==0||student_number==0)
        {
            return 0;
        }
        if(student_number>size)
        {
            return -1;
        }
        int min_difference=Integer.MAX_VALUE;
        int start=0,end=0;
        for(int i=0;i+student_number-1<size;i++)
        {
            int diff=input[i+student_number-1]-input[i];
            if(diff<min_difference)
            {
                min_difference=diff;
                start=i;
                end=i+student_number-1;
            }

            
        }
        System.out.println("Minimum Differece: "+min_difference);
        System.out.print("Packets: ");
        for(int i=start;i<=end;i++)
        {
            System.out.print(input[i]+" ");
            if(i!=end)
            {
                System.out.print(",");
            }
        }
        return min_difference;

    }
}
