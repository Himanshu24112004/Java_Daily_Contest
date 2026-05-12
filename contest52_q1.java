import java.io.*;
import java.util.*;

public class contest52_q1 {
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++ ){
            arr[i] =sc.nextInt();
        }
        
        int res = arr[0];
        
        for(int i=1; i<n; i++){
            res = gcd(res , arr[i]);
        }
        
        System.out.println(res);
        sc.close();
    }
}
