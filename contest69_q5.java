
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

public class contest69_q5 {

    public static String level3(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Negative");
        } else if (n == 0) {
            throw new ArithmeticException("Divide by zero");
        } else if (n % 5 == 0) {
            throw new NullPointerException("Null");
        } else if (n % 2 == 0) {
            throw new IllegalArgumentException("Illegal");
        } else {
            return "SUCCESS";
        }
    }

    public static String level2(int n) throws NegativeNumberException {
        try {
            return level3(n);
        } catch (IllegalArgumentException e) {
            return "CAUGHT_IN_LEVEL2";
        }
    }

    public static String level1(int n) throws NegativeNumberException {
        try {
            return level2(n);
        } catch (NullPointerException e) {
            return "CAUGHT_IN_LEVEL1";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            String result = level1(n);
            System.out.println(result);
        } catch (NegativeNumberException e) {
            System.out.println("NEGATIVE_NUMBER");
        } catch (ArithmeticException e) {
            System.out.println("DIVIDE_BY_ZERO");
        } catch (Exception e) {
            System.out.println("UNKNOWN_EXCEPTION");
        }
        sc.close();
    }
}
