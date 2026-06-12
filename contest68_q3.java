import java.io.*;
import java.util.*;

public class contest68_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
         str = str.toLowerCase();

        boolean isAlpha = true;
        for (char x : str.toCharArray()) {
            if (!(x >= 'a' && x <= 'z')) {
                isAlpha = false;
                break;
            }
        }

        if (isAlpha) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
