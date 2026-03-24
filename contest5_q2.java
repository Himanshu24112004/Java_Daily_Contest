import java.util.Scanner;

public class contest5_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long current = 0;
            long sum = 0;

            for(int i=1;i<=n;i++){
                current = current* 10 + 9;
                sum += current ;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
