import java.io.*;
import java.util.*;

public class contest59_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int hope  = 0 ;
        
        while(num--!=0){
            String s = sc.next();
            if(s.equals("X++")){
                hope++;
            }
            else if(s.equals("++X")){
                ++hope;
            }
            else if(s.equals("X--")){
                hope--;
            }
            else if(s.equals("--X")){
                --hope;
            }
        }
        System.out.println(hope);
        sc.close();
    }
}
