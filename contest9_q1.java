import java.io.*;
import java.util.*;

public class contest9_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int days;
            if(x<(2*y)){
                days =0;
            }
            else{
                days = x/(2*y);
            }
            System.out.println(days);
        }
        sc.close();
    }
}