import java.io.*;
import java.util.*;

public class contest19_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int rev = 0;

            while(n > 0){
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            System.out.println(rev);
        }

        sc.close();
    }
}
