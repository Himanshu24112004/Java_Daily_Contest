import java.io.*;
import java.util.*;

public class contest62 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int maxCount = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(arr[i]==max){
                maxCount++;
            }
        }

       int actualCount = n - maxCount;
       int actualSum = sum - max;
       
       System.out.println("Sum = "+actualSum);
       System.out.println("Count = "+actualCount);
       sc.close();
    }
}