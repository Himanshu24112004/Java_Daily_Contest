import java.io.*;
import java.util.*;

public class contest17_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1;i<=test;i++){
            int num = sc.nextInt();
            int sum = 0;
            int temp= num;
            while(temp!=0){
                sum += temp%10;
                temp /= 10;
            }
            if(num%sum==0){
                System.out.println("Harshad");
            }
            else{
                System.out.println("Not Harshad");
            }
        }
        sc.close();
    }
}
