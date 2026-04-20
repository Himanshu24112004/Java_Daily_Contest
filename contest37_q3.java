import java.io.*;
import java.util.*;

public class contest37_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        long actualSum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }
        
        long expectedSum = (long)n * (n + 1) / 2;
        long missing = expectedSum - actualSum;
        
        System.out.println(missing);
        sc.close();
    }
}
