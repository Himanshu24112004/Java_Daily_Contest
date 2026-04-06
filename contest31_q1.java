import java.io.*;
import java.util.*;

public class contest31_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int sum=0;
        int prod=1;
        while(num!=0){
            sum += num%10;
            prod *= num%10;
            num/=10;
        }
        System.out.println(sum+prod);
        sc.close();
    }
}