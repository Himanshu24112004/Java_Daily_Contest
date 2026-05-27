import java.io.*;
import java.util.*;

public class contest56_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        int count =0 ;
        
        while(test--!=0){
            
            long num  = sc.nextLong();
            int odd = 0;
            
            if(num==0){
                odd=1;
            }
            else{
            long temp = num;
            while(num!=0){
                odd++;
                num/=10;
            }
        }
            if(odd%2!=0){
                count++;
            }
     }
        System.out.println(count);
        sc.close();
    }
}
