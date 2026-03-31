import java.util.Scanner;

public class contest6_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean survive = true;

            for(int i=0; i<n; i++){
                int score =  sc.nextInt();

                if(score<=4){
                    survive = false;
                }
            }
            if(survive){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
