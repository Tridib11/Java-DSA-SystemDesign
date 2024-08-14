import java.util.*;
public class Merge_two_sorted_Array {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int a_length=a.length;
        int b_length=b.length;
        ArrayList<Integer> ans=new ArrayList<>();

        int i=0,j=0;
        while(i<a_length && j<b_length){
            if(a[i]<=b[j]){
                if(ans.size()==0|| ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }else{
                if(ans.size()==0|| ans.get(ans.size()-1)!=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while(i<a_length){

            if(ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;

        }

        while(j<b_length){

            if(ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++;

        }
        return ans;

    }
}
