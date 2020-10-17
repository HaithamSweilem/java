package string;

public class StringExamples {
    public static void main(String[] args) {

        String text = "abcd" +
            "efgh" + "ijkl" +
            "mnop" + "qrst" +
            "uvwx" + "yz";
        
        System.out.println(text);
        StringBuilder builder = new StringBuilder(0);
        
        for (char i = 'a'; i <= 'z'; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}
