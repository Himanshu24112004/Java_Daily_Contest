import java.io.*;
import java.util.*;

public class contest14_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
            int num = sc.nextInt();
            int count= 0;
            count = num/4;
            if(num%4!=0){
                count += 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
