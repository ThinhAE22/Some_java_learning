import java.util.Scanner;

public class Lesson10_numberToString {

    private static String changeThousands(int t) {
        if (t == 1) {
            return "one thousand";
        } else {
            return changeOnes(t) + " thousand";
        }
    }

    private static String changeHundreds(int s) {
        if (s == 1) {
            return "one hundred";
        } else {
            return changeOnes(s) + " hundred";
        }
    }

    private static String changeOnes(int y) {
        switch (y) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    private static String changeTensAndOnes(int k) {
        if (k < 10) {
            return changeOnes(k);
        } else if (k < 20) {
            switch (k) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "";
            }
        } else {
            String numberCs = "";
            switch (k / 10) {
                case 2:
                    numberCs = "twenty";
                    break;
                case 3:
                    numberCs = "thirty";
                    break;
                case 4:
                    numberCs = "forty";
                    break;
                case 5:
                    numberCs = "fifty";
                    break;
                case 6:
                    numberCs = "sixty";
                    break;
                case 7:
                    numberCs = "seventy";
                    break;
                case 8:
                    numberCs = "eighty";
                    break;
                case 9:
                    numberCs = "ninety";
                    break;
            }
            if (k % 10 != 0) {
                numberCs += "-" + changeOnes(k % 10);
            }
            return numberCs;
        }
    }

    private static String numberToString(int number) {
        String numberCs = "";
        if (number > 0 && number <= 9999) {
            // thousands
            int thousands = number / 1000;
            if (thousands != 0)
                numberCs += changeThousands(thousands) + " ";
            // hundreds
            int hundreds = (number % 1000) / 100;
            if (hundreds != 0)
                numberCs += changeHundreds(hundreds) + " ";
            // tens and ones
            int tao = (number % 100);
            if (tao != 0)
                numberCs += changeTensAndOnes(tao);
        } else if (number == 0) {
            numberCs = "zero";
        } else {
            numberCs = Integer.toString(number);
        }
        return numberCs.trim();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String info = "o- - - - - - - -\n" +
            "| Program creates a character string from a positive integer\n" +
            "| Numbers bigger than 9999 are not changed.\n" +
            "| End program by typing a negative integer.\n" +
            "o- - - - - - - -\n";
        int number;
        System.out.println(info);
        do {
            System.out.print("Type in number: ");
            number = reader.nextInt();
            if (number < 0)
                System.out.println("Nice doing business with you!");
            else
                System.out.println(number + " --> " + numberToString(number));
        } while (number >= 0);
    }
}
