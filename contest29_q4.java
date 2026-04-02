import java.io.*;
import java.util.*;

public class contest29_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        
        for(int i = s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}

