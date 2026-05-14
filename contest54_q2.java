import java.io.*;
import java.util.*;

public class contest54_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<n-1; i++){
                    int maxi = Math.max(arr[i],arr[i+1]);
                System.out.print(maxi+" ");
            }
        }
        sc.close();
    }
}