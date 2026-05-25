import java.io.*;
import java.util.*;

public class contest55_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        String res ="";
        for(int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        if(str.equals(res)){
            System.out.println("The memory still lives");
        }
        else{
            System.out.println("The memories are lost");
        }
        sc.close();
    }
}




