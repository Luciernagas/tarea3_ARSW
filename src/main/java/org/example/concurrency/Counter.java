package org.example.concurrency;

public class Counter {
    private int c = 0;

    public synchronized void increment(){
        c =+ 1;
    }

    public synchronized void decrement(){
        c =- 1;
    }
}
