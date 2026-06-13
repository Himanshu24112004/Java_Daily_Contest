

import java.util.*;

public class contest69_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int cycle = 2 * (N - 1);
        int pos = K % cycle;
        
        int friend;
        if (pos <= N - 1) {
            friend = pos;
        } else {
            friend = cycle - pos;
        }
        
        System.out.println(friend);
        sc.close();
    }
}

