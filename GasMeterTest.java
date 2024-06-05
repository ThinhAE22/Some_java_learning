import java.util.Scanner;

public class GasMeterTest {
    public static void main(String args[]) {   
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();

        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);
            
            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " + 
                "(type any other number to quit): ");
            answer = reader.nextInt();
           
            if(answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }
       
        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
   }
}
class GasMeter {
    private static double total95 = 0;
    private static double total98 = 0;
    private static double totalDiesel = 0;

    public void refuel(int type, double amount) {
        switch (type) {
            case 1:
                total95 += amount;
                break;
            case 2:
                total98 += amount;
                break;
            case 3:
                totalDiesel += amount;
                break;
            default:
                System.out.println("Invalid fuel type.");
        }
    }

    public static void totalUsed() {
        double total = total95 + total98 + totalDiesel;
        System.out.println("Total used fuel: " + total);
    }

    public static void totalUsed95() {
        System.out.println("Total used 95 octane fuel: " + total95);
    }

    public static void totalUsed98() {
        System.out.println("Total used 98 octane fuel: " + total98);
    }

    public static void totalUsedDi() {
        System.out.println("Total used diesel fuel: " + totalDiesel);
    }
}
