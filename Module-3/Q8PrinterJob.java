import java.util.Scanner;

class PrinterJob implements Runnable {
    private int jobId;
    private String studentName;

    public PrinterJob(int jobId, String studentName) {
        this.jobId = jobId;
        this.studentName = studentName;
    }

    @Override
    public void run() {
        System.out.println("Printing job " + jobId + " by Student " + studentName);
        try {
            Thread.sleep(500); // Simulate printing delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Q8PrinterJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of print jobs: ");
        int n = sc.nextInt();

        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            char studentChar = (char) ('A' + i);
            PrinterJob job = new PrinterJob(i + 1, String.valueOf(studentChar));
            threads[i] = new Thread(job);
            threads[i].start();
            try {
                threads[i].join(); // Ensures orderly output matching expected format
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        sc.close();
    }
}
