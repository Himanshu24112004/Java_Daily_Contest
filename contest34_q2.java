import java.util.*;

public class contest34_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long count = 0;

        while(n1 != 0 && n2 != 0){
            if(n1 >= n2){
                count += n1 / n2;   // jump steps
                n1 = n1 % n2;
            } else {
                count += n2 / n1;   // jump steps
                n2 = n2 % n1;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

