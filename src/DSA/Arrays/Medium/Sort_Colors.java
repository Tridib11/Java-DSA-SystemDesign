package DSA.Arrays.Medium;
import java.util.*;
public class Sort_Colors {
    public static void main(String[] args) {

    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Initialize pointers for the three categories
        int i = 0; // Pointer for 0
        int j = 0; // Pointer for 1
        int k = n - 1; // Pointer for 2

        // Process elements in the array
        while (j <= k) {
            if (arr.get(j) == 1) {
                j++; // Move to the next element
            } else if (arr.get(j) == 2) {
                swap(arr, j, k); // Swap 2 to the end
                k--; // Decrease the end pointer
            } else { // arr.get(j) == 0
                swap(arr, i, j); // Swap 0 to the front
                i++; // Move the front pointer
                j++; // Move to the next element
            }
        }
    }

    // Swap method to swap elements in the ArrayList
    private static void swap(ArrayList<Integer> arr, int start, int end) {
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
    }
}
