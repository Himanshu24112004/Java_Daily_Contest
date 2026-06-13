
import java.util.*;

public class contest69_q3 {
    // Helper function to process string with backspaces
    private static String process(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        String finalS = process(s);
        String finalT = process(t);
        
        System.out.println(finalS.equals(finalT));
        sc.close();
    }
}

