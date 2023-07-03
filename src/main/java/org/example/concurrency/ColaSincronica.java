package org.example.concurrency;

import java.util.LinkedList;

public class ColaSincronica {
    private String cola;
    private boolean isEmpty;

    public synchronized void put(int elementos) {
        while(!isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.cola = String.valueOf(elementos);
        isEmpty = false;
        notifyAll();
    }

    public synchronized String get(int elementos) {
        while(isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isEmpty = true;
        notifyAll();
        return cola;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public static void main(String[] args) {
        ColaSincronica cola = new ColaSincronica();
        Thread p = new Thread(new Producer(cola));
        Thread c = new Thread(new Consumer(cola));
        p.start();
        c.start();
    }
}
