import java.util.Scanner;

public class contest1_q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch =Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel-She remembers");
        }
        else{
            System.out.println("Consonant-Memories fading");
        }
        sc.close();
    }    
}
