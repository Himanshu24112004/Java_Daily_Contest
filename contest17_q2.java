import java.io.*;
import java.util.*;

public class contest17_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int cus = sc.nextInt();
            int acc = sc.nextInt();
            int[][] matrix = new int[cus][acc];
            for(int i=0;i<cus; i++){
                for(int j=0;j<acc;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            int max = 0;
            for(int i=0;i<cus;i++){
                int sum = 0;
                for(int j=0;j<acc; j++){
                    sum += matrix[i][j];
                }
                if(sum > max){
                    max = sum;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}

