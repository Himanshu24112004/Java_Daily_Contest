import java.io.*;
import java.util.*;

public class contest22_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            int single_digit_sum = 0;
            int double_digit_sum = 0;
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt(); 
            if(arr[i] < 10){
                    single_digit_sum += arr[i];
                }
                else{
                    double_digit_sum += arr[i];
                }
            }
            if(single_digit_sum > double_digit_sum || double_digit_sum > single_digit_sum){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            } 
              
        }
        sc.close();
    }
}