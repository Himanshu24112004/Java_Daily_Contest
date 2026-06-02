import java.io.*;
import java.util.*;


class Detective{
    public void solveCase(){
        System.out.println("case solved");
    }
}

class CrimeDetective extends Detective{
    public void solveCase(){
        System.out.println("CrimeDetective solved the murder mystery using witness analysis.");
    }
}

class CyberDetective extends Detective{ 
    public void solveCase(){
    System.out.println("CyberDetective hacked encrypted files and traced digital footprints.");
    }
}

class ParanormalDetective extends Detective{
    public void solveCase(){
        System.out.println("ParanormalDetective communicated with spirits to uncover hidden truths.");
    }
}

class UnderCoverDetective extends Detective{
    public void solveCase(){
    System.out.println("UndercoverDetective infiltrated the criminal organization secretly.");
    }
}

class ForensicDetective extends Detective{
    public void solveCase(){
       System.out.println("ForensicDetective analyzed fingerprints and DNA evidence.");
    }
}
public class contest61_q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test--!=0){
            String s = sc.next();
            
            if(s.equals("CrimeDetective")){
                Detective d = new CrimeDetective();
                d.solveCase();
            }
            else if(s.equals("CyberDetective")){
                Detective d = new CyberDetective();
                d.solveCase();
            }
            else if(s.equals("ParanormalDetective")){
                Detective d = new ParanormalDetective();
                d.solveCase();
            }
            else if(s.equals("UndercoverDetective")){
                Detective d = new UnderCoverDetective();
                d.solveCase();
            }
            else{
                Detective d = new ForensicDetective();
                d.solveCase(); 
            }
        }
        sc.close();
    }
}