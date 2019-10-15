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
public class ThreadsExecutorsRunnables implements Runnable {

    @Override 
    public void run() {

        // Defining a for statement to run if the condition is true
        // Where i stands for index
        for (int index = 0; index < 3; index++) {
            System.out.println("Primary Thread: " + index);

            // A try statement to pause the execution for 3 seconds
            try {
                Thread.sleep(3000);
            } /**
             * Adding Exceptions in case of errors. This displays a message when
             * errors are found
             *
             */
            catch (InterruptedException error) {
                System.out.println("Sorry! Couldn't complete "
                        + "Primary Thread action" + error);
            }
        }

        System.out.println("Primary Thread Completed.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create new thread 
        // st for secondary thread
        Thread st = new Thread(new ThreadsExecutorsRunnables(), "Secondary Thread");

        // This will start a thread 
        /* NOTE: .sleep places a thread on sleep for a specific time
                   initiated. While .start begins a thread
         */
        st.start();

        // Creating a conditional statement
        for (int index = 0; index < 5; index++) { 

            System.out.println("Secondary Thread: " + index);

            // A try statement to pause the execution for 5 seconds
            try {
                Thread.sleep(5000);
            } // Adding Exceptions in case of errors
            catch (InterruptedException error) {
                System.out.println("Sorry! Couldn't complete "
                        + "Secondary Thread action! " + error);
            }
        }
        System.out.println("Success! Secondary Thread Completed.");
    }
}
