import java.io.*;
import java.util.*;

public class contest23 {

    // Helper function to calculate digit sum
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();  // number of test cases

        for (int t = 0; t < test; t++) {
            int num = sc.nextInt();
            int count = 0;

            for (int i = 1; i <= num; i++) {  // include num itself
                if (digitSum(i) % 2 == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}