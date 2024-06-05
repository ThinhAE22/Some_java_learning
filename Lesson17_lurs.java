import java.util.Scanner;

public class Lesson17_lurs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        String characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer {
    public Printer() {
        // No parameters needed for the constructor
    }

    String bigSmall(String input) {
        Scanner reader = new Scanner(System.in);  // Create a new Scanner object for input
        System.out.print("Do you want upper case or lower case? (upper/lower): ");
        String lu = reader.nextLine();
        if (lu.equals("lower")) {
            return input.toLowerCase();
        } else if (lu.equals("upper")) {
            return input.toUpperCase();
        } else {
            System.out.println("Please input valid info");
            return input;  // Returning the original string if input is invalid
        }
    }

    void reverseSpace(String input) {
        Scanner reader = new Scanner(System.in);  // Create a new Scanner object for input
        System.out.print("How would you like the string to be printed? (reverse/separated): ");
        String ron = reader.nextLine();
        if (ron.equals("reverse")) {
            System.out.print("Here is your character string: ");
            for (int i = input.length() - 1; i >= 0; --i) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        } else if (ron.equals("separated")) {
            System.out.print("Here is your character string: ");
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println("Please input valid info");
        }
    }
}
