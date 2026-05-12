import java.io.*;
import java.util.*;

public class contest52_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  a= sc.nextInt();
        int b= sc.nextInt();
        int k = sc.nextInt();
        
        int power = 1;
        
        for(int i=1; i<=b; i++){
            power *= a;
        }
        
        int dig = -1 ;
        int temp = power;
        
        for(int i=k; i>=1; i--){
            dig = temp%10;
            temp/=10;
        }
        
        System.out.println(dig);
        sc.close();
    }
}

