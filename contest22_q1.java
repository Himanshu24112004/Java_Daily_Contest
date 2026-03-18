import java.io.*;
import java.util.*;

public class contest22_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();        
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int num = 0;
            for(int i=1; i<=n; i++){
                int x =sc.nextInt();
                int count = 0;;
                while(x!=0){
                    count++;
                    x/=10;
                }
                if(count%2==0){
                    num++;
                }
            }
            System.out.println(num);
        }
        sc.close();
    }
}
