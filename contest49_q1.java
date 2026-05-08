import java.util.*;

public class contest49_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        sc.close();

        if(s1.length() != s2.length()){
            System.out.println("No");
        } else {
            String doubled = s1 + s1;
            if(doubled.contains(s2)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
