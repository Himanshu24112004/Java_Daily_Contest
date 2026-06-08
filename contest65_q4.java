import java.io.*;
import java.util.*;

public class contest65_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        
        int leftSum = 0;
        for(int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            int diff = Math.abs(leftSum - rightSum);
            System.out.print(diff + " ");
            leftSum += arr[i];
        }
        sc.close();
    }
}
