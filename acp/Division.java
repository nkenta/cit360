package acp;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class Division implements Interface{

    /**
     * 
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Double num1, Double num2) {
            Double Division;
        Division = num1 / num2;
            System.out.println(Division);
    }
}