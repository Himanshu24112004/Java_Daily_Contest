import java.io.*;
import java.util.*;

public class contest69_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%3==0||i%5==0|i%7==0){
               sum += i; 
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
