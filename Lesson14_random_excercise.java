import java.util.*;

public class Lesson14_random_excercise {
    public static void main(String[] args) {
      
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        
        int amountOfNumbers = askInfo(tempArray);
       
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }

    // Your code here
    public static int askInfo(int[] tempArray) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 100) {
            System.out.print((count + 1) + ". number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            tempArray[count] = num;
            count++;
        }
        return count;
    }

    // Method to copy the integers to a new array of the exact size
    public static void copyInfo(int[] realArray, int[] tempArray) {
        for (int i = 0; i < realArray.length; i++) {
            realArray[i] = tempArray[i];
        }
    }

    // Method to sort the array in descending order
    public static void setArray(int[] realArray) {
        Arrays.sort(realArray);
        for (int i = 0; i < realArray.length / 2; i++) {
            int temp = realArray[i];
            realArray[i] = realArray[realArray.length - 1 - i];
            realArray[realArray.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] realArray ) {
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
}