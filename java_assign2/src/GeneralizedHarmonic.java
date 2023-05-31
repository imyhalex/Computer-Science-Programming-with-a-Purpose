public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            double denominator = Math.pow(i, r);
            double result = 1.0 / denominator;
            total = total + result;
        }

        System.out.println(total);
    }
}
