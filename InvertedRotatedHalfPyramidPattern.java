//Inverted Rotated Half Pyramid Pattern
            //        *
            //       ** 
            //      ***
            //     ****

import java.util.*;
public class InvertedRotatedHalfPyramidPattern {
    public static void printInvertedRotatedHalfPyramidPattern(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows;j++) {
                if(j<=rows-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {
        printInvertedRotatedHalfPyramidPattern(s);
    }
        
}