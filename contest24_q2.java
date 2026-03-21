import java.io.*;
import java.util.*;

public class contest24_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int row =sc.nextInt();
            int col= sc.nextInt();
            int[][] arr = new int[row][col];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int min = arr[0][0];
            for(int i=0;i<row; i++){
                for(int j=0; j<col; j++){
                    if(arr[i][j]<min){
                        min = arr[i][j];
                    }
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
}