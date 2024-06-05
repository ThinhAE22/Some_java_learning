import java.util.Scanner;
public class Lesson4_Input_reader {
	public static void main(String[] args) {
		int number1 = 0, number2 = 0;
		Scanner reader = new Scanner(System.in);
        System.out.println(2 + 4 + "6");
        System.out.println("\"/\\/\\\"\n" + " \\/\\/");
		System.out.print("Type in the first number: ");
		number1 = reader.nextInt();
		System.out.print("Type in the second number: ");
		number2 = reader.nextInt();
		System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));
	}
}
