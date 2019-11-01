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
class Threads extends Thread {

    @Override
    public void run() {

        // Controls and prints out 7 values
        for (int i = 0; i < 7; i++) {
            System.out.println("Start JavaThread: " + Thread.currentThread().getId() + " Counting Value " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
}

public class JavaThread {

    // Create a new thread of an object and start threads
    }
    public static void main(String[] args) {
        Thread first_thread = new Thread();
        first_thread.start();
        Thread second_thread = new Thread();
        second_thread.start();
        Thread third_thread = new Thread();
        third_thread.start();
    }

}
