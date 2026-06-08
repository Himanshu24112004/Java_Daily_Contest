import java.io.*;
import java.util.*;

public class contest65_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i]+" "+arr[n-i-1]+" ");
        }
        if(n%2==1){
            System.out.println(arr[n/2]);
        }
        sc.close();
    }
}
