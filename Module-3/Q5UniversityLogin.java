import java.util.Scanner;

public class Q5UniversityLogin {
    public static void login(String username) {
        if (username == null) {
            throw new NullPointerException("Username cannot be null");
        }
        System.out.println("Login successful for user: " + username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.nextLine();

        String username;
        if (input.equalsIgnoreCase("null") || input.trim().isEmpty()) {
            username = null;
        } else {
            username = input;
        }

        try {
            login(username);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
