import java.io.*;
import java.util.*;

public class contest27_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        
        for(int i= 0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0;j<n; j++){
                    System.out.print(grid[i][j]+" ");
                }
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(grid[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}