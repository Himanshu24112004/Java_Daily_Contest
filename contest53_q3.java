import java.io.*;
import java.util.*;

public class contest53_q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] a1 = {s1.charAt(0), s1.charAt(2)};
        char[] a2 = {s2.charAt(0), s2.charAt(2)};

        char[] b1 = {s1.charAt(1), s1.charAt(3)};
        char[] b2 = {s2.charAt(1), s2.charAt(3)};

        Arrays.sort(a1);
        Arrays.sort(a2);
        Arrays.sort(b1);
        Arrays.sort(b2);

        if(Arrays.equals(a1, a2) && Arrays.equals(b1, b2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}

