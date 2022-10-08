package com.icp.threads;

/**
 * Creates a thread to print out the message "hello" in a finite counting loop.
 * After creating the thread, the main program prints out "goodbye" and then terminates.
 */
public class ThreadOne implements Runnable {

    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }

    public static void main (String[] args) {
        ThreadOne obj = new ThreadOne();
        Thread thread = new Thread(obj);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }
        System.out.println("goodbye");
    }

}
