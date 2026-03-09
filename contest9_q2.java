import java.io.*;
import java.util.*;

public class contest9_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int day = sc.nextInt();
        int maxStreak = 0;
        int currentStreak =  0;
        for(int i=1; i<=day; i++){
            int love = sc.nextInt();
            if(love == 1){
                currentStreak++;
                maxStreak = Math.max(maxStreak,currentStreak);
            }
            else{
                currentStreak = 0;
            }
        }
     System.out.println(maxStreak); 
     sc.close();     
   }
}