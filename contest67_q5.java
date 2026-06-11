import java.io.*;
import java.util.*;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
    abstract void fuelType();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
    void fuelType(){
        System.out.println("Fuel Type: Petrol");
    }
    void stop(){
        System.out.println("Vehicle Stopped");
    } 
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
    void fuelType(){
        System.out.println("Fuel Type: Petrol");
    }
    void stop(){
        System.out.println("Vehicle Stopped");
    } 
}

class ElectricScooter extends Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
    void fuelType(){
        System.out.println("Fuel Type: Electric");
    }
    void stop(){
        System.out.println("Vehicle Stopped");
    } 
}

public class contest67_q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        while(n--!=0){
            String type  = sc.nextLine();
            Vehicle v = null;
            
            if(type.equals("Car")){
                v = new Car();
            }
            else if(type.equals("Bike")){
                v = new Bike();
            }
            else if(type.equals("ElectricScooter")){
                v = new ElectricScooter();
            }
            
            if(v != null){
                v.start();
                v.fuelType();
                v.stop();
            }
        }
        sc.close();
    }
}
