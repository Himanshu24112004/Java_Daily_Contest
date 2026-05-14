import java.io.*;
import java.util.*;

public class contest54_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int n = sc.nextInt();
        int[] id = new int[n];
        int[] fine = new int[n];
        
        for(int i=0; i<n; i++){
            id[i]= sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            fine[i]= sc.nextInt();
        }
        int totalFine =0;
        if(date%2==0){
            for(int i=0; i<n; i++){
                if(id[i]%2!=0){
                    totalFine += fine[i];
                }
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(id[i]%2==0){
                    totalFine += fine[i];
                }
            }
        }
        System.out.println(totalFine);
        sc.close();
    }
}


