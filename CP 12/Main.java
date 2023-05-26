/* The following program is a demonstration of why ArrayList is faster at removing large quantities of elements than LinkedList.
 * When removing elements, ArrayList do so by finding the index of the unwanted element, deleting it and shift the index of every
 * other element behind it by 1; LinkedList complete it by findng the index of the unwanted element and then chain the following element
 * to previous element. In theory, the time complexity for element removal is O(n) and O(1) for ArrayList & LinkedList, respectively. 
 * However, in this special case where we are randomly accessing elements from the lists by index, ArrayList is the more efficient option 
 * because it can quickly locate the element by index, whereas LinkedList requires traversing the entire list, therefore causing delays.
  */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    // Declare variables
    static int howManyTests = 5;
    static int howManyData = 60000; // modify this size to fit your computer processing speed
    static Random random = new Random();
    static ArrayList<String> al = new ArrayList<>();
    static LinkedList<String> ll = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        for (int i=1; i<=howManyTests; i++) {
            initilization();
            System.out.printf("\nTest: "+ i);
            remove();
        }
    }
    private static void remove() {
        double TimeRemove_ArrayList = 0.0;
        double TimeRemove_LinkedList = 0.0;
        double startTime, endTime;
        for (int i=0; i<howManyData/2; i++) { // remove half of the data
            // generate index to remove
            int index2remove = random.nextInt(al.size());

            // remove index2remove from ArrayList
            startTime = System.currentTimeMillis();
            al.remove(index2remove);
            endTime = System.currentTimeMillis();
            TimeRemove_ArrayList += (endTime - startTime) * 0.001; // find differences & convert into seconds

            // remove index2remove from LinkedList
            startTime = System.currentTimeMillis();
            ll.remove(index2remove);
            endTime = System.currentTimeMillis();
            TimeRemove_LinkedList += (endTime - startTime) * 0.001; // find differences & convert into seconds
        } 
 
        double percentage = TimeRemove_ArrayList / TimeRemove_LinkedList * 100;

        // Printout the result as shown in the sample log
        System.out.println("\n" + "Removed: " + howManyData/2);
        System.out.println("ArrayList: " + Double.toString(TimeRemove_ArrayList) + " seconds");
        System.out.println("LinkedList: " + Double.toString(TimeRemove_LinkedList) + " seconds");
        System.out.println("ArrayList's processing time is " + percentage + " % of LinkedList");
    }
    private static void initilization() {
        // Ensure lists are empty
        al.clear();
        ll.clear();

        for (int i = 0; i < howManyData; i++) {
            al.add(Integer.toString(i));
            ll.add(Integer.toString(i));
        }
        // System.out.println("arraylist: " + al);
        // System.out.println("linkedlist: " + ll);
    }
}