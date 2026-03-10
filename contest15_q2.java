import java.io.*;
import java.util.*;

public class contest15_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int test =  sc.nextInt();
        for(int i=1;i<=test;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int max =Math.max(a,Math.max(b,c));
            System.out.println(max);
        }
        sc.close();
    }
}