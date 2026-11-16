import java.util.Random;
import java.util.Scanner;

class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube: " + (number * number * number));
    }
}

class RandomNumberGenerator extends Thread {
    private int iterations;
    private static final int[] DEMO_NUMBERS = {4, 7, 10};

    public RandomNumberGenerator(int iterations) {
        this.iterations = iterations;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < iterations; i++) {
            int num = (i < DEMO_NUMBERS.length) ? DEMO_NUMBERS[i] : (rand.nextInt(20) + 1);
            System.out.println("Generated: " + num);

            if (num % 2 == 0) {
                SquareCalculator sc = new SquareCalculator(num);
                sc.start();
                try {
                    sc.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                CubeCalculator cc = new CubeCalculator(num);
                cc.start();
                try {
                    cc.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            try {
                Thread.sleep(1000); // 1 second interval
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class Q9IoTSensorMonitoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Start Simulation");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            RandomNumberGenerator generator = new RandomNumberGenerator(3);
            generator.start();
            try {
                generator.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } else {
            System.out.println("Exiting simulation.");
        }

        sc.close();
    }
}
