import java.util.Scanner;

public class contest3_q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n =sc.nextLong();
        if(n==0){
            System.out.println("Emotional Void");
        }
        else if(n<0){
            System.out.println("Dark Past Memories");
        }
        else if(n%3==0 && n%5==0){
            System.out.println("Perfect Harmony");
        }
        else if(n%3==0){
            System.out.println("Sweet Affection");
        }
        else if(n%5==0){
            System.out.println("Playful Love");
        }
        else{
            System.out.println("Ordinary Bond");
        }
        sc.close();  
    }
}
