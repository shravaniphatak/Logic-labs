package problems;

import java.util.Scanner;

class PhoneBook {

    // Parallel arrays
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int count = 0;

    // ADD command
    static void add(String name, String phone) {

        // validate phone number: exactly 10 digits
        if (phone.length() != 10) {
            System.out.println("Invalid phone number.");
            return;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("Invalid phone number.");
                return;
            }
        }

        if (count >= 100) {
            System.out.println("Phonebook full.");
            return;
        }

        names[count] = name;
        phones[count] = phone;
        count++;
    }

    // DEL command
    static void delete(String name) {
        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                // shift elements left
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    phones[j] = phones[j + 1];
                }

                count--;
                System.out.println("Deleted: " + name);
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // FIND command (partial match)
    static void find(String substring) {
        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (names[i].toLowerCase().contains(substring.toLowerCase())) {
                System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching contacts.");
        }
    }

    // LIST command
    static void list() {
        if (count == 0) {
            System.out.println("Phonebook empty.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(names[i] + "(" + phones[i] + ")");
            if (i != count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Qn10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String input = sc.nextLine();

            // skip empty lines
            if (input.trim().isEmpty()) {
                continue;
            }

            // split command by space
            // Example: ADD Alice 9876543210
            String[] parts = input.split(" ");

            String command = parts[0].toUpperCase();

            if (command.equals("ADD")) {

                // ADD name phone
                if (parts.length < 3) {
                    System.out.println("Invalid ADD command.");
                    continue;
                }

                String name = parts[1];
                String phone = parts[2];

                PhoneBook.add(name, phone);
            }
            else if (command.equals("DEL")) {

                // DEL name
                if (parts.length < 2) {
                    System.out.println("Invalid DEL command.");
                    continue;
                }

                PhoneBook.delete(parts[1]);
            }
            else if (command.equals("FIND")) {

                // FIND substring
                if (parts.length < 2) {
                    System.out.println("Invalid FIND command.");
                    continue;
                }

                PhoneBook.find(parts[1]);
            }
            else if (command.equals("LIST")) {

                PhoneBook.list();
            }
            else if (command.equals("EXIT")) {

                System.out.println("Goodbye.");
                break;
            }
            else {
                System.out.println("Unknown command.");
            }
        }

        sc.close();
    }
}
