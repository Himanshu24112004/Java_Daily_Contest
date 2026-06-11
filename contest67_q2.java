import java.util.*;

public class contest67_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  // read number as string to handle digits easily

        int[] freq = new int[10];  // frequency array for digits 0-9

        // Count frequency of each digit
        for (char c : n.toCharArray()) {
            freq[c - '0']++;
        }

        int loveScore = 0;
        // Calculate contributions
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                loveScore += d * freq[d];
            }
        }

        System.out.println(loveScore);
        sc.close();
    }
}


