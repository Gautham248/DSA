package Arrays;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        System.out.println("Original array: " + Arrays.toString(array));

        if (nextPermutation(array)) {
            System.out.println("Next permutation: " + Arrays.toString(array));
        } else {
            System.out.println("No next permutation. It is the last permutation.");
        }
    }

    // Function to find the next permutation of the array
    static boolean nextPermutation(int[] array) {
        int i = array.length - 2;

        // Find the first element from the right that is smaller than the element to its right
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        // If no such element is found, array is in descending order, no next permutation exists
        if (i < 0) {
            return false;
        }

        // Find the smallest element to the right of i that is greater than array[i]
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        // Swap array[i] and array[j]
        swap(array, i, j);

        // Reverse the elements to the right of i
        reverse(array, i + 1, array.length - 1);

        return true;
    }

    // Helper function to swap two elements in an array
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Helper function to reverse elements in a range of the array
    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
