import java.io.*;
import java.util.*;

public class contest52_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        
        int maxi = Integer.MIN_VALUE ;
        int  current ;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                current = arr[i]*arr[j];
                maxi = Math.max(current , maxi);
            }
        }
        System.out.println(maxi);
        sc.close();
    }
}