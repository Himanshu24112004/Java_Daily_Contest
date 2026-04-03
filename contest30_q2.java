import java.io.*;
import java.util.*;

public class contest30_q2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
        int num = sc.nextInt();
        int  rev = 0;
        int temp = num;
        while(num!=0){
           int d = num%10;
            rev = rev*10+d;
            num/=10;
        }
        if(temp == rev){
             System.out.println("TRUE");
        }
        else{
             System.out.println("FALSE");
        }
      }      
     sc.close();
    }
}
