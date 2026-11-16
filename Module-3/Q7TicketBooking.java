import java.util.Scanner;

class TicketBooking {
    private int availableSeats;

    public TicketBooking(int seats) {
        this.availableSeats = seats;
    }

    public synchronized void bookSeat(String userName, int requestedSeats) {
        if (requestedSeats <= availableSeats) {
            System.out.println(userName + " booked " + requestedSeats + " seat(s) successfully");
            availableSeats -= requestedSeats;
        } else {
            System.out.println(userName + " booking failed. Not enough seats");
        }
    }

    public synchronized int getAvailableSeats() {
        return availableSeats;
    }
}

class User1 extends Thread {
    private TicketBooking booking;
    private int seats;

    public User1(TicketBooking booking, int seats) {
        super("User1");
        this.booking = booking;
        this.seats = seats;
    }

    @Override
    public void run() {
        booking.bookSeat("User1", seats);
    }
}

class User2 extends Thread {
    private TicketBooking booking;
    private int seats;

    public User2(TicketBooking booking, int seats) {
        super("User2");
        this.booking = booking;
        this.seats = seats;
    }

    @Override
    public void run() {
        booking.bookSeat("User2", seats);
    }
}

public class Q7TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Available Seats: ");
        int totalSeats = sc.nextInt();

        System.out.print("User1 wants to book: ");
        int user1Seats = sc.nextInt();

        System.out.print("User2 wants to book: ");
        int user2Seats = sc.nextInt();

        TicketBooking bookingSystem = new TicketBooking(totalSeats);

        User1 u1 = new User1(bookingSystem, user1Seats);
        User2 u2 = new User2(bookingSystem, user2Seats);

        u1.start();
        try {
            u1.join(); // Ensures predictable sequence matching expected output
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        u2.start();
        try {
            u2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        sc.close();
    }
}
