package examples.overloading;

public class Overloading {
    public static void main(String[] args) {
        
        int x = 1;
        
        while(x < 5) {
            x++;
            callMethod(x);
        }
        System.out.println("X1 = " + x);

    }

    static int callMethod(int x) {
        x--;
        return x;
    }

    boolean lessThan(int x, int y) {
        return x < y;
    }

    boolean lessThan(String x, String y) {
        return Integer.parseInt(x) < Integer.parseInt(y);
    }

    /**
     * Overloaded method
     */
    int compare(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Overloading method
     */
    int compare(String num1, String num2) {
        
        // convert to integers first
        int num1AsInt = Integer.parseInt(num1);
        int num2AsInt = Integer.parseInt(num2);
        
        // call overloaded method
        return compare(num1AsInt, num2AsInt);
    }

    int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    int max(int num1, int num2, int num3) {
        return max(max(num1, num2), num3);
    }

    /**
     * 
     * @deprecated Deprecated because it is a Spaghetti method! Wash your hands!
     */
    int max(int num1, int num2, int num3, int num4) {
        return max(max(max(num1, num2), num3), num4);
    }

    int max(int[] numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int index = 0; index < numbers.length; index++) {
            if (maxNumber < numbers[index]) {
                maxNumber = numbers[index];
            }
        }
        return maxNumber;
    }
}
