import java.util.Scanner;
public class Lesson11_StringtoCharArray {
	public static void main(String[] args) {
		String cs;
		Scanner reader = new Scanner(System.in);

		System.out.println("Type in a character string (no spaces):");
		cs = reader.next();

		char[] charArray = cs.toCharArray();

		System.out.println();

		//print the inputted character string one character at a time one in each row
		for (int i = 0; i < charArray.length; ++i) {
			System.out.println(charArray[i]);
		}
	}
}

