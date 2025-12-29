package gr.aueb.cf.cf9.part1pop.challenges;

/**
 * Calculates the minimum number of jumps required to reach a target.
 * A small frog wants to get to the other side of the road.
 * The frog is currently located at position X and wants to get to
 * a position greater than or equal to Y.
 * The small frog always jumps a fixed distance, D.
 */
public class FrogJumps {

    public static void main(String[] args) {
        int start = 10;
        int end = 85;
        int jump = 30;

        int jumpsLoop = frogJumpsIterative(start, end, jump);
        System.out.println("Iterative Solution: " + jumpsLoop + " jumps");

        int jumpsMath = frogJumpsMath(start, end, jump);
        System.out.println("Math Solution: " + jumpsMath + " jumps");

        int jumpsNoDoubles = frogJumpsNoDoubles(start, end, jump);
        System.out.println("No-Doubles Solution: " + jumpsNoDoubles + " jumps");
    }

    /**
     * Approach 1: Iterative (O(n))
     * Loops until the destination is reached.
     */
    public static int frogJumpsIterative(int start, int end, int jump) {
        int jumpCount = 0;
        int currentPos = start;

        while (currentPos < end) {
            currentPos += jump;
            jumpCount++;
        }
        return jumpCount;
    }

    /**
     * Approach 2: Mathematical (O(1))
     * Uses division and ceiling to calculate jumps in constant time.
     */
    public static int frogJumpsMath(int start, int end, int jump) {
        // Defensive check
        if (jump <= 0) throw new IllegalArgumentException("Jump must be > 0");
        if (start >= end) return 0;

        // Logic: Distance / Jump. We use Math.ceil to round up any partial jump.
        return (int) Math.ceil((end - start) / (double) jump);
    }

    /**
     * Approach 3: Integer Arithmetic (No doubles)
     * Pro Tip: (Distance + Jump - 1) / Jump gives the ceil value using only integers.
     */
    public static int frogJumpsNoDoubles(int start, int end, int jump) {
        int distance = end - start;
        return (distance + jump - 1) / jump;
    }
}
