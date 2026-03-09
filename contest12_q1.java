import java.io.*;
import java.util.*;

public class contest12_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
            int bits= sc.nextInt();
            if(bits%4==0){
                System.out.println("Good");
            }
            else{
                System.out.println("Not Good");
            }
        }
        sc.close();
    }
}
