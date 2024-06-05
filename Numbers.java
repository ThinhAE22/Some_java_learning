public class Numbers {
    private int number1;
    private int number2;
 
    public Numbers (int number1, int number2) {
        number1= number2;
        this. number2= number1;
        this. number1= 0;
    } 
    public String toString() {
        return "(" + number1+ "," + this. number2+ ")";
    } 
    public static void main(String args[]) {
        Numbers numbers = new Numbers (5, 6);
        System.out.println(numbers);
    }
}