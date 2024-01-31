//Solid Rhombus Pattern
import java.util.*;
public class SolidRhombusPattern {
    public static void printSolidRhombusPattern(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {
        printSolidRhombusPattern(s);
    }
        
}