/* Regina Lin, CS 211, 4/17/2023, the following program is an updated version of Random.java */

import java.util.Random;

public class NewRandom extends Random {
    // create a new random object
    Random random = new Random();

    public int nextInt(int low, int high) {
        int range = high - low + 1;
        return (low + random.nextInt(range));
    }
}