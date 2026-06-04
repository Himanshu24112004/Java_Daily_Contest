import java.io.*;
import java.util.*;

public class Contest63_q1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int prod  = 1;
        for(int i=0; i<n; i++){
            prod *= arr[i];
        }
        
        System.out.println(prod);
        sc.close();
    }
}

