abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Q8LoanManagement {
    public static void main(String[] args) {

        Loan homeLoan =
                new HomeLoan(500000, 3);

        Loan carLoan =
                new CarLoan(300000, 5);

        System.out.println(
                "Home Loan Interest: " +
                homeLoan.calculateInterest()
        );

        System.out.println(
                "Car Loan Interest: " +
                carLoan.calculateInterest()
        );
    }
}