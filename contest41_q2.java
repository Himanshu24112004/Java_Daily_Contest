import java.util.*;

public class contest41_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // size of grid

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int suspiciousColumn = -1;
        int maxZeros = 0;

        // Check each column
        for (int col = 0; col < n; col++) {
            int zeroCount = 0;
            for (int row = 0; row < n; row++) {
                if (mat[row][col] == 0) {
                    zeroCount++;
                }
            }
            // Update if this column has more zeros
            if (zeroCount > maxZeros) {
                maxZeros = zeroCount;
                suspiciousColumn = col;
            }
        }

        // If no zeros found, suspiciousColumn stays -1
        System.out.println(suspiciousColumn);
        sc.close();
    }
}

