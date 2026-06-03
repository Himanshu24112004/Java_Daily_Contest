import java.io.*;
import java.util.*;

public class contest61_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isSum = false;

        for(int i=1; i<n;i++){
            long sum = 0;
            for(int j=i; j<n;j++){
                sum += j;
                if(sum==n){
                    isSum = true;
                    break;
                }
            }
            if(sum>n){
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



