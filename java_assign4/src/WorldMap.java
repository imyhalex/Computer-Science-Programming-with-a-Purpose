public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        // Set canvas size
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String regionName = StdIn.readString();
            int numOfVertices = StdIn.readInt();
            double[] xs = new double[numOfVertices];
            double[] ys = new double[numOfVertices];

            for (int i = 0; i < numOfVertices; i++) {
                double x = StdIn.readDouble();
                double y = StdIn.readDouble();
                xs[i] = x;
                ys[i] = y;
            }
            StdDraw.polygon(xs, ys);
        }

    }
}
