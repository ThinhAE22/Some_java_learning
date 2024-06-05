import java.util.Scanner;

public class Lesson20_print {
   public static void main(String args[]) {
    
       System.out.print("How many objects do you want to create:");
       Scanner reader = new Scanner(System.in);
       int amount = reader.nextInt();
       
       Thing[] things = new Thing[amount];
       
       for(int i = 0; i<amount; i++) {
           things[i] = new Thing();
       }
       
       Thing.numberOfObjects();
    }
}

    
class Thing{
    static int counter = 0;

    public Thing(){
        counter++;
    }
    public static void numberOfObjects(){
        System.out.print(counter + " objects were created.");
    }
}



