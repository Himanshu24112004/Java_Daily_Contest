import java.util.Scanner;

public class contest3_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++){
        long n= sc.nextLong();
        long count = 0;
        while (n>0) {
            long d = n%10;
            if(d==1){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
      }  
        sc.close();
    }
}
