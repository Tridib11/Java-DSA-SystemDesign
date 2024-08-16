package DSA.Arrays.Easy;


import java.util.*;

public class LargestSubaaraySumTesting {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9}; // Example array
        int sum = 15; // Example sum

        int result = lenOfLongSubarr(arr,arr.length, sum);
        System.out.println(result);
    }

    public static int lenOfLongSubarr (int arr[], int N, int sum) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int largestSubarrayLength=0;
        int start = 0;
        int end = -1;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            currentSum += arr[i];
            if (currentSum - sum == 0) {
                start = 0;
                end = i;
                largestSubarrayLength=Math.max(largestSubarrayLength,(end-start)+1);

            }else  if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = i;
                largestSubarrayLength=Math.max(largestSubarrayLength,(end-start)+1);

            }
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }
        return largestSubarrayLength;
    }
}
