import java.io.*;
import java.util.*;


class Animal{
    String name;
    int legs;
      
      Animal(String name,int legs){
        this.legs =legs;
        this.name = name;
      }
    
}

class Dog extends Animal{    
    String breed;
    Dog(String name, int legs ,String breed){
        super(name , legs);
        this.breed = breed;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Legs: "+legs);
        System.out.println("Breed: "+breed);
        if(legs==4){
            System.out.println("Quadruped: Yes");
        }
        else{
             System.out.println("Quadruped: No");
        }
    }
}
public class contest63_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        int leg = sc.nextInt();
        sc.nextLine();
        String breed = sc.nextLine();
        
        Dog a = new Dog(name,leg,breed);
        a.display();
        sc.close();
    }
}

