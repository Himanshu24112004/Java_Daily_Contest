import java.util.*;

public class contest40_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int total = 0;

        // Repeat for n rounds (columns)
        for (int round = 0; round < n; round++) {
            int roundMax = 0;

            // For each row, find max snack and remove it
            for (int i = 0; i < m; i++) {
                int maxVal = 0;
                int maxIndex = -1;
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > maxVal) {
                        maxVal = grid[i][j];
                        maxIndex = j;
                    }
                }
                if (maxIndex != -1) {
                    grid[i][maxIndex] = 0; // remove stolen snack
                }
                roundMax = Math.max(roundMax, maxVal);
            }

            total += roundMax; // Soumik eats the tastiest
        }

        System.out.println(total);
        sc.close();
    }
}
