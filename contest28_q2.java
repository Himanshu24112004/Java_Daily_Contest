import java.io.*;
import java.util.*;

public class contest28_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(long j=2; j<=n; j++){
            boolean isPrime = true;
            for(int i=2; i*i <= j; i++){
                if(j%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && j>1){
               sum += j;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}