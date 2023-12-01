package Exo5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a phone number: ");
        String number = scanner.nextLine();
        contacts.put(name, number);
        String again = "y";
        while (Objects.equals(again, "y")) {
            System.out.print("To add a new contact press 1, to update an existing contact press 2, to delete a contact press 3, to display all contacts press 4: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter a name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter a phone number: ");
                    number = scanner.nextLine();
                    contacts.put(name, number);
                    break;
                case "2":
                    System.out.print("Enter a name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter a phone number: ");
                    number = scanner.nextLine();
                    contacts.replace(name, number);
                    break;
                case "3":
                    System.out.print("Enter a name: ");
                    name = scanner.nextLine();
                    contacts.remove(name);
                    break;
                case "4":
                    System.out.println(contacts);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Do you want to continue? y/n: ");
            again = scanner.nextLine();
        }
        System.out.print("Thank you and goodbye !!");
    }
}
