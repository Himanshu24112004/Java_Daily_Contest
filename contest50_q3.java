import java.io.*;
import java.util.*;

public class contest50_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String res = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                res += c;
            }
        }
        System.out.println(res);
        sc.close();
    }
}