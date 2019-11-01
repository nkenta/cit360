/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;

/**
 *
 * @author Nkenta Uchechukwu 
 */
public class JavaRunnable implements Runnable {

    @Override
    public void run() {
        // Creating lists with the days of the week
        String array[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
        
        // Make a print of text
        System.out.println("------------------------------");
        System.out.println("There are Seven Days in a Week");
        System.out.println("------------------------------");

        for (String day : array) {
            // Display days of the week line after line
            System.out.println("We have: " + day);

            // This controls the speed at which each line is printed out
            try {
                //The thread sleeps in 3 seconds
                Thread.sleep(3000);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        
        /**
         * Using "for" statement to loop through the number as long as it less
         * than or equal to 7 
         * NOTE: Counting begins from 0
         **/
        System.out.println("--------------------------");
        System.out.println("--Continue with Counting--");
        System.out.println("--------------------------");
        for (int count = 0; count < 7; count++) {
            // Display days of the week line after line
            System.out.println("Counting:.. " + count);

            // This controls the speed at which each line is printed out
            try {
                //The thread sleeps in 3 seconds
                Thread.sleep(3000);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        System.out.println("---Total of 7 Days---");
        System.out.println("---Task Completed---");
    }
}
