import java.util.*;

public class contest41_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for(int i = 0; i < n; i++) {
            primarySum += mat[i][i];              // primary diagonal
            secondarySum += mat[i][n - 1 - i];    // secondary diagonal
        }

        int result = Math.abs(primarySum - secondarySum);
        System.out.println(result);

        sc.close();
    }
}


