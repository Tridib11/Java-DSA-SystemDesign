package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalStars=1;
        int totalRows=n;
        int totalSpaces=n-1;
        for(int row=1;row<=totalRows;row++){
            //spaces
            for(int space=1;space<=totalSpaces;space++){
                System.out.print(" ");
            }
            //stars
            for(int star=1;star<=totalStars;star++){
                System.out.print("*");
            }
            System.out.println();
            totalStars+=2;
            totalSpaces-=1;
        }
    }
}
