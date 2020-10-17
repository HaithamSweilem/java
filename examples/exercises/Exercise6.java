package exercises;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int number = new Random(33).nextInt(1000);
        int from = -140;
        int to = 600;

        String message = ((number <= to && number >= from) ? "" : "not ") + "in range";
        System.out.println("number " + number + " is " + message + " (" + from + ", " + to + ");");

        String a1 = "a";
        String b = "b";
        String a2 = "a";
        System.out.println("a1 == b ? " + a1.equals(b));
        System.out.println("a1 == a2 ? " + a1.equals(a2));

        int num = 10;
        switch (num) {
            case 4 : System.out.println("num : " + 4); break;
            case 10 : System.out.println("num : " + 10); break;
        }

        String type = "gold";
        switch(type) {
            case "gold" : System.out.println(10); break;
            case "metal" : System.out.println(5); break;
            default:
                System.out.println(1);
        }
    }
}
