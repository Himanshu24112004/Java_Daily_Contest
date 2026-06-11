import java.util.*;

public class contest67_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                hasZero = true;
            }
        }

        if (hasZero) {
            System.out.println(-1);
            return;
        }

        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= arr[i];

            // keep only last 5 digits to avoid overflow
            result %= 100000;

            // remove trailing zeros
            while (result % 10 == 0) {
                result /= 10;
            }
        }

        // last non-zero digit
        System.out.println(result % 10);
        sc.close();
    }
}