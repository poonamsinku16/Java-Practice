import java.util.*;

public class CandidateCutoff {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            marks[i] = in.nextDouble();
        }

        double cutoff = in.nextDouble();

        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (marks[mid] >= cutoff) {
                ans = mid;
                high = mid - 1;  
            } else {
                low = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No Candidate Meets Cutoff");
        } else {
            System.out.println("Eligibility Starts at Index " + ans);
        }

      
    }
}
