import java.util.*;

public class contest67_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original sequence
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print reversed sequence
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(" ");
        }

        sc.close();
    }
}

