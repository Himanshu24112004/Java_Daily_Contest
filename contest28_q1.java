import java.io.*;
import java.util.*;

public class contest28_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long dur = sc.nextLong();
        long count=0;
        while (sc.hasNextLong()) {
            long bat = sc.nextLong();
            if(bat >= dur){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
