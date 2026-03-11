import java.io.*;
import java.util.*;

public class contest16_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
            int num = sc.nextInt();
            int sum = 0;
            for(int j=1; j<num; j++){
                if(num%j==0){
                    sum += j;
                }
            }
            if(sum==num){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        sc.close();
    }
}
