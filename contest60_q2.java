import java.io.*;
import java.util.*;

public class contest60_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc =  new Scanner(System.in);
        
        String str = sc.nextLine();
        
        str = str.trim();
        
        if(str.isEmpty()){
            System.out.println(0);
        }
        else{
            String[] words = str.split("\\s+");
            System.out.println(words.length);
        }
        sc.close();
    }
}
