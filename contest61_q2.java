import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt();
            String S = sc.next();
            int N = S.length();
            
            int[] diff = new int[N + 2]; // difference array
            
            // Mark coverage ranges
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    int left = Math.max(0, i - X);
                    int right = Math.min(N - 1, i + X);
                    diff[left] += 1;
                    diff[right + 1] -= 1;
                }
            }
            
            // Prefix sum to compute coverage
            int cover = 0;
            boolean allCovered = true;
            for (int i = 0; i < N; i++) {
                cover += diff[i];
                if (cover <= 0) { // uncovered room
                    allCovered = false;
                    break;
                }
            }
            
            System.out.println(allCovered ? "true" : "false");
        }
        
        sc.close();
    }
}
