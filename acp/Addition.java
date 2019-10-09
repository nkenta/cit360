package acp;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class Addition implements Interface {

    /** 
     *
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Double num1, Double num2) {
                Double addition;
        addition = num1 + num2;
                System.out.println(addition);   
    }  
}
