import java.io.*;
import java.util.*;

public class contest24_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        long k = sc.nextLong(); 
        long x = sc.nextLong(); 
        long y = sc.nextLong(); 

        long minCost;
        if (x <= y) {
                minCost = n * x;
        } else {
            minCost = (k * x) + ((n - k) * y);
        }

        System.out.println(minCost);
    }
}
