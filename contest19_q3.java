import java.io.*;
import java.util.*;

public class contest19_q3{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((100-x)<(200-(2*y))){
                System.out.println("FIRST");
            }
            else if((100-x)>(200-(2*y))){
                System.out.println("SECOND");
            }
            else{
                System.out.println("BOTH");
            }
        }
            sc.close();
    }
}

