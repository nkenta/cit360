/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_test;

/**
 *
 * @author Nkenta Uchechukwu
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void testAssert() {

        //This will declare the Variables.
        String text1 = "Ferdinand";
        String text2 = "Ferdinand";
        String text3 = "Nkenta";
        String text4 = "Nkenta";
        String text5 = null;
        int name1 = 1;
        int name2 = 2;
        int[] num_Arrary1 = {1, 2, 3};
        int[] num_Arrary2 = {1, 2, 3};

        //Assert statements to determin the above variables
        
        //Makes comparisim with equals method of object class
        assertEquals(text1, text2);
        //Cheks if two objects define same object
        assertSame(text3, text4);
        //Checks if two object does not defines same object
        assertNotSame(text1, text3);
        //This checks if object is not null
        assertNotNull(text1);
        //This checks if object is null.
        assertNull(text5);
        /** Checks if condition is true. Since name one is equevalent to 
         * the value 1, then it is true as it is less than name 2 **/
        assertTrue(name1 < name2);
        //Checks if expected array and its result are equal.
        assertArrayEquals(num_Arrary1, num_Arrary2);
    }

}
