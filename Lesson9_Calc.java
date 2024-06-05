import java.util.Scanner;

public class Lesson9_Calc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose from the following calculations:");
        System.out.println("1: subtraction");
        System.out.println("2: addition");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("5: remainder \n");
		System.out.println("Make your choice:");
        int choice = reader.nextInt();
		System.out.print("\n");

        switch (choice) {
            case 2:
                System.out.print("Type in the first number: ");
                int add1 = reader.nextInt();
                System.out.print("Type in the second number: ");
                int add2 = reader.nextInt();
                System.out.println(add1 + " + " +add2 + " = " + (add1 + add2));
                break;

            case 1:
                System.out.print("Type in the first number: ");
                int sub1 = reader.nextInt();
                System.out.print("Type in the second number: ");
                int sub2 = reader.nextInt();
                System.out.println(sub1 + " - " + sub2 + " = " + (sub1 - sub2));
                break;

            case 3:
                System.out.print("Type in the first number: ");
                int mul1 = reader.nextInt();
                System.out.print("Type in the second number: ");
                int mul2 = reader.nextInt();
                System.out.println(mul1 + " * " + mul2 + " = " + (mul1 * mul2));
                break;

            case 4:
                System.out.print("Type in the first number: ");
                int div1 = reader.nextInt();
                System.out.print("Type in the second number: ");
                int div2 = reader.nextInt();
                if (div2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                } else {
                    double result = (double) div1 / div2;
                    System.out.println(div1 + " / " + div2 + " = " + result);
                }
                break;

            case 5:
                System.out.print("Type in the first number: ");
                int mod1 = reader.nextInt();
                System.out.print("Type in the second number: ");
                int mod2 = reader.nextInt();
                if (mod2 == 0) {
                    System.out.println("Error: Modulus by zero is undefined.");
                } else {
                    System.out.println(mod1 + " % " + mod2 + " = " + (mod1 % mod2));
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        reader.close();
    }
}