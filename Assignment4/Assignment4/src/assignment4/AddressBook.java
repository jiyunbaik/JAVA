package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {

    private static final int maxData = 20;
    private static Contact[] contact = new Contact[maxData];
    private static int count = 0;
    private static Scanner sc = new Scanner(System.in);

    private static void mainMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Find contact");
        System.out.println("5. Show all contacts");
        System.out.println("6. Exit");
    }

    public static void addContact() {
        System.out.println("What is your first name");
        String firstName = sc.next();
        System.out.println("What is your last name");
        String lastName = sc.next().toUpperCase();
        System.out.println("What is your phone number");
        int phoneNumber = sc.nextInt();
        System.out.println("What is your email address");
        String emailAddress = sc.next();
        Contact data = new Contact(firstName, lastName, phoneNumber, emailAddress);
        contact[count] = data;
        count++;
    }

    public static void showContact() {
        if (count == 0) {
            System.out.println("No contacts in data");
            System.out.println("please add contacts");
        } else {
            for (int i = 0; i < count; i++) {
                contact[i].displayInfo();
            }
        }
    }

    public static void sortContact() {
        Arrays.sort(contact, 0, count);
    }

    public static void searchContact() {
        boolean isFound = false;
        if (count == 0) {
            System.out.println("No contacts in data");
            System.out.println("please add contacts");
        } else {
            System.out.println("1. Search by last name");
            System.out.println("2. Search by first letter of last name");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Please type last name to search");
                    String search = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (search.equalsIgnoreCase(contact[i].getLastName())) {
                            contact[i].displayInfo();
                            isFound = true;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please type first letter of last name");
                    String letter = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        String fLetter = Character.toString(contact[i].getLastName().charAt(0));
                        if (letter.equalsIgnoreCase(fLetter)) {
                            contact[i].displayInfo();
                            isFound = true;
                        }
                    }
                    break;
            }
        }
        if (!isFound) {
            System.out.println("contact not found");
        }
    }

    public static void updateContact() {
        boolean isUpdated = false;
        if (count == 0) {
            System.out.println("No contacts in data");
            System.out.println("please add contacts");
        } else {
            System.out.println("Please type last name of the contact you wish to update");
            String search = sc.nextLine();
            for (int i = 0; i < count; i++) {
                if (search.equalsIgnoreCase(contact[i].getLastName())) {
                    contact[i].displayInfo();
                    System.out.println("Please type new info");
                    System.out.println("What is your first name");
                    String firstName = sc.next();
                    System.out.println("What is your last name");
                    String lastName = sc.next();
                    System.out.println("What is your phone number");
                    int phoneNumber = sc.nextInt();
                    System.out.println("What is your email address");
                    String emailAddress = sc.next();
                    Contact data = new Contact(firstName, lastName, phoneNumber, emailAddress);
                    contact[i] = data;
                    isUpdated = true;
                    break;
                }
            }
        }
        if (!isUpdated) {
            System.out.println("contact not found");
        }
    }

    public static void removeContact() {
        boolean isRemoved = false;
        if (count == 0) {
            System.out.println("No contacts in data");
            System.out.println("please add contacts");
        } else {
            System.out.println("Please type last name of the contact you wish to remove");
            String remove = sc.nextLine();
            for (int i = 0; i < count; i++) {
                if (remove.equalsIgnoreCase(contact[i].getLastName())) {
                    for (int j = i; j < count; j++) {
                        contact[j] = contact[j + 1];
                        count--;
                    }
                    isRemoved = true;
                    break;
                }
            }
        }
        if (!isRemoved) {
            System.out.println("contact not found");
        }
    }

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            mainMenu();
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    addContact();
                    sortContact();
                    break;
                case 2:
                    updateContact();
                    sortContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    sortContact();
                    showContact();
                    break;
                case 6:
                    run = false;
                    break;
            }

        }
    }

}
