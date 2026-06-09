import java.util.*;

class Vault {
    private int code; // encapsulated

    public void setCode(int code) {
        if (code >= 1000 && code <= 9999) {
            this.code = code;
        } else {
            this.code = -1; // invalid configuration
        }
    }

    public String verifyCode(int enteredCode) {
        if (this.code == -1) {
            return "Vault Not Configured";
        }
        if (enteredCode == this.code) {
            return "Access Granted";
        }
        return "Access Denied";
    }
}

public class contest66_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int enteredCode = sc.nextInt();

        Vault vault = new Vault();
        vault.setCode(code);

        System.out.println(vault.verifyCode(enteredCode));
        sc.close();
    }
}
