import java.io.*;
import java.util.*;

public class contest25_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            System.out.println("What is This??!!");
            sc.close();
            return;
        }
        
        int exp = sc.nextInt();
        double amount = 0.00;
        
        if (exp < 1000) {
            amount = exp - (exp * 0.05); // 5% discount
        } else if (exp >= 1000 && exp < 5000) {
            amount = exp - (exp * 0.10); // 10% discount
        } else if (exp >= 5000) {
            amount = exp - (exp * 0.15); // 15% discount
        } 
        
        System.out.printf("%.2f\n", amount);
        sc.close();

    }
}