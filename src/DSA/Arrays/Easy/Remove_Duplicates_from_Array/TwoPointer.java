package DSA.Arrays.Easy.Remove_Duplicates_from_Array;

public class TwoPointer {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
