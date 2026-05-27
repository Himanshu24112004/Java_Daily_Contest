import java.io.*;
import java.util.*;

public class contest56_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        
        String str = sc.next();
        
        if(str.equals(str.toLowerCase())  || str.equals(str.toUpperCase())  || (Character.isUpperCase(str.charAt(0)) 
                                      && str.substring(1).equals(str.substring(1).toLowerCase()))){
            System.out.println("true");
        }
           else{
               System.out.println("false");
           }
           sc.close();
    }
}