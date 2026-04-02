import java.io.*;
import java.util.*;

public class contest29_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int min  = grid[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]< min){
                    min = grid[i][j];
                }
            }
        }
        System.out.println(min);
        sc.close();
    }
}
