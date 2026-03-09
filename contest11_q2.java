import java.io.*;
import java.util.*;

public class contest11_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        boolean cdn1 =((X>10)||(Y<5));
        boolean cdn2 = ((Z==0) || (X+Y>Z));
        if(cdn1 && cdn2)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}