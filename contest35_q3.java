import java.io.*;
import java.util.*;

public class contest35_q3 {
    
    static int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
            
            for(int i=0; i< arr.length; i++){
                
                if(arr[i]< min){
                    min = arr[i];
                }
            }
        return min;
    }
    
    static int maxValue(int[] arr){
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]>max){
                    max =arr[i];
                }
            }
        return max;
    }
    
    static int GCD(int n1, int n2){
        int gcd = 1;
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new  Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- != 0){
            
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int res = GCD(minValue(arr),maxValue(arr));
            System.out.println(res);
           
        }
        sc.close();
    }
}