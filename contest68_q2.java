import java.io.*;
import java.util.*;

public class contest68_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.toLowerCase().trim();
        String[] words = str.split("\\s+");
        int count = 0;
        for(String word : words){
            char c = word.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
