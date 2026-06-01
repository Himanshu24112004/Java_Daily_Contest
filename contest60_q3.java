import java.io.*;
import java.util.*;

public class contest60_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc =  new Scanner(System.in);
        
        String str = sc.nextLine();
        str = str.trim();
        
        String[] words = str.split("\\s+");
        
        for(String word : words){
            char c =word.charAt(0);
            System.out.print(c);
        }
        sc.close();
    }
}
