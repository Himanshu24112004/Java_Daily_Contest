import java.io.*;
import java.util.*;

public class contest35_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int maxDouble = sc.nextInt();
        
        int step = 0;
        
        while(target > 1){
            if(target%2==0 && maxDouble > 0){
                target /= 2;
                maxDouble--;
                step++;
            }
            else{
                target -= 1;
                step++;
            }
        }
        System.out.print(step);
        sc.close();
    }
}

