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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutor {

    public static void main(String[] args) throws InterruptedException {

        // This limits the numbers of thread running at the same time
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        /**
         * This counts to 7. Counting will be seen ending in 6. This is because
         * it begins to count from 0 as number 1. Using "for" statement to loop
         * through the number as long as it less than or equal to 7
         *
         */
        for (int i = 0; i <= 7; i++) {

            //This executes and controls runnable
            executorService.execute(new JavaRunnable() {

                @Override
                public void run() {
                    /**
                     * Adding try for each case and then apply catch to handle
                     * system errors *
                     */
                    try {
                        System.out.println("First TestCase");
                        Thread.currentThread();
                        Thread.sleep(3000);
                        System.out.println("Second TestCase");
                        Thread.currentThread();
                        Thread.sleep(3000);
                        System.out.println("Third TestCase");
                        Thread.currentThread();
                        Thread.sleep(3000);
                    } catch (InterruptedException exc) {
                        exc.printStackTrace();
                    }
                }
            });
        }
    }
}
