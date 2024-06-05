import java.util.Scanner;

public class Lesson16_printclass {
    public static void main(String args[]) {
        String characterString;
        Scanner reader = new Scanner(System.in);        
        PrintingClass printer = new PrintingClass();
       
        System.out.print("Type in the character string for printing: ");
        characterString = reader.nextLine();
        printer.Print(characterString);
    }
}

// PrintingClass definition
class PrintingClass {
    
    // Method to print a message
    public void Print(String message) {
        System.out.println(message);
    }
}
