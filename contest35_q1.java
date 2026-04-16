import java.io.*;
import java.util.*;

public class contest35_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long days = 0;
        
        while(a>0 && b>0){
            
            if(a>=b){
                
            days += a/b;
            a = a%b;
        }
        else{
            days += b/a;
            b = b%a;
        }
    }
        
        System.out.println(days);
        sc.close();
    }
}
