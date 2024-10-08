package java_qap2;

public class Person {
    private String lastName;
    private String firstName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String toString() {
        return firstName + ", " + lastName + "\n" + this.address.toString();
    }
}
