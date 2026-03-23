import java.io.*;
import java.util.*;

public class contest25_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            if (!sc.hasNextInt()) {
                System.out.println("Error: Invalid input");
                sc.next(); 
                continue;
            }
            int hr = sc.nextInt();
            int charge = 0;
            if(hr<0){
                System.out.println("Error: Invalid duration");
                continue;
            }
            else if(hr<=3){
                charge = hr*120;
            }
            else if(hr<=7){
                charge = (3*120)+((hr-3)*60);
            }
            else {
                charge = (3*120)+(4*60)+((hr-7)*25);
            } 
            System.out.println(charge);
        }
       sc.close();
    }
}
