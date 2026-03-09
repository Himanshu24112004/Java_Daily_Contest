import java.util.Scanner;

public class contest2_q2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        long start =sc.nextLong();
        long end = sc.nextLong();
        long count = 0;
        for(long i=start; i<=end; i++){
            if((i%4==0 && i%100!=0) || i%400==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
