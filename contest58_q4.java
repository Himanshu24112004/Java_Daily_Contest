import java.io.*;
import java.util.*;

public class contest58_q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Remove extra spaces
        s = s.trim();

        // Split words
        String[] words = s.split("\\s+");

        // Reverse words
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if(i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result);

        sc.close();
    }
}
