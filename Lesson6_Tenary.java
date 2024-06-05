import java.util.Scanner;
public class Lesson6_Tenary{
	public static void main(String[] args) {
		double number, cs;
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in a floating point number:");
		number = reader.nextDouble();
		cs = (number < 0) ? -number : number; 
		System.out.print("The absolute value of the given number is " + cs);
	}
}