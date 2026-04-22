import java.util.*;

public class contest39_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // x
            arr[i][1] = sc.nextInt(); // y
        }
        
        // Base slope reference using first two points
        int x1 = arr[0][0], y1 = arr[0][1];
        int x2 = arr[1][0], y2 = arr[1][1];
        
        boolean collinear = true;
        
        for (int i = 2; i < n; i++) {
            int x3 = arr[i][0], y3 = arr[i][1];
            
            // Cross multiplication check
            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                collinear = false;
                break;
            }
        }
        
        if (collinear) {
            System.out.println("ALIBI VERIFIED");
        } else {
            System.out.println("ALIBI FAILED");
        }
        
        sc.close();
    }
}
