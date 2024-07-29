package DSA.Arrays.Easy;
//https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?leftPanelTabValue=SUBMISSION
public class SecondLargest {
    public static void main(String[] args) {

    }

    public int[] secondLargestAndSmallest(int[] a,int n){
        int largestNumber=a[0];
        int secondLargest=-1;
        for(int i=1;i<a.length;i++){
            if(a[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=a[i];
            }
            else if (a[i] > secondLargest && a[i] != largestNumber) {
                secondLargest = a[i];
            }
        }

        int secondSmallest=Integer.MAX_VALUE;
        int smallestNumber=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<smallestNumber){
                secondSmallest=smallestNumber;
                smallestNumber=a[i];
            }
            else if (a[i] < secondSmallest && a[i] != smallestNumber) {
                secondSmallest = a[i];
            }
        }
        return new int[]{secondLargest,secondSmallest};
    }
}
