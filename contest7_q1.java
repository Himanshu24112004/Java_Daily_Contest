import java.io.*;
import java.util.*;

public class contest7_q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sem = sc.nextInt();

        for (int i = 1; i <= sem; i++) {
            int day = sc.nextInt();
            int streak = 0;
            int maxStreak = 0;   // Track maximum streak

            for (int j = 1; j <= day; j++) {
                int ges = sc.nextInt();

                if (ges == 0) {
                    streak = 0;
                } else {
                    streak++;
                    maxStreak = Math.max(maxStreak, streak);
                }
            }

            System.out.println(maxStreak);
        }
        sc.close();
    }
}