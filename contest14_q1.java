import java.io.*;
import java.util.*;

public class contest14_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
            int std = sc.nextInt();
            int cost = sc.nextInt();
            int profit = 0;
            for(int j=1; j<=std; j++){
                if(j >= cost)
                    profit += (j- cost);
            }
            System.out.println(profit);
        }
        sc.close();
    }
}
