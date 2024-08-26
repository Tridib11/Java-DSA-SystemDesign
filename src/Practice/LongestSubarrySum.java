package Practice;

import java.util.HashMap;

public class LongestSubarrySum {
    public static void main(String[] args) {

    }

    public static int getLongestSubarray(int[] nums, int k) {
        // Write your code here.
        int largestLength = 0;
        int start = 0, end = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum - k == 0) {
                start = 0;
                end = i;
                largestLength = Math.max(largestLength, (end - start) + 1);
            }
            if (map.containsKey(currentSum - k)) {
                start = map.get(currentSum - k) + 1;
                end = i;
                largestLength = Math.max(largestLength, (end - start) + 1);
            }

            if(!map.containsKey(currentSum)){
                map.put(currentSum,i);
            }

        }

        return largestLength;

    }
}
