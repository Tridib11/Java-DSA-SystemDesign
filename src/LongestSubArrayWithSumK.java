import java.util.*;
public class LongestSubArrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        HashMap<Long,Integer> map=new HashMap<>();
        int length=0;
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                length=i+1;
            }
            else if(map.containsKey(sum-k)){
                length=Math.max(length,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return length;



    }
}
