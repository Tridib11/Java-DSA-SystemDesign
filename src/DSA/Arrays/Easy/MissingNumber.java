package DSA.Arrays.Easy;

public class MissingNumber {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int sum=0,actualSum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        actualSum=(N*(N+1))/2;
        int missingNumber=actualSum-sum;
        return missingNumber;
    }
}
