import java.io.*;
import java.util.*;

class Vehicle{
    String brand;
    
    Vehicle(String brand){
        this.brand = brand;
    }
}

class Car extends Vehicle{
    int seats;
        Car(String brand,int seats){
            super(brand);
             this.seats = seats;
        }
}

class electricCar  extends Car{
    int batteryRangeKm;
    
    electricCar(String brand,int seats, int batteryRangeKm){
        super(brand, seats);
        this.batteryRangeKm =batteryRangeKm;
    }
    
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Seats: "+seats);
        System.out.println("Battery Range: "+batteryRangeKm);
    }
}
public class contest63_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner  sc = new Scanner(System.in);
        String brand = sc.nextLine();
        int seats = sc.nextInt();
        int battery = sc.nextInt();
        
        electricCar s = new electricCar(brand, seats, battery);
        s.display();
        sc.close();
    }
}