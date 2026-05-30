import java.util.*;

public class contest59_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase(); // ignore case
        sc.close();

        boolean[] seen = new boolean[26]; // track letters
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
