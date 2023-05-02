/* Regina Lin, CS 211, 4/25/2023, the following program is a class for the member object */

public class Member {
    // creates age & name fields
    private int age;
    private String name;

    // constructor to save age & name
    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // accessor for age
    public int getAge() {
        return this.age;
    }

    // accessor for name
    public String getName() {
        return this.name;
    }
}
