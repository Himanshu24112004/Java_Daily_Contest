import java.io.*;
import java.util.*;

public class contest50_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        StringBuilder res = new StringBuilder();

        boolean newWord = true; // flag to detect start of a word

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                // space → reset flag
                res.append(c);
                newWord = true;
            } else {
                if (newWord) {
                    // capitalize first letter of word
                    res.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    // keep rest unchanged
                    res.append(c);
                }
            }
        }

        System.out.println(res.toString());
        sc.close();
    }
}
