import java.util.*;

public class contest29_q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("[");

        for(int i = 0; i < n; i++){
            int num = arr[i];
            int temp = num;

            int count = 0;

            if(temp == 0) count = 1;
            while(temp != 0){
                count++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            while(temp != 0){
                int d = temp % 10;
                sum += Math.pow(d, count);
                temp /= 10;
            }

            if(num == 0) sum = 0;

            if(sum == num){
                System.out.print("True");
            } else {
                System.out.print("False");
            }

            if(i != n - 1){
                System.out.print(", ");
            }
        }

        System.out.print("]");

        sc.close();
    }
}
