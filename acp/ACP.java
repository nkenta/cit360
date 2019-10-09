package acp;

import java.util.*;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class ACP {

    private static Scanner inputNumbers;

    /** 
     *
     * @param args
     */
    public static void main(String[] args) {
	inputNumbers = new Scanner(System.in);
              
        //Allow user to enter first number
        Double num1;
        System.out.println("Enter first number: ");
        num1 = Double.parseDouble(inputNumbers.next());
        
        //Display Binary Operations for selection
        String operator;
        System.out.println("Select an Operator: [+, -, *, /]");
        operator = inputNumbers.next();
        
        //Allow user to enter second number
        Double num2;
        System.out.println("Enter second number: ");
        num2 = Double.parseDouble(inputNumbers.next());
        
        System.out.println("------------" );
        //Print out result
        System.out.println("Result:");
            final String BinaryOperations;
            BinaryOperations = operator;
            final Double firstNumber = num1;
            final Double SecondNumber = num2;
        Controller.applicationHandler(operator, firstNumber, SecondNumber);
        System.out.println("------------" );
    } 
}
