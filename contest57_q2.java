import java.io.*;
import java.util.*;

public class contest57_q2 {

    static public int simpleInterest(int principle){
         return (principle*10*3/100);
    }
    
    static public int compoundInterest(int principle){
        int amount  = principle;
        
        for(int i=1; i<=3; i++){
            amount *= (1+10/100.0);
        }
        
        return amount - principle;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        
        int principle = sc.nextInt();
        
        int dif = compoundInterest(principle)-simpleInterest(principle);
        
        System.out.println(dif);
        
        sc.close();
        
    }
}
