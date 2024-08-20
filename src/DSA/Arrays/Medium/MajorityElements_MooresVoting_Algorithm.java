package DSA.Arrays.Medium;

public class MajorityElements_MooresVoting_Algorithm {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }

            if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
        return cand;
    }
}
