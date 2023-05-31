public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Our reference solution defines two arrays:
        // A boolean 2D array to specify which cells contain mines.
        // An integer 2D array to count the number of neighboring mines.
        boolean[][] minesDistribution = new boolean[m][n];
        int[][] numCount = new int[m][n];

        // Place k mines
        for (int i = 0; i < k; i++) {
            int row, col;
            // First generate two number no matter what
            // If while is true, do it again, if false, jump out and place the mine
            do {
                row = (int) (Math.random() * m);
                col = (int) (Math.random() * n);
            } while (minesDistribution[row][col]);
            minesDistribution[row][col] = true;
        }

        // Count the number of neighboring mines.
        // Create dx, dy to evaluate surrounding entries
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                for (int dx = -1; dx < 2; dx++) {
                    for (int dy = -1; dy < 2; dy++) {
                        int newRow = row + dx; // Evaluate in a 3*3 matrix
                        int newCol = col + dy;
                        if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && minesDistribution[newRow][newCol]) {
                            numCount[row][col]++;
                        }
                    }
                }
            }
        }

        // Print the output
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (minesDistribution[row][col]) {
                    System.out.print("* ");
                } else {
                    System.out.print(numCount[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
