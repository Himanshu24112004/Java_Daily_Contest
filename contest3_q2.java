import java.util.Scanner;
//To be understood and practice later....
public class contest3_q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        long totalSurplus =0;
        long currentSurplus =0;
        int start = 0;
        for(int i=1; i<n; i++){
            long energy =sc.nextLong();
            long cost = sc.nextLong();
            long gain = energy - cost;
            totalSurplus += gain;
            currentSurplus += gain;
            if(currentSurplus<0){
                start =i+1;
                currentSurplus = 0;
            }
        }
        if(totalSurplus >= 0 && start<n){
            System.out.println(start);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
