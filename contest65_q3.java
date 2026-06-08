import java.io.*;
import java.util.*;

public class contest65_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine().trim();
        str = str.replace(" ","-");
        System.out.println(str);
        sc.close();
    }
}
