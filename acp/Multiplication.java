package acp;

/**
 * 
 * @author Nkenta Uchechukwu
 */
public class Multiplication implements Interface {
    /**
     * 
     * @param num1
     * @param num2
     */
        @Override
	    public void execute(Double num1, Double num2) {
	        Double Multiplication;
             Multiplication = num1 * num2;
	        System.out.println(Multiplication);	    
    }
}