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
public class JTER_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // This code handles the call from JavaRunnable class. Creates an object 
        // Then assign it to thread variable
        Thread thread = new Thread(new JavaRunnable());
        thread.start();
    }
}
