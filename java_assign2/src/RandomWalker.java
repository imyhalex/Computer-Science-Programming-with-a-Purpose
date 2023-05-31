public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        // Initialize the coordinate x, y and step
        int x = 0;
        int y = 0;
        int step = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) != r) {

            double rand = Math.random();

            if (rand < 0.25) x++; // move east
            else if (rand < 0.5) x--; // move west
            else if (rand < 0.75) y++; // move north
            else y--; //move south
            step++;

            System.out.println("(" + x + ", " + y + ")");

        }
        System.out.println("steps = " + step);
    }
}
