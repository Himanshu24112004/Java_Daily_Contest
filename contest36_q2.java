import java.io.*;
import java.util.*;

public class contest36_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}