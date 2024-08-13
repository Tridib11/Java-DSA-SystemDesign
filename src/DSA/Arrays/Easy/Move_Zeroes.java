package DSA.Arrays.Easy;

import java.util.*;

public class Move_Zeroes {
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp.add(a[i]);
            }
        }

        int tempSize=temp.size();
        for(int i=0;i<tempSize;i++){
            a[i]=temp.get(i);
        }

        for(int i=tempSize;i<n;i++){
            a[i]=0;
        }
        return a;
    }
}
