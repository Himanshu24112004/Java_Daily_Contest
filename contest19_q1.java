import java.io.*;
import java.util.*;

public class contest19_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test; t++){
            int marks = sc.nextInt();
            int correct = marks%3;
            if(correct == 0){
                System.out.println(correct);
            }
            else if(correct < 3){
                System.out.println(3-correct);
            }
        }
        sc.close();
    }
}