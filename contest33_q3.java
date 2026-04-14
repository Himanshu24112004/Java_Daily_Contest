import java.io.*;
import java.util.*;

public class contest33_q3 {
    
    static boolean harshad(int n){
        int sum = 0;
        int temp = n;
        while(temp != 0){
            int d = temp%10;
            sum += d;
            temp /= 10;
        }
        if(n%sum==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    static boolean isOdd(int n){
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        if(count%2!=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- !=0){
            int num = sc.nextInt();
            if(harshad(num) && isOdd(num)){
                System.out.println("They are in Love");
            }
            else{
              System.out.println("Timepass");  
            }     
        }
        sc.close();
    }
}

