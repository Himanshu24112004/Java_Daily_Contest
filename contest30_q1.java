import java.io.*;
import java.util.*;

public class contest30_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
