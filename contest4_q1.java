import java.util.Scanner;

public class contest4_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        sc.nextLine();
        String confession = sc.nextLine();
        System.out.println("Days: "+n);
        System.out.println("Confession: "+confession);
        sc.close();
    }
}
