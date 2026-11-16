import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Inventory {
    private HashMap<Integer, Integer> stockMap;

    public Inventory() {
        stockMap = new HashMap<>();
    }

    public void addProduct(int productId, int stock) {
        stockMap.put(productId, stock);
        System.out.println("Product " + productId + " added with stock " + stock);
    }

    public void updateStock(int productId, int newStock) {
        if (stockMap.containsKey(productId)) {
            stockMap.put(productId, newStock);
            System.out.println("Stock updated for Product " + productId + ": " + newStock);
        } else {
            System.out.println("Product ID " + productId + " not found in inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("\n--- Current Inventory ---");
        if (stockMap.isEmpty()) {
            System.out.println("(Inventory is empty)");
            return;
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = stockMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("Product ID: " + entry.getKey() + " | Stock: " + entry.getValue());
        }
    }
}

public class Q4InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) break;
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int pId = sc.nextInt();
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();
                    inventory.addProduct(pId, stock);
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new Stock: ");
                    int newStock = sc.nextInt();
                    inventory.updateStock(updateId, newStock);
                    break;
                case 3:
                    inventory.displayInventory();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Inventory Management.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
