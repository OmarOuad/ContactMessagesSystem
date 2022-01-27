package com.proj;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello User,");
        int choice1 = 0;
        while (choice1 != 3) {


            System.out.println("1. Manage contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit");
            choice1 = scanner.nextInt();
            if (choice1 == 1) {
                int choice2 = 0;
                while (choice2 != 5) {
                    System.out.println("1. Show all contacts");
                    System.out.println("2. Add a new contact");
                    System.out.println("3. Search for a contact");
                    System.out.println("4. Delete a contact");
                    System.out.println("5. Go back to the previous menu");
                    choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        contact.displayContacts();
                    }
                    if (choice2 == 2) {
                        System.out.println("Enter the name of the new contact: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();

                        System.out.println("Enter the number of the new contact: ");
                        int number = scanner.nextInt();
                        contact.addNewContact(new contact(name, number));
                    }
                    if (choice2 == 3) {
                        System.out.println("Enter the name of this contact: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        contact foundContact = new contact();
                        foundContact = contact.searchContact(name);
                        if (foundContact == null) {
                            System.out.println("The contact was not found");
                        } else {
                            System.out.println(foundContact);
                        }
                    }
                    if (choice2 == 4) {
                        System.out.println("Enter the name of the contact to delete: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        contact.deleteContact(name);
                    }
                }
            }
            if (choice1 == 2) {
                int choice2 = 0;
                while (choice2 != 3) {
                    System.out.println("1. See the list of all messages");
                    System.out.println("2. Send a new message");
                    System.out.println("3. Go back to the previous menu");
                    choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        message.displayMessages();
                    }
                    if (choice2 == 2) {
                        System.out.println("Enter your message");
                        scanner.nextLine();
                        String text = scanner.nextLine();
                        message.addMessage(new message(text));
                    }
                }
            }


        }
    }
}
