//Palindromoic Pattern with Numbers pattern
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.*;
public class PalindromicPattern {
    public static void printPalindromicPattern(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {
        printPalindromicPattern(s);
    }
        
}
