import java.io.*;
import java.util.*;

public class contest37_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] energy = new int[n];
        
        for(int i=0; i<n; i++){
            energy[i] =  sc.nextInt();
        }
        int target = sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(energy[i] + energy[j] == target){
                    System.out.print(i+" "+j);
                    sc.close();
                    return ;
                }
            }
        }
        sc.close();
    }
}
