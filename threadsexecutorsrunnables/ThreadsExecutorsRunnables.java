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
            System.out.println("Thread A: " + index);

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
                        + "Thread A action" + error);
            }
        }

        System.out.println("Thread A Completed.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create new thread 
        // tb for thread b
        Thread tb = new Thread(new ThreadsExecutorsRunnables(), "Thread B");

        // This will start a thread 
        /* NOTE: .sleep places a thread on sleep for a specific time
                   initiated. While .start begins a thread
         */
        tb.start();

        // Creating a conditional statement
        for (int index = 0; index < 3; index++) {

            System.out.println("Thread B: " + index);

            // A try statement to pause the execution for 5 seconds
            try {
                Thread.sleep(5000);
            } // Adding Exceptions in case of errors
            catch (InterruptedException error) {
                System.out.println("Sorry! Couldn't complete "
                        + "Thread B action! " + error);
            }
        }
        System.out.println("Success! Thread B Completed.");
    }
}
