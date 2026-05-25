import java.io.*;
import java.util.*;

class Employee{
    public void calculateBonus(){
        System.out.println("yet to be displayed!!!");
    }
}

class Manager extends Employee{
    public void calculateBonus(int salary){
        System.out.println("Bonus: "+ (salary*50/100));
        System.out.println("Performance Report: Conducted 47 meetings and solved 0 bugs.");
    }
}

class Developer extends Employee{
    public void calculateBonus(int salary){
        System.out.println("Bonus: "+ (salary*30/100));
        System.out.println("Performance Report: Fixed bugs created by Programmer.");
    }
}

class Programmer extends Employee{
    public void calculateBonus(int salary){
        System.out.println("Bonus: "+ (salary*20/100));
        System.out.println("Performance Report: Created new bugs creatively.");
    }
}

public class contest55_q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String EmployeeType = sc.next();
        int salary = sc.nextInt();
        
        Employee e = new Employee();
        Manager m = new Manager();
        Developer d =  new Developer();
        Programmer p = new Programmer();
        
        if(EmployeeType.equals("Manager")){
            m.calculateBonus(salary);
        }
        else if(EmployeeType.equals("Developer")){
            d.calculateBonus(salary);
        }
        else if(EmployeeType.equals("Programmer")){
            p.calculateBonus(salary);
        }
        else{
            e.calculateBonus();
        }
        sc.close();
    }
}