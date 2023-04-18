/* Regina Lin, ID: 202869488, CS 211, 4/17/2023, the following program is an updated version of Random.java */

public class NewRandomTest {
    public static void main(String[] args) throws Exception {
        NewRandom newRandom = new NewRandom();
        
        //Runs & prints randomly generated ints within a range for 40 times
        System.out.println("Method 1: nextInt(5, 9)");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextInt(5, 9) + " ");
        }
        System.out.println();

        //Runs & prints randomly generated lowercase letters for 40 times
        System.out.println("Method 3: nextChar()");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextChar() + " ");
        }
        System.out.println();

        //Runs & prints randomly generated lowercase letters within a range for 40 times
        System.out.println("Method 3-1: nextChar('c', 'f')");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextChar('c', 'f') + " ");
        }
        System.out.println();

        // Runs & prints randomly generated lowercase letters within a range for 40 times
        System.out.println("Method 3-2: nextChar('x', 'c')");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextChar('x', 'c') + " ");
        }
        System.out.println();

        // Runs & prints randomly generated lowercase letters except for 'c' for 40 times
        System.out.println("Method 4: nextCharExcept('c')");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextCharExcept('c') + " ");
        }
        System.out.println();

        // Runs & prints randomly generated lowercase letters except for 'z' for 40 times
        System.out.println("Method 4: nextCharExcept('z')");
        for (int i = 1; i <= 40; i++) {
            System.out.print(newRandom.nextCharExcept('z') + " ");
        }
        System.out.println();
    }
}
