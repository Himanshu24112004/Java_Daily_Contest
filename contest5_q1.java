import java.util.Scanner;

public class contest5_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // formula : n*(n+1)*(2*n+1)/6;
        long result = n*(n+1)*(2*n+1)/6;
        System.out.println(result);
        sc.close();
    }
}
