package calc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static void main(String[] args) throws Exception {
        // create a calculator
        Calculator ca = new Calculator();
        // parse equation from keyboard input
        String[] equation = ca.parseEquation();

        // specify x, operator, and y
        double x = Double.parseDouble(equation[0]);
        String operator = equation[1];
        double y = Double.parseDouble(equation[2]);

        // TODO: implement your code here
        // x + y
        // x - y
        // x * y
        // x / y
        // x % y
    }

    /**
     * This method parses a string input from the keyboard in the format:
     *  <operand_1> <operator> <operand_2>
     * And returns an array containing the two operands and the operator as Strings.
     * 
     * @return a String[] containing the operands and the operation.
     * @throws Exception when this method cannot parse input line as a valid supported equation
     */
    String[] parseEquation() throws Exception {

        // define the equation to be returned as a result
        // an equation is composed of three parts: operand 1, binary operator, operand 2
        String[] equation = new String[3];

        // define scanner
        Scanner cin = new Scanner(System.in);
        
        // get next line
        String line = cin.nextLine();
        
        // close scanner, we don't need it after this line
        cin.close();
        
        // define regex and pattern matcher
        String regex = "(\\d+.?\\d*)\\s*([+\\-/*%])\\s*(\\d+.?\\d*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher result = pattern.matcher(line);

        // execute the matcher and get the matching groups
        if (result.find()) {
            equation[0] = result.group(1);
            equation[1] = result.group(2);
            equation[2] = result.group(3);

            // return result
            return equation;
        }
        
        // throw an exception because we could not parse input
        throw new Exception("Could not identify input as a valid equation, or equation not supported yet.");
    }

}
