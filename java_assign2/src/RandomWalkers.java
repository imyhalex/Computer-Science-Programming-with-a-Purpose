public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int totalSteps = 0;

        // Repeat the experiment for given number of trials
        for (int n = 0; n < trials; n++) {
            //Initialize the coordinate x, y and step
            int x = 0;
            int y = 0;
            int step = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                // Randomize direction
                double rand = Math.random();

                if (rand < 0.25) x++; // move east
                else if (rand < 0.5) x--; // move west
                else if (rand < 0.75) y++; // move north
                else y--; //move south
                step++;

            }

            totalSteps += step;

        }
        // Compute the average steps and display the output
        double averageNumberOfSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageNumberOfSteps);

    }
}
