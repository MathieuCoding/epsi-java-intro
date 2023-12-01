package Exo4;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> persons = new ArrayList<String>();
        System.out.print("Enter a first name: ");
        persons.add(scanner.nextLine());
        String again = "y";
        while (Objects.equals(again, "y")) {
            System.out.print("Enter another name: ");
            persons.add(scanner.nextLine());
            System.out.print("Do you want to enter another name? y/n: ");
            again = scanner.nextLine();
        }
        System.out.println("The names are " + persons);
        System.out.print("Enter a name to search for: ");
        String search = scanner.nextLine();
        if (persons.contains(search)) {
            System.out.println(search + " was found.");
        } else {
            System.out.println(search + " was not found.");
        }
    }
}

