import java.io.*;
import java.util.*;

public class contest27_q1 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        boolean found = false;
        for (int j = m; j <= n; j++) {
            if (isPrime(j) && isPrime(digitSum(j))) {
                System.out.print(j + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Love Found");
        }
    }
}
