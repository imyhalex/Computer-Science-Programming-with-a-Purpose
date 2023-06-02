public class ShannonEntropy {
    public static void main(String[] args) {
        // Shannon Entropy: a concept in information theory
        // that quantifies the amount of uncertainty (or randomness) associated with a set of data
        // H = - Σ (p_i * log2(p_i))
        // The summation Σ is over all the outcomes in the set
        // p_i is the probability of outcome i
        // log2(p_i) is the base-2 logarithm of p_i
        // Rules:
        // The more likely an outcome is, the less it contributes to the entropy
        // Conversely, less likely outcomes contribute more to the entropy
        int m = Integer.parseInt(args[0]);

        int[] counts = new int[m + 1];
        int total = 0;

        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            if (1 <= num && num <= m) {
                counts[num]++;
                total++;
            }
        }

        double entropy = 0.0;
        for (int i = 1; i <= m; i++) {
            if (counts[i] > 0) {
                double p = (double) counts[i] / total;
                entropy -= p * (Math.log(p) / Math.log(2));
            }
        }
        StdOut.printf("%.4f\n", entropy);
    }
}
