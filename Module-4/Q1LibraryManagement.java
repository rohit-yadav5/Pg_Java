import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
        System.out.println("Book added successfully.");
        displayBooks();
    }

    public void removeBook(String title) {
        if (books.remove(title)) {
            System.out.println("Book \"" + title + "\" removed successfully.");
        } else {
            System.out.println("Book \"" + title + "\" not found in library.");
        }
        displayBooks();
    }

    public void displayBooks() {
        System.out.println("Current Books:");
        if (books.isEmpty()) {
            System.out.println("(No books available)");
        } else {
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
}

public class Q1LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) break;
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String titleToAdd = sc.nextLine();
                    library.addBook(titleToAdd);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String titleToRemove = sc.nextLine();
                    library.removeBook(titleToRemove);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Library Management.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
