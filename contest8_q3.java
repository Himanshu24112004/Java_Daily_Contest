import java.io.*;
import java.util.*;

public class contest8_q3 {

    public static void main(String[] args) {
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int i=1; i<=test; i++){
            long num = sc.nextLong();
             long last = num%10;
           long first = num;
            while(first>=10){
                first/=10;
            }
            System.out.println(first+last);
        }
        sc.close();
    }
}
