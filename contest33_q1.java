import java.io.*;
import java.util.*;

public class contest33_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int timer = sc.nextInt();
        if(timer==0){
            System.out.println("Green");
        }
        else if(timer == 30){
            System.out.println("Orange");
        }
        else if(timer >30 && timer <= 90){
            System.out.println("Red");
        }
        else{
           System.out.println("Invalid"); 
        }
        sc.close();
    }
}
