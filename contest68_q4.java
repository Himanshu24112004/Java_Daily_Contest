import java.io.*;
import java.util.*;

public class contest68_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 0;
        while(n!=0){
            if(n%2==0){
                n/=2;
                step++;
            }
            else if(n%2!=0){
                n-=1;
                step++;
            }
        }
        System.out.println(step);
    }
}