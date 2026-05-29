import java.io.*;
import java.util.*;

public class contest58_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            int sum = 0; 
            int temp = arr[i];
            while(temp!=0){
                sum += temp%10;
                temp/=10;
            }
            arr[i] = sum ;
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
