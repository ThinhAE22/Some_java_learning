class Lesson19_printthis {
    public static void main(String [] args) {
        Class firstObject = new Class ();
        Class secondObject = new Class ();
        Class thirdObject = new Class ();  
    }
} 
class Class {
    static int counter = 0; 
    int secondCounter = 0;
 
    Class () {
        counter ++;
        secondCounter ++;
        System.out.println(counter + " " + secondCounter);    
    }
}