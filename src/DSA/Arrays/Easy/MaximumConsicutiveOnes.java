package DSA.Arrays.Easy;

public class MaximumConsicutiveOnes {
    public static int consecutiveOnes(int n, int[] arr) {
        // Write your code here.
        int maxOnes=0;
        int count=0;
        for(int i=0;i<n;i++){



            if(arr[i]==1){
                count+=1;
            }else{
                count=0;
            }
            maxOnes=Math.max(maxOnes,count);
        }

        return maxOnes;
    }
}
