import java.util.Scanner;
 
public class Lesson18_point {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the first values of the coordinates:");
        System.out.print("x: ");
        int x = reader.nextInt();
        System.out.print("y: ");
        int y = reader.nextInt();
        
        Point point = new Point(x, y);
         
        System.out.println("Point is now at : " + point);
        System.out.println("Type in the change of x and y coordinates");
        System.out.print("x: ");
        x = reader.nextInt();
        System.out.print("y: ");
        y = reader.nextInt();
        
        point.move(x, y);
        System.out.println("Point is now at: " + point);// this println auto call toString
    }
}
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = Math.max(0, Math.min(100, x));
        this.y = Math.max(0, Math.min(100, y));
    }
    //Overide the to string method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void move(int xm, int ym) {
        this.x = Math.max(0, Math.min(100, this.x + xm));
        this.y = Math.max(0, Math.min(100, this.y + ym));
    }
}