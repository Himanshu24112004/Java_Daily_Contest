import java.io.*;
import java.util.*;

public class contest49_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int upper =0;
        int lower =0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c>='A'&& c<='Z'){
                upper++;
            }
            if(c>='a' && c<='z'){
                lower++;
            }
        }
        if(upper>lower){
            s = s.toUpperCase();
        }
        else{
            s= s.toLowerCase();
        }
        System.out.println(s);
        sc.close();
    }
}
