import java.io.*;
import java.util.*;

public class contest53_q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            String rev = new StringBuilder(s).reverse().toString();

            int sum = 0;

            for (int i = 0; i < rev.length(); i++) {

                int position = rev.charAt(i) - 'a' + 1;

                sum += position * (i + 1);
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

