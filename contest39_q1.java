import java.io.*;
import java.util.*;

public class contest39_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count =0;
        int sum = 0;
        
        while(sc.hasNextInt()){
            int val = sc.nextInt();
            sum += val ;
            count++;
            
            if(val>max){
               max = val;
           }
             if(val<min){
                min = val;
             }
        }
        
        
        double avg = (double)(sum -(max + min))/(count - 2);
        
        System.out.printf("%.5f",avg);
        
        sc.close();
        
    }
}
