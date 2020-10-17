package exercises;

public class Exercise13 {
    public static void main(String[] args) {
        
        String text = "123456";
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        System.out.println("Reversed: " + result);

        StringBuilder builder = new StringBuilder(0);
        for (int i = text.length() - 1; i >= 0; i--) {
            builder.append(text.charAt(i));
        }

        System.out.println("Reversed With Builder: " + builder.toString());
    }
}
