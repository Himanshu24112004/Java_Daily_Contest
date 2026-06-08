import java.io.*;
import java.util.*;

public class contest65_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println(max - min);
        sc.close();
    }
}
