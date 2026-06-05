import java.io.*;
import java.util.*;

public class contest64_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean found = false;
        
        for(int i = 0; i<n ;i++){
            int temp = arr[i];
            boolean pass = true;
            while(temp!=0){
                int dig  = temp%10;
                if(dig!=1 && dig!=2 && dig!=3){
                    pass = false;
                    break;
                }
                temp/=10;
            }
            if(pass){
                System.out.print(arr[i]+" ");
                found = true;
            }
        }
        if(!found){
            System.out.println("-1");
        }
        sc.close();
    }
}
