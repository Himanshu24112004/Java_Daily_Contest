import java.io.*;
import java.util.*;


class Employee{
    double basicPay;
    
    Employee(double basicPay){
        this.basicPay = basicPay;
        System.out.println("Basic Pay : "+this.basicPay);
    }
    
    public void dearAllow(){
        System.out.println("Dearness Allowance : "+(basicPay*30/100));
    }
    
     public void houseAllow(){
        System.out.println("House Rent Allowance : "+(basicPay*15/100));
    }
    
     public void proFund(){
        System.out.println("Provident Fund : "+(basicPay*12.5/100));
    }
    
     public void grossPay(){
        System.out.println("Gross Pay : "+((basicPay*30/100)+(basicPay*15/100)+basicPay));
    }
    
    public void netPay(){
        System.out.println("Net Pay : "+(((basicPay*30/100)+(basicPay*15/100)+basicPay)-(basicPay*12.5/100)));
    }
}
public class contest57_q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        
        double basicPay = sc.nextDouble();
        
        Employee e = new Employee(basicPay);
        
        e.dearAllow();
        e.houseAllow();
        e.proFund();
        e.grossPay();
        e.netPay();
        
        
        sc.close();
        
    }
}
