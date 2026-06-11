import java.util.*;

class BankAccount {
    private long balance;  // balance is private

    public BankAccount() {
        this.balance = 0;  // initial balance = 0
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
        // ignore invalid deposits
    }

    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        // ignore invalid withdrawals
    }

    public long getBalance() {
        return balance;
    }
}

public class contest67_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        BankAccount account = new BankAccount();

        for (int i = 0; i < N; i++) {
            String[] parts = sc.nextLine().split(" ");
            String operation = parts[0];

            if (operation.equals("DEPOSIT")) {
                long amount = Long.parseLong(parts[1]);
                account.deposit(amount);
            } else if (operation.equals("WITHDRAW")) {
                long amount = Long.parseLong(parts[1]);
                account.withdraw(amount);
            } else if (operation.equals("BALANCE")) {
                System.out.println(account.getBalance());
            }
        }

        sc.close();
    }
}











