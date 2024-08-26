package Practice;

import java.util.*;
public class MergeSortedArray {

    public static void main(String[] args) {

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




    }
}