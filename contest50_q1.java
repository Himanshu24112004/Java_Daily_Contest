import java.io.*;
import java.util.*;

public class contest50_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        String result ="";
        
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;
            }
            else{
                result += c;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
