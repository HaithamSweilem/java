package exercises;

public class Exercise5 {
    public static void main(String[] args) {
        int x = 31;
        int y = 107;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        System.out.println("Now swapping without a temp variable");

        y = y + x;
        x = y - x;
        y = y - x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
