import java.io.*;
import java.util.*;

public class contest12_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test=  sc.nextInt();
        for(int i=1; i<=test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a,Math.min(b,c));
            int sum= 0;
            sum += min*10;
            sum += (a-min)*3;
            sum += (b-min)*3;
            sum += (c-min)*3;
            System.out.println(sum);
        }
        sc.close();
    }
}
