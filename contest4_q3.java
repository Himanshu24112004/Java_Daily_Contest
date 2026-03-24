import java.util.Scanner;

public class contest4_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==0){
            System.out.println(1);
            return ;
        }
        long result = 0;
        long place = 1;

        while(n>0){
            long digit = n%10;

            if(digit==0){
                digit =1;
            }
            result += digit*place;
            place = place*10;
            n/=10;
        }
        System.out.println(result);
        sc.close();
    }
}
