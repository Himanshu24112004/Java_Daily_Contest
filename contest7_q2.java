import java.io.*;
import java.util.*;

public class contest7_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new  Scanner(System.in);
        long T = sc.nextLong();
        for(long i=1; i<=T; i++){
            int n = sc.nextInt();
            long sum =0;
            for(int j= 1; j<=n; j++){
                long num = sc.nextLong();
                sum += num;
            }
            if(sum%2==0){
                System.out.println("PURE");
            }
            else{
                System.out.println("CORRUPTED");
            }
        }
        sc.close();
    }
}