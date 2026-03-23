import java.io.*;
import java.util.*;

public class contest25_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  test = sc.nextInt();
        for(int t=1; t<=test; t++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
            System.out.print(gcd+" ");
        int big =  Math.max(a,b);
            for(;;big++){
                if(big%a==0 && big%b==0){
                  System.out.println(big);
                    break;
                }
            }            
    }
        sc.close();
    }
}
