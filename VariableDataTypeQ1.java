//In a program, input 3 number :A,B and C.You have to output the average of these 3 numbers.
import java.util.*;
// Average of 3 numbers
public class VariableDataTypeQ1 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int average = (A + B + C) / 3;

    System.out.println("average is :" + average);
    }
}