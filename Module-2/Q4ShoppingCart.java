import java.util.*;

class Product {
    private String productName;
    private double price;
    private int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity +
                " = " + (int) getTotal();
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.getTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        String result =
                "Order ID: " + orderId +
                "\nProducts:\n";

        for (Product p : products) {
            result += p + "\n";
        }

        result += "Total: " + (int) calculateTotal();

        return result;
    }
}

public class Q4ShoppingCart {
    public static void main(String[] args) {

        Order order = new Order("ORD101");

        order.addProduct(
                new Product("Laptop", 50000, 1)
        );

        order.addProduct(
                new Product("Mouse", 500, 2)
        );

        order.addProduct(
                new Product("Keyboard", 1500, 1)
        );

        System.out.println(order);
    }
}