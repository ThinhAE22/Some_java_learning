import java.util.Scanner;
public class Lesson7_ifelse {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in a number: ");
		int number = reader.nextInt();
		if (number < 0)
			System.out.println("Number is negative.");
		else
			System.out.println("Number is positive or zero.");
	}
}