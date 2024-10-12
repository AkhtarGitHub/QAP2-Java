// Person.java
public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    // Constructor
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + home;
    }
}
