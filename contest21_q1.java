import java.io.*;
import java.util.*;

public class contest21_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            int x =sc.nextInt();
            int y =sc.nextInt();
            int best = Math.abs(x-y) ;
            int max = (best+1)/2;
            System.out.println(max);
        }
    }
}

