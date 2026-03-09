import java.io.*;
import java.util.*;

public class contest10_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long temp  = n;
        long sum  = 0;
        while(temp>0){
            long d=temp%10;
            int fact = 1;
            for(int i=1; i<=d;i++){
                fact *= i;
            }
            sum += fact ;
            temp/=10;
        }
        if(sum == n){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}