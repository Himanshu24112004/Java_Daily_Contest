import java.io.*;
import java.util.*;

public class contest37_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Start from the last digit and add 1
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i]++;   // No carry needed
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                sc.close();
                return;
            }
            arr[i] = 0; // Carry over
        }
        
        // If all digits were 9, we need an extra digit at the front
        System.out.print("1 ");
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}
