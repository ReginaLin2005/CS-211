import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class App {
    // Declare variables
    static int howManyTests = 5;
    static int howManyData = 60000; // modify this size to fit your computer processing speed
    static Random random = new Random();
    static ArrayList<String> al = new ArrayList<>();
    static LinkedList<String> ll = new LinkedList<>();
    public static void main(String[] args) {
        for (int i=1; i<=howManyTests; i++) {
            initilization();
            System.out.printf("\nTest: "+i);
            remove();
        }
    }
    private static void remove() {
        double TimeRemove_ArrayList=0.0;
        double TimeRemove_LinkedList=0.0;
        double startTime, endTime;
        for (int i=0; i<howManyData/2; i++){ // remove half of the data
        // generate index to remove
        // index must be within the size of ArrayList or LinkedList.
        // remember that both lists are always the same size.
        int index2remove = random.nextInt(howManyData);
        // remove index2remove from ArrayList
        // accumulate the processing time of this ‘remove’ operation
        // eg) TimeRemove_ArrayList += ...
        // see week 5-2 for how to check processing time
        // remove index2remove from LinkedList
        // accumulate the processing time of this ‘remove’ operation

        // eg) TimeRemove_LinkedList += ...
        } // end for
        // Printout the result as shown in the sample log
    }
    private static void initilization() {
        // Ensure lists are empty
        al.clear();
        ll.clear();

        for (int i = 0; i < howManyData; i++) {
            al.add(Integer.toString(i));
            ll.add(Integer.toString(i));
        }
    }
}