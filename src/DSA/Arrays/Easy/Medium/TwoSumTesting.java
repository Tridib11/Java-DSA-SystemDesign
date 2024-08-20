package DSA.Arrays.Easy.Medium;
import java.util.*;
public class TwoSumTesting {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int[] ans=twoSum(arr,6);
        System.out.println(Arrays.toString(ans));
    }
        public static int[] twoSum(int[] nums, int target) {
            int[] temp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(temp);
            int start = 0;
            int end = nums.length - 1;

            while (start < end) {
                int sum = temp[start] + temp[end];
                if (sum == target) {
                    // Find the indices in the original array `nums`
                    int index1 = search(temp[start], nums, -1);
                    int index2 = search(temp[end], nums, index1);
                    return new int[]{index1, index2};
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
            return new int[]{-1, -1};
        }

        private static int search(int target, int[] arr, int excludedIndex) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target && i != excludedIndex) {
                    return i;
                }
            }
            return -1;
        }
    }

