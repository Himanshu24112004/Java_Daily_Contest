import java.io.*;
import java.util.*;

public class contest40_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0){
            int num = sc.nextInt();
            int count = 0;

            for(int i = 1; i <= num; i++){   // start from 1
                int temp = i;                // copy i for digit sum
                int sum = 0;

                while(temp != 0){
                    sum += temp % 10;
                    temp /= 10;
                }

                if(sum % 2 == 0){
                    count++;
                }
            }
            System.out.println(count);       // print each result on new line
        }
        sc.close();
    }
}
