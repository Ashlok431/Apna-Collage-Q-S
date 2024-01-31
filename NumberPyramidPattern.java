//Number Pyramid Pattern
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5

import java.util.*;
public class NumberPyramidPattern {
    public static void printNumberPyramidPattern(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {
        printNumberPyramidPattern(s);
    }
        
}