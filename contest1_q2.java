import java.util.Scanner;

public class contest1_q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  num = sc.nextLong();
        long sum =0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
