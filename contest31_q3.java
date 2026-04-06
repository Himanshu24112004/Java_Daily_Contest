import java.io.*;
import java.util.*;

public class contest31_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<= test; i++){
            String s = sc.nextLine();
            String rev = "";
            for(int j=s.length()-1; j>=0; j--){
                char ch = s.charAt(j);
                rev += ch ;
            }
            System.out.println(rev);
        }
        sc.close();
    }
}


