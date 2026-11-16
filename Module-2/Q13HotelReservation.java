import java.util.*;

class Guest {
    private String name;
    private int age;
    private String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdProof() {
        return idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        String result =
                "Reservation ID: " +
                reservationId +
                " Room: " + roomType +
                "\nGuests:\n";

        for (Guest guest : guests) {
            result += guest + "\n";
        }

        return result;
    }
}

public class Q13HotelReservation {
    public static void main(String[] args) {

        Reservation reservation =
                new Reservation("R101", "Deluxe");

        reservation.addGuest(
                new Guest("Amit", 25, "ID123")
        );

        reservation.addGuest(
                new Guest("Sara", 22, "ID456")
        );

        System.out.println(reservation);
    }
}