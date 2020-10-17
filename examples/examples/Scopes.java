package examples;

public class Scopes {
    public static void main(String[] args) {

        
        int x = 10;

        if (x < 10) {
            int y = 20;
        } else {
            System.out.println("y = " + y);
        }

    }
}
