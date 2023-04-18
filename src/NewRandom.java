/* Regina Lin, ID: 202869488, CS 211, 4/17/2023, the following program is an updated version of Random.java */

import java.util.Random;

public class NewRandom extends Random {
    // Create a new random object
    Random random = new Random();

    // Returns a random number which is an integer value between the range of ‘low’ to ‘high’.
    public int nextInt(int low, int high) {
        int range = high - low + 1;
        return (low + random.nextInt(range));
    }

    // Returns a random lowercase letter from a to z
    public char nextChar() {
        char r = 'a'; // initializes new char
        r += nextInt(0, 25); // add random value from the alphabetical range
        return r; // return char
    }

    // Returns a random lowercase letter between the two parameters
    public char nextChar(char from, char to) {
        // Casts range into int values
        if (from < to) {
            int min = (int)from;
            int max = (int)to;

            int r = nextInt(min, max); // Generates random int that represents char between the declared min & max
            return (char)r; // Casts int into char
        } else if (from > to) {
            int range1 = (int)('z' - from); // Divides into two different range
            int range2 = (int)(to - 'a');
            char r;
            // Uses if statement to randomly select a range
            if (nextInt(1, 2) == 1) {
                int range = nextInt(0, range1); // Randomly generates a range
                r = (char) (from + range);
                return r;
            } else {
                int range = nextInt(0, range2); // Randomly generates a range
                r = (char) (to - range);
                return r;
            }
        }
        else {
            return from; // Returns either if both parameters are the same
        }
    }

    // Returns a lowercase letter except c 
    public char nextCharExcept(char c) {
        char r = c; // intialize new char

        // Continues generating random int if it's equal to the exception
        while (r == c) {
            r = nextChar(); // Generates random int that corresponds to lowercase letters
        }

        return r; // Casts int into char
    }
}