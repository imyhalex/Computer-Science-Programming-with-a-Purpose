public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        // Create an int array that only store the elements beside n
        int[] s = new int[args.length - 1];
        int cumSums = 0; // Initialize the cumulative sum
        int count = 0;

        // To generate a random index i with probability proportional to ai
        // Define the cumulative sums Si=a1+a2+…+ai,with S0=0.
        // Pick a random integer r uniformly between 0and Sn−1.
        // Find the unique index i between 1and n such that Si−1≤r<Si.

        // Create a array that store
        for (int i = 1; i < args.length; i++) {
            cumSums += Integer.parseInt(args[i]);
            s[i - 1] = cumSums;
        }
        //System.out.println(Arrays.toString(s)); // Test the array

        // Iterate m number of r
        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * s.length) + 1;
            System.out.print(r + " ");
            count++;
            if (count == 25) {
                System.out.println();
                count = 0;
            }

        }

    }
}


