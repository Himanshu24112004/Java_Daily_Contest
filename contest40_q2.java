import java.util.*;

public class contest40_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowLimit = sc.nextInt();
        int highLimit = sc.nextInt();

        // Vaults can be indexed by digit sum. Max digit sum for 100000 is 45.
        int[] vaults = new int[50];  

        for (int num = lowLimit; num <= highLimit; num++) {
            int sum = digitSum(num);
            vaults[sum]++;   // put ball into that vault
        }

        int maxBalls = 0;
        for (int count : vaults) {
            if (count > maxBalls) {
                maxBalls = count;
            }
        }

        System.out.println(maxBalls);
        sc.close();
    }

    // Helper function to calculate digit sum
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

