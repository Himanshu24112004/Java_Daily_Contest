import java.util.*;

public class contest21_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        for (int t = 0; t < T; t++) {
            String num = sc.next();  // read number as string
            boolean isSpecial = false;
            
            // Rule 1: Check for identical consecutive digits
            for (int i = 0; i < num.length() - 1; i++) {
                if (num.charAt(i) == num.charAt(i + 1)) {
                    isSpecial = true;
                    break;
                }
            }
            
            // Rule 2: Check for three consecutive increasing digits
            if (!isSpecial) {
                for (int i = 0; i < num.length() - 2; i++) {
                    int d1 = num.charAt(i) - '0';
                    int d2 = num.charAt(i + 1) - '0';
                    int d3 = num.charAt(i + 2) - '0';
                    
                    if (d2 == d1 + 1 && d3 == d2 + 1) {
                        isSpecial = true;
                        break;
                    }
                }
            }
            
            // Rule 3: Check if '0' appears not at the last position
            if (!isSpecial) {
                for (int i = 0; i < num.length() - 1; i++) {
                    if (num.charAt(i) == '0') {
                        isSpecial = true;
                        break;
                    }
                }
            }
            
            // Output result
            if (isSpecial) {
                System.out.println("Special");
            } else {
                System.out.println("Normal");
            }
        }
        
        sc.close();
    }
}
