package Arrays;
import java.util.Arrays;

public class ArrayPermutations {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        findPermutations(array, 0);
    }

    // Function to find all permutations of the array
    static void findPermutations(int[] array, int index) {
        if (index == array.length - 1) {
            // Print the current permutation
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = index; i < array.length; i++) {
                // Swap elements at index and i
                swap(array, index, i);
                // Recursively find permutations for the remaining elements
                findPermutations(array, index + 1);
                // Backtrack: undo the swap to explore other possibilities
                swap(array, index, i);
            }
        }
    }

    // Helper function to swap two elements in an array
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
