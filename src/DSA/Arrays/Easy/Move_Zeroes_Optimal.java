package DSA.Arrays.Easy;


public class Move_Zeroes_Optimal {
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return a;
        }

        for(int i=j+1;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }

        return a;





    }
}
