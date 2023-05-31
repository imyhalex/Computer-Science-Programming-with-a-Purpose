public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // An integer array of length n + 2
        int[] peopleCounts = new int[n + 2];

        // Repeated trials times
        for (int t = 0; t < trials; t++) {
            //  birthdays[r] = true if someone born on day r; false otherwise
            boolean[] birthdays = new boolean[n];
            int people = 0;

            while (true) {
                int r = (int) (Math.random() * n);
                people++;

                // Save the trail record of that number of people, restart the loop
                if (birthdays[r]) {
                    peopleCounts[people]++;
                    break;
                }
                birthdays[r] = true; // Mark down the new record, loop again
            }
        }

        // Calculate and do the output the i people, p for probability (break once greater than 50%)
        double p = 0.0;
        for (int i = 1; i <= n; i++) {
            p += (double) peopleCounts[i] / trials;
            System.out.printf("%d\t%d\t%.5f\n", i, peopleCounts[i], p);
            if (p >= 0.5) break;
        }

    }
}
