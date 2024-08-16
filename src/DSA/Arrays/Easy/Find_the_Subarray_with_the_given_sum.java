package DSA.Arrays.Easy;
import java.util.*;
import java.util.Arrays;

public class Find_the_Subarray_with_the_given_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5}; // Example array
        int sum = 12; // Example sum

        int[] result = largestSum(arr, sum);
        if (result[0] == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found between indices " + result[0] + " and " + result[1]);
        }
    }

    private static int[] largestSum(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = i;
                break;
            }
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        if (end == -1) {
            return new int[]{-1, -1};
        } else {
            return new int[]{start, end};
        }
    }
}
