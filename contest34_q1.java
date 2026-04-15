import java.io.*;
import java.util.*;

public class contest34_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            if(num%2==0){
                count++;
                num = num/2;
            }
            if(num%2!=0){
               count++;
                num = (num-1);
          }
     }
        System.out.println(count);
        sc.close();
   }
}

