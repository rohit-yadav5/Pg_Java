public class CandidateEligibility {
    public static void main(String[] args) {
        final int QUALIFICATION = 1;  // 01 in binary
        final int EXPERIENCE    = 2;  // 10 in binary

        int candidate = QUALIFICATION | EXPERIENCE;  // 11 in binary

        if ((candidate & (QUALIFICATION | EXPERIENCE)) == (QUALIFICATION | EXPERIENCE)) {
            System.out.println("Candidate is eligible for the job.");
        } else {
            System.out.println("Candidate is NOT eligible.");
        }
    }
}