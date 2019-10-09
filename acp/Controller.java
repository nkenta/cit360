package acp;

import java.util.HashMap;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class Controller {

    
    public static HashMap<String, Interface> key = new HashMap <String, Interface>();


    public Controller() {
    }

    /**
     * 
     * @param operator
     * @param num1
     * @param num2
     */
    public static void applicationHandler(String operator, Double num1, Double num2) {
        
        // binary operations
        Interface putAddition;
        putAddition = key.put("+", (Interface) new Addition());
        Interface putDivision;
        putDivision = key.put("/", (Interface) new Division());
        Interface putMultiplication;
        putMultiplication = key.put("*", (Interface) new Multiplication());
        Interface putSubtraction;
        putSubtraction = key.put("-", (Interface) new Subtraction());
        
        Interface arrange;
        arrange = key.get(operator);
        final Interface arrangeData;
        arrangeData = arrange;
        arrangeData.execute(num1, num2);
      
    }
}
