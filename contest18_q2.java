import java.io.*;
import java.util.*;

public class contest18_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            for(int i=1; i<=n; i++ ){
                if(i%3==0){
                   System.out.println("Fizz"); 
                }
                else if(i%5==0){
                    System.out.println("Buzz"); 
                }
                else if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz"); 
                }
                else{
                   System.out.println(i);  
                }
            }
        }
        sc.close();
    }
}
