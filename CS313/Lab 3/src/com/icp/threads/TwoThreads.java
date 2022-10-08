package com.icp.threads;

/**
 * @author trhiana
 *
 * Creates two threads, one to print out "hello", and the other to print out "goodbye", both in finite counting loops.
 * After creating the two loops, the main program should terminate.
 */
public class TwoThreads {

    public static void main (String[] args) {
        // Thread One prints hello
        Thread1 obj1 = new Thread1();
        Thread thread1 = new Thread(obj1);

        // Thread Two prints goodbye
        Thread2 obj2 = new Thread2();
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

class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("goodbye");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}
