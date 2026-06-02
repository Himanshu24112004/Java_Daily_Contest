import java.io.*;
import java.util.*;

public class contest61_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        boolean isSum = false;
        
        for(long i=0; i<=n;i++){
            sum += i;
            if(sum==n){
                isSum = true;
                break;
            }
        }
        if(isSum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}



