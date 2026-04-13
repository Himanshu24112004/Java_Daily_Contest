import java.io.*;
import java.util.*;

 class Solution {
    
    long baseEnergy;
    
      Solution(long base){
          this.baseEnergy = base;
      }
    
    long add(int a, int b){
        return a+b+baseEnergy;
    }
    
    long add(int a, int b,int c){
        return a+b+c+baseEnergy;
    }
    
    double add(double x,double y){
        return x+y+baseEnergy;
    }
} 
public class contest26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        Solution cal = new Solution(base);
        
        System.out.println(cal.add(a,b));
        System.out.println(cal.add(c1,c2,c3));
        System.out.println(cal.add(x,y));
        
        sc.close();
    }
}