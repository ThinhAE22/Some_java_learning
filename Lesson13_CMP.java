public class Lesson13_CMP {
    public static void main(String[] args) {
        // Get the number of command line parameters
        int numParams = args.length;

        // Print the number of command line parameters
        System.out.println("You gave " + numParams + " command line parameters.");

        // Print the given parameters
        System.out.println("Below are the given parameters:");
        for (int i = 0; i < numParams; i++) {
            System.out.println((i + 1) + ". parameter: " + args[i]);
        }
    }
}
