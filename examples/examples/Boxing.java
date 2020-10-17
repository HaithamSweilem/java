package examples;

public class Boxing {
    public static void main(String[] args) {
        
        byte b = 100;
        Byte bBox = Byte.valueOf(b);
        Byte bBoxFromString = Byte.valueOf("100");

        short s = 30000;
        Short sBox = Short.valueOf(s);
        Short sBoxFromString = Short.valueOf("30000");

        int i = 1000000000;
        Integer iBox = Integer.valueOf(i);
        Integer iBoxFromString = Integer.valueOf("1000000000");
        Integer iBoxFromStringConcat = Integer.valueOf(i + "");
        
        float f = 100.12345f;
        Float fBox = Float.valueOf(f);
        Float fBoxFromString = Float.valueOf("100.12345f");
        Float fBoxFromStringConcat = Float.valueOf(f + "");
        
        double d = 100.12345f;
        Double dBox = Double.valueOf(d);
        Double dBoxFromString = Double.valueOf("100.12345f");
        Double dBoxFromStringConcat = Double.valueOf(d + "");
        
        boolean bool = true;
        Boolean boolBox = Boolean.valueOf(bool);
        Boolean boolBoxFromString = Boolean.valueOf("true");
        Boolean boolBoxFromStringConcat = Boolean.valueOf(bool + "");
        
        char c = 'p';
        Character cBox = Character.valueOf(c);
        // Character cBoxFromString = Character.valueOf("c"); not a method

        int iUnboxed = iBox.intValue();
        float fUnboxed = fBox.floatValue();
        double dUnboxed = dBox.doubleValue();
        boolean boolUnboxed = boolBox.booleanValue();
        char cUnboxed = cBox.charValue();


        int iStr = Integer.parseInt("15");
        float fStr = Float.parseFloat("21.20f");
        double dStr = Double.parseDouble("44.33");
        boolean bStr = Boolean.parseBoolean("false");
        
        // no Character.parseCharacter() method
        char cStr = "a".charAt(0);
    }
}
d