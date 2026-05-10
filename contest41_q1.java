import java.util.*;

public class contest41_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        // Count factors of 5 in n!
        // Each 5 paired with a 2 makes a trailing zero
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }

        System.out.println(count);
        sc.close();
    }
}
