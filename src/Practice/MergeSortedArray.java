package Practice;

import java.util.*;
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        int[] b={2,3,5};
        List<Integer> ans=sortedArray(a,b);
        System.out.println(ans);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i=0,j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<a.length && j<b.length ){
            if(a[i]<=b[j]){
                if(ans.isEmpty() || ans.getLast()!=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }
            else{
                if(ans.isEmpty() || ans.getLast()!=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while(i<a.length){
            if(ans.getLast()!=a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        while(j<b.length){
            if(ans.getLast()!=b[j]){
                ans.add(b[j]);
            }
            j++;
        }


        return ans;
    }
}