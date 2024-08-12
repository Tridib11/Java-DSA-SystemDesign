package DSA.Arrays.Easy;


import java.util.* ;
import java.io.*;


public class Left_RotateArray_By_One_Place {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;

    }
}
