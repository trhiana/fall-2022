package com.icp.threads;

/**
 * @author trhiana
 *
 * Creates two threads, one to print out "hello", and the other to print out "goodbye", both in finite counting loops.
 * After creating the two loops, the main program should terminate.
 */
public class FinalThread {

    public static void main (String[] args) {
        // Thread One prints hello
        First obj1 = new First();
        Thread thread1 = new Thread(obj1);

        // Thread Two prints goodbye
        Second obj2 = new Second();
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }
    }
}

class Second implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}

class First implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " goodbye");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}

