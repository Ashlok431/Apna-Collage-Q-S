import java.util.*;
public class LoopsQ4 {
    public static void printMultiplicationTable(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println(n + "*" + i + "=" + n*i);
          }
    }

    public static void main(String s[]) {
        printMultiplicationTable(s);
    }
        

    }