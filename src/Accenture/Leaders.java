package Accenture;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {62,66,64,45,33,22,12};
        System.out.println(leader(arr));
    }

    private static int leader(int[] arr) {
        int sum = 0;
        int maxFromRight = arr[arr.length - 1];

        // The rightmost element is always a leader
        sum += maxFromRight;

        // Traverse the array from second last element to the beginning
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                sum += maxFromRight;
            }
        }
        return sum;
    }
}
