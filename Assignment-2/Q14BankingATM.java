class Account {
    private String accNo;
    private String holderName;
    private double balance;

    Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q14BankingATM {
    public static void main(String[] args) {

        Account account =
                new Account("A101", "Ravi");

        account.deposit(1000);
        account.withdraw(500);

        System.out.println(
                "Balance: " + account.getBalance()
        );
    }
}