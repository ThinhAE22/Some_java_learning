import java.util.Scanner;
public class Lesson5_Modifying_print{
	public static void main(String[] args) {
		String first_name;
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in your first name: ");
		first_name = reader.next();
		System.out.print("\n\n" + "Hi, " +"\"" + first_name + "\"\n" );
		System.out.print("\tThe name of this exercise is 'Modifying printing'.\n");
		System.out.print("\tTabulator, line change and quotations have already been used in this exercise.\n");
		System.out.print("\tForward slash (\\) is also usable in printing.\n\n\n");
		System.out.print("\t\t*** End of exercise ***\n");
	}
}