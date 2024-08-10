package Accenture;

import java.util.Scanner;

public class Rat_House {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=0,units=0,n=0;
        System.out.println("Enter the number of rats ");
        r=sc.nextInt();
        System.out.println("Enter the number of units of Food ");
        units=sc.nextInt();
        System.out.println("Enter the size of the array ");
        n=sc.nextInt();
        System.out.println("Enter the contents in the array ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=minimumHousesRequired(r,units,n,arr);
        System.out.println(ans);
    }

    private static int minimumHousesRequired(int r, int units, int n, int[] arr) {
        if(arr==null){
            return -1;
        }
        int totalFoodRequired=r*units;
        int totalFoods=0;
        for(int i=0;i<n;i++){
            totalFoods+=arr[i];
            if(totalFoods>=totalFoodRequired){
                return i+1;
            }
        }
        return 0;
    }


}
