import java.util.Scanner;

public class contest2_q1 {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int m= sc.nextInt();
        String month = switch(m){
            case 1-> "January";
            case 2-> "February";
            case 3-> "March";
            case 4-> "April";
            case 5-> "May";
            case 6-> "June";
            case 7-> "July";
            case 8-> "August";
            case 9-> "September";
            case 10-> "October";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid Month";
        };
        System.out.println(month);
        sc.close();
    }
}
