package org.example.concurrency;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloRunnableWithJoin implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Hello form a thread! time: " + LocalDateTime.now());
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunnableWithJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new HelloRunnableWithJoin());
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunnableWithJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hello form a thread! time: " + LocalDateTime.now());
    }
}
