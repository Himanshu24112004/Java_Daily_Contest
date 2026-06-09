import java.io.*;
import java.util.*;

public class contest66_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringBuilder res =  new StringBuilder();
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if("aeiouAEIOU".indexOf(c)== -1){
            res.append(c);
        }
        }
        System.out.println(res.toString());
        sc.close();
    }
}
