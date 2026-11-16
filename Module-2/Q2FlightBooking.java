abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber +
                " Airline: " + airline +
                " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {

    InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class Q2FlightBooking {
    public static void main(String[] args) {

        Flight f1 =
                new DomesticFlight("AI202", "Air India", 5000);

        Flight f2 =
                new InternationalFlight("QF101", "Qantas", 20000);

        System.out.println(f1);
        System.out.println(f2);
    }
}