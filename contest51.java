import java.io.*;
import java.util.*;

public class contest51 {
    
    static boolean isUppercase(char c){
        if(c>='A'&& c<='Z'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        sc.nextLine();
        while(test--!=0){
            String s = sc.nextLine();
            int count =0;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(isUppercase(c)){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
