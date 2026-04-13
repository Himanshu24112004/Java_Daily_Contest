import java.io.*;
import java.util.*;

public class contest32_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        while(test-- != 0){
            
            int num = sc.nextInt();
            boolean isPrime = true ;
            int temp = num;
            int sum = 0;
            boolean isGreater ;
            while(temp!=0){
                int d = temp%10;
                sum += d*d;
                temp/=10;
            }
            if(sum > 5){
                isGreater = true;
            }
            else{
                isGreater = false;
            }
            
            // prime number check 
            
            for(int i=2; i<= num/2; i++){
                if(num % i == 0){
                    isPrime = false ;
                    break;
                }
            }
            if(num <= 1){
                isPrime = false;
            }
            if(isPrime && isGreater){
                System.out.println("They are in Love");
            }
            else{
                System.out.println("Timepass");
            }
        }
        sc.close();
    }
}
