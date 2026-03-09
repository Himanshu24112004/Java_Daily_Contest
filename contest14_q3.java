import java.io.*;
import java.util.*;

public class contest14_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        for(int i=1; i<=test; i++){
            int day = sc.nextInt(); 
            int even = 0 ;
             int odd= 0;
            int max = 0;
            for(int j=1; j<=day; j++){
                int hr =sc.nextInt();
                if(j%2==0){
                    even += hr;
                }
                else{
                    odd += hr;
                }
            }
             max = Math.max(even, odd);
            System.out.println(max);
        }
        sc.close();
    }
}
