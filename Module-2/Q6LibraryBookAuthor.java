class Author {
    private String name;
    private String email;
    private String gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender +
                "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                "\nPrice: " + (int) price +
                "\nAuthor: " + author;
    }
}

public class Q6LibraryBookAuthor {
    public static void main(String[] args) {

        Author author = new Author(
                "Joshua Bloch",
                "jbloch@abc.com",
                "M"
        );

        Book book = new Book(
                "Effective Java",
                550,
                author
        );

        System.out.println(book);
    }
}