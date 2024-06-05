import java.util.Scanner;

public class Lesson8_Loops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.print("Type in the height: ");
            int height = reader.nextInt();
            System.out.print("Type in the width: ");
            int width = reader.nextInt();
            
            if (height < 1 || width < 1) {
                System.out.println("Invalid height or width value");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("X");
                    }
                    System.out.println(); // Move to the next line after printing the width
                }
                break; // Exit the while loop after printing the rectangle
            }
        }
        
        reader.close();
    }
}