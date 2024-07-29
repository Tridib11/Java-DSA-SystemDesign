package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalRows=sc.nextInt(); //odd
        int totalStars=1;
        for(int rows=1;rows<=totalRows;rows++){
            for(int star=1;star<=totalStars;star++){
                System.out.print(star);
            }
            System.out.println();
            if(rows<=(totalRows/2)){
                totalStars++;
            }else{
                totalStars--;
            }
        }
    }
}
