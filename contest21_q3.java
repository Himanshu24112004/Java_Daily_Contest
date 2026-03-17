import java.util.*;

public class contest21_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            
            int left = 0;
            int right = N - 1;
            boolean found = false;
            
            while (left < right) {
                long sum = arr[left] + arr[right];
                
                if (sum == K) {
                    found = true;
                    break;
                } else if (sum < K) {
                    left++;
                } else {
                    right--;
                }
            }
            
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}

