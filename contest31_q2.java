import java.io.*;
import java.util.*;

public class contest31_q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mov = sc.nextLine();
        
        int x=0, y=0;
        for(int i=0 ; i< mov.length(); i++){
            char ch = mov.charAt(i);
            if(ch == 'R'){
                x++;
            }
            else if(ch == 'L'){
                x--;
            }
            else if(ch == 'U'){
                y++;
            }
             else if(ch == 'D'){
                 y--;
             }
        }
        
        if (x==0 && y==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
