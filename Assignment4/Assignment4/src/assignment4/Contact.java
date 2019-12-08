package assignment4;

public class Contact implements Comparable<Contact>{

    private String firstName;
    String lastName;
    private int phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, int phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayInfo() {
        System.out.println(firstName + " " + lastName + " " + phoneNumber + " " + emailAddress);
    }

    @Override
    public int compareTo(Contact c) {
        return this.lastName.compareTo(c.getLastName());
    }
}
