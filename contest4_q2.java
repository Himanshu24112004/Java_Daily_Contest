import java.util.Scanner;

public class contest4_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int maxDigit = 0;
            if(n==0){
                System.out.println(0);
                continue;
            }
            while(n>0){
                int digit = (int)(n%10);
                if(digit>maxDigit){
                    maxDigit = digit;
                }
                n = n/10;
            }
            System.out.println(maxDigit);
        }
        sc.close();
    }
}
