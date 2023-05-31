public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);


        // Print rows
        for (int i = 0; i < n; i++) {
            // Print columns
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    //Math.abs()
                    //For Example width = 1
                    //when i == 0, j == 0: 0-0 = 0 <= 1 0-1 = 1<=1
                    //when i == 1, j == 0: 1-0 = 1 <=1 1-1 = 0 <=1 1-2 =1 <=1
                    //when i == 2, j == 0: 2-0 = 2 > 1(print 0) 2-1 = 1 <=1 2-2 = 0<=1 2-3 = 1 <=1
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(' ');
        }

    }
}
