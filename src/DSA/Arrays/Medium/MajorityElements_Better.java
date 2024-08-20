package DSA.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements_Better {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] v) {
        // Write your code here
        int n = v.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < v.length; i++) {
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}

