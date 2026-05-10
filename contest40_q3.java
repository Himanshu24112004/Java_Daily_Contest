import java.util.*;

public class contest40_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();   // number of rows
        int n = sc.nextInt();   // number of columns

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int total = 0;

        // Repeat until all snacks are gone
        for (int round = 0; round < n; round++) {
            int[] rowMax = new int[m];

            // Find max in each row
            for (int i = 0; i < m; i++) {
                int maxVal = 0;
                int maxIndex = -1;
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > maxVal) {
                        maxVal = grid[i][j];
                        maxIndex = j;
                    }
                }
                rowMax[i] = maxVal;
                if (maxIndex != -1) {
                    grid[i][maxIndex] = 0; // remove stolen snack
                }
            }

            // Soumik eats the most delicious among stolen
            int roundMax = 0;
            for (int val : rowMax) {
                if (val > roundMax) {
                    roundMax = val;
                }
            }
            total += roundMax;
        }

        System.out.println(total);
        sc.close();
    }
}
