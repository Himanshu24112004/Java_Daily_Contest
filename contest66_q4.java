import java.io.*;
import java.util.*;

public class contest66_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String S  = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<S.length(); i++){
            char c = S.charAt(i);
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
