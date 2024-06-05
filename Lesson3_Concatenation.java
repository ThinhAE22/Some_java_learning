public class Lesson3_Concatenation { // combining string
    public static void main(String[] args) {
        String fourth = "9";
		String fifth = "5";
		int first = 1;
		int second = 2;
		int third = 7;
        System.out.println(first + fourth + (second + third) + fifth
             + ":Finland was the world champion in ice hockey.");
                        
        System.out.println(first + "" + (first + third) + (first - 1) + fourth
             + ": Finland went under Russian rule.");   
                       
        System.out.println(first + fifth + fifth + (first - 1)
             + ": Helsinki was founded.");
    }
}