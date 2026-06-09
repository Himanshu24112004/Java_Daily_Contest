import java.io.*;
import java.util.*;

abstract class Delivery{
    String type;
    Delivery(String type){
        this.type = type;
    }
    abstract double calculateCharge(double weight);
}

class StandardDelivery extends Delivery{
    StandardDelivery(){
        super("Standard");
    }
    @Override
    double calculateCharge(double weight){
        return weight * 20;
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(){
        super("Express");
    }
    @Override
    double calculateCharge(double weight){
        return (weight * 35)+50;
    }
}

class InternationalDelivery extends Delivery{
    InternationalDelivery(){
        super("International");
    }
    @Override
    double calculateCharge(double weight){
       double charge = weight * 50;
        if (weight > 10) {
            charge += 200; 
        }
        return charge;
    }
} 
public class contest66_q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String type = sc.nextLine();
        double weight = sc.nextDouble();
        
        Delivery d = null;
        
        if(type.equals("Standard")){
            d = new StandardDelivery();
        }
        else if(type.equals("Express")){
            d = new ExpressDelivery();
        }
        else if(type.equals("International")){
            d = new InternationalDelivery();
        }
        
        double charge = d.calculateCharge(weight);
        System.out.printf("%.2f\n", charge);
        
        sc.close();
    }
}
