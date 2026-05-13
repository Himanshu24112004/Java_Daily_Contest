import java.io.*;
import java.util.*;

public class contest53_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        int index = -1;
        int max =-1;
        
        for(int j=0; j<m; j++){
            int count =0;
          for(int i=0; i<n; i++){
            if(arr[i][j]==0){
                count++;
            }
          }
            if(count > max){
                max = count;
                index = j;
            }
        }
        System.out.print(index+" "+max);
        sc.close();
    }
}
