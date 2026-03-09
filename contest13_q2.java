import java.io.*;
import java.util.*;

public class contest13_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int test=   sc.nextInt();
        
        for(int i=1; i<=test; i++){
            int num= sc.nextInt();
            boolean isAccepted = true;
            
            for(int j=1; j<=num; j++){                
                int score = sc.nextInt();
                if(score <= 4){
                    isAccepted = false;
                }
            }
            if(isAccepted){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        
        }
        sc.close();
    }
}