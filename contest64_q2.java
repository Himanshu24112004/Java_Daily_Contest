import java.io.*;
import java.util.*;

public class contest64_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        while(test--!=0){
            int n = sc.nextInt();;
            int k = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int count  =0 ;
            for(int i=0; i<k; i++){
                int maxValue =0;
                for(int j=0; j<n; j++){
                    if(arr[j]>arr[maxValue]){
                        maxValue = j;
                    }
                }
                count +=  arr[maxValue];
                arr[maxValue] = arr[maxValue]/2;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
