import java.io.*;
import java.util.*;

public class contest49_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine(); 

        while(test-- > 0){
            String s = sc.nextLine();
            
            if(s.length() > 10){
                int len = s.length() - 2;
                System.out.println(s.charAt(0) +""+ len + s.charAt(s.length()-1));
            } 
            else {
                System.out.println(s);
            }
        }
        sc.close();
    }
}
