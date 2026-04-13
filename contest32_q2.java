import java.util.*;

public class contest32_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        // 3 loops for all possible trios
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    // check same suspect
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {

                        int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        min = Math.min(min, dist);
                    }
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
