package DSA.Arrays.Easy.Remove_Duplicates_from_Array;


import java.util.*;
class BruteForce{
    public int removeDuplicates(int[] nums) {
        // Use LinkedHashSet to maintain the order of elements
        //HashSet<Integer>set=new HashSet<>(); didnot maintain the order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int index=0;
        for(int i:set){
            nums[index++]=i;
        }
        return set.size();
    }
}
