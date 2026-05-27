
import java.io.*;
import java.util.*;

public class contest56_q2 {    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        double salary = sc.nextInt();
        System.out.printf("Base Income: %.2f\n",salary);
        double perBonus =salary*10/100;
        System.out.printf("Performance Bonus: %.2f\n",perBonus);
        double retBonus = salary*20/100;
        System.out.printf("Retention Bonus: %.2f\n",retBonus);
        double total = perBonus+retBonus+salary;
        System.out.printf("Total Before Tax: %.2f\n",total);
        double tax = total*18/100;
        System.out.printf("Tax Deducted: %.2f\n",tax);
        System.out.printf("Final Remaining Amount: %.2f\n",total-tax);
        sc.close();
        
    }
}

