import java.io.*;
import java.util.*;

abstract class Payment{
    String type;
    Payment(String type){
        this.type = type;
    }
    abstract void pay();
}

class UPI extends Payment{
    UPI(){
        super("UPI");
    }
    @Override
    void pay(){
        System.out.println("Payment Successful via UPI");
    }
}
class Card extends Payment{
    Card(){
        super("Card");
    }
    @Override
    void pay(){
        System.out.println("Payment Successful via Card");
    }
}
class NetBanking extends Payment{
    NetBanking(){
        super("NetBanking");
    }
    @Override
    void pay(){
        System.out.println("Payment Successful via NetBanking");
    }
}

public class contest65_q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().trim();

        Payment p = null;

        if(type.equals("UPI")) {
            p = new UPI();
        } else if(type.equals("Card")) {
            p = new Card();
        } else if(type.equals("NetBanking")) {
            p = new NetBanking();
        }

        if(p != null) {
            p.pay();
        }

        sc.close();
    }
}