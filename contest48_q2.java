import java.io.*;
import java.util.*;

public class contest48_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String s  = sc.nextLine();
        
        String s1 =s.toLowerCase();
        
        int len = s.length();
        int count = 0;
        
        for(int i=0; i <= len-1 ; i++){
            char c = s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

