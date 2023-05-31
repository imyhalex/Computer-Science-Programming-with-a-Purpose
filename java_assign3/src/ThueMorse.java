public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue = "+", morse = "-"; // Set elements

        // One strategy is to apply the definition and successively build the
        // Thue–Morse sequences of lengths 1, 2, 4, 8, 16, and so forth, doubling the length of the sequence in each step.
        // When n is a power of 2,
        int size = 1; // Initialize a array size
        while (size < n) {
            size *= 2;
        }
        boolean[] sequence = new boolean[size]; // Create a boolean array of length size.

        // Initialize the first bit in the array—the one at index 0— to false.
        sequence[0] = false;

        // Copy the first bit in the array into the next position, replacing false with true in the copy.
        // Copy the first 2 bits in the array into the next 2 positions, replacing false with true and true with false in the copy.
        // Copy the first 4 bits in the array into the next 4 positions, replacing false with true and true with false in the copy.
        for (int length = 1; length < size; length *= 2) {
            for (int i = 0; i < length && i + length < size; i++) {
                sequence[i + length] = !sequence[i];
            }
        }

        // Draw the matrix-like output
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (sequence[j] == sequence[k]) {
                    System.out.print(thue + " ");
                } else {
                    System.out.print(morse + " ");
                }
            }
            System.out.println();
        }

    }
}

