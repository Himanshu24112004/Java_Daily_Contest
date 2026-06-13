

import java.io.*;
import java.util.*;

class Creature{
    public void action(){
        System.out.println("Creature");
    }
}  

class Dragon extends Creature{
    public void action(){
        System.out.println("Dragon");
    }
}

class Phoenix extends Creature{
    public void action(){
        System.out.println("Phoenix");
    }
}

class Griffin extends Dragon{
    public void action(){
        System.out.println("Griffin");
    }
}

public class contest69_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n--!=0){
            String type = sc.nextLine();
            Creature c = null;
            switch(type){
                case "Dragon" : c = new Dragon(); break;
                case "Phoenix" : c = new Phoenix(); break;
                case "Griffin" : c = new Griffin(); break;
                default : c = new Creature(); break;
                
            }
            c.action();
        }
        sc.close();
    }
}
