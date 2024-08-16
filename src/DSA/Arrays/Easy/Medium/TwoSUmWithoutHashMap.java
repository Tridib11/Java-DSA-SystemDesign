package DSA.Arrays.Easy.Medium;


import java.util.*;
public class TwoSUmWithoutHashMap {
    public static String read(int n, int []book, int target){
        // Write your code here.

        Arrays.sort(book);
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=book[start]+book[end];
            if(sum==target){
                return "YES";
            }else if(sum<target){
                start++;
            } else{
                end--;
            }
        }
        return "NO";
    }
}
