import java.io.*;
import java.util.*;

class Employee{
    String name ; 
    String employeeId;
    
    public void  display(){
        
    }
}

class Teacher extends Employee{
    
    Teacher(String name, String employeeId){
        this.name = name;
        this.employeeId = employeeId;
     }   
    
        public void display(){
            System.out.println("Teacher Details:");
            System.out.println("Name: "+name);
            System.out.println("Employee ID: "+employeeId);
        }
}

class Clerk extends Employee{
    Clerk(String name, String employeeId){
        this.name =  name ;
        this.employeeId = employeeId;
    }
    
    public  void display(){
        System.out.println("Clerk Details:");
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+employeeId);
    }
}

public class contest58_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        
        String teacherName = sc.nextLine();
        String teacherId = sc.nextLine();
        String clerkName = sc.nextLine();
        String clerkId = sc.nextLine();
        
        Employee t = new Teacher(teacherName,teacherId);
        t.display();
        
        Employee c = new Clerk(clerkName,clerkId);
        c.display();
        
    }
}
