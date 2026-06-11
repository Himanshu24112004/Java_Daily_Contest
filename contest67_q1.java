import java.io.*;
import java.util.*;

public class contest67_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        } 
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]< min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex + maxIndex);
        sc.close();
    }
}

