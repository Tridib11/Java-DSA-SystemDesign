package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalRows=sc.nextInt();
        int totalSpaces=totalRows/2;
        int totalStars=1;
        for(int rows=1;rows<=totalRows;rows++){
            //spaces
            for(int spaces=1;spaces<=totalSpaces;spaces++){
                System.out.print(" ");
            }
            //stars
            for(int stars=1;stars<=totalStars;stars++){
                System.out.print("*");
            }

            //newLineStart
            System.out.println();
            if(rows<=totalRows/2){
                totalStars+=2;
                totalSpaces-=1;
            }
            else{
                totalStars-=2;
                totalSpaces+=1;

            }
        }
    }
}
