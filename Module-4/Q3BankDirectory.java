import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3BankDirectory {
    private HashMap<Integer, String> directory;

    public Q3BankDirectory() {
        directory = new HashMap<>();
    }

    public void addAccount(int accNo, String customerName) {
        directory.put(accNo, customerName);
        System.out.println("Account added successfully.");
        System.out.println("Account No: " + accNo + " \u2192 " + customerName);
    }

    public String getCustomer(int accNo) {
        if (directory.containsKey(accNo)) {
            String name = directory.get(accNo);
            System.out.println("Account No: " + accNo + " \u2192 Customer Name: " + name);
            return name;
        } else {
            System.out.println("Account No: " + accNo + " not found.");
            return null;
        }
    }

    public void displayAll() {
        System.out.println("\n--- Bank Account Directory ---");
        if (directory.isEmpty()) {
            System.out.println("(No accounts registered)");
        } else {
            for (Map.Entry<Integer, String> entry : directory.entrySet()) {
                System.out.println("Account No: " + entry.getKey() + " \u2192 " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Q3BankDirectory bank = new Q3BankDirectory();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Get Customer Name");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) break;
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    bank.addAccount(accNo, name);
                    break;
                case 2:
                    System.out.print("Enter Account No to retrieve: ");
                    int queryAcc = sc.nextInt();
                    bank.getCustomer(queryAcc);
                    break;
                case 3:
                    bank.displayAll();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Bank Directory.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
