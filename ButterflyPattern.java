// Butterfly pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

import java.util.*;
public class ButterflyPattern {
    public static void printButterflyPattern(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int space = 2*rows - 2*i;
            for(int j=1;j<=space;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int space = 2*rows - 2*i;
            for(int j=1;j<=space;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {
        printButterflyPattern(s);
    }
        
}