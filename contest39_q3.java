import java.util.*;

public class contest39_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int moves = 0;
        for (int val : arr) {
            if (val % 3 != 0) {
                moves += 1;  // one move needed
            }
        }
        
        System.out.println(moves);
        sc.close();
    }
}

