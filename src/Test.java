import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws Exception {
        // create new instance of hashmap, iterator & scanner
        HashMap<String, Member> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run == true) {
            // print out initial message
            System.out.println("Please select one of the following: 1) add 2) remove 3) quit");
            int userInput = scanner.nextInt();
            if (userInput ==  1) {
                // ask & store ID
                System.out.println("Input ID");
                String userID = scanner.next();
                // ask & store name
                System.out.println("Input name");
                String name = scanner.next();
                // ask & store age
                System.out.println("Input age");
                int age = scanner.nextInt();

                // add new member to hashmap
                hashMap.put(userID, new Member(age, name));

                // success message
                System.out.println(userID + " added successfully");

                // print out known info
                System.out.println("Current number of members: " + hashMap.size());
                // loop through the data & print out
                for (String ID : hashMap.keySet()) {
                    System.out.println("ID: " + ID + " Name: " + hashMap.get(ID).getName() + " Age: " + hashMap.get(ID).getAge());
                }
            } else if (userInput == 2) {
                // check if ID2 is valid & remove
                System.out.println("Input ID to be removed: ");
                String ID = scanner.next();
                if (hashMap.containsKey(ID)) {
                    hashMap.remove(ID);
                    // success message
                    System.out.println(ID + " removed successfully");
                // print out known info
                System.out.println("Current number of members: " + hashMap.size());
                // loop through the data & print out
                for (String userID : hashMap.keySet()) {
                    System.out.println("ID: " + userID + " Name: " + hashMap.get(userID).getName() + " Age: " + hashMap.get(userID).getAge());
                }
                } else {
                    System.out.println(ID + " is not found :("); // error message
                }
            } else {
                System.out.println("Exiting program"); // exit message
                run = false;
            }
        }
    }
}
