import java.io.*;
import java.util.*;

public class contest20_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t= 1; t<= test; t++){
            int x= sc.nextInt();
            int y = sc.nextInt();
            int s_even = 0;
            int s_odd  = 0;
            for(int i=x; i<=y; i++){
                if(i%x==0){
                    if(i%2==0){
                        s_even += i;
                    }
                    else{
                        s_odd += i;
                    }
                }
            }
            if(s_even > s_odd){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}