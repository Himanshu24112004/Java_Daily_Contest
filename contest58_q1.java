import java.io.*;
import java.util.*;

public class contest58_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        s = s.toLowerCase().replace(" ", "");
        
        String str = s;
        
        String rev =  new StringBuilder(str).reverse().toString();

        
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}