import java.util.Scanner;

class BankTransactionItem extends Thread {
    private String transactionName;
    private double amount;
    private String message;

    public BankTransactionItem(String transactionName, double amount, String message) {
        this.transactionName = transactionName;
        this.amount = amount;
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}

public class Q10BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Transaction1: ");
        String t1Input = sc.nextLine().replace("₹", "").trim();
        double t1Amount = Double.parseDouble(t1Input);

        System.out.print("Transaction2: ");
        String t2Input = sc.nextLine().replace("₹", "").trim();
        double t2Amount = Double.parseDouble(t2Input);

        BankTransactionItem lowPriorityTx;
        BankTransactionItem highPriorityTx;

        if (t1Amount >= t2Amount) {
            highPriorityTx = new BankTransactionItem("Transaction1", t1Amount, "High-value transaction processed first");
            lowPriorityTx = new BankTransactionItem("Transaction2", t2Amount, "Low-value transaction processed later");
        } else {
            lowPriorityTx = new BankTransactionItem("Transaction1", t1Amount, "Low-value transaction processed later");
            highPriorityTx = new BankTransactionItem("Transaction2", t2Amount, "High-value transaction processed first");
        }

        highPriorityTx.setPriority(Thread.MAX_PRIORITY);
        lowPriorityTx.setPriority(Thread.MIN_PRIORITY);

        highPriorityTx.start();
        try {
            highPriorityTx.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        lowPriorityTx.start();
        try {
            lowPriorityTx.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        sc.close();
    }
}
