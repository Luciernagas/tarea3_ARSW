package org.example.concurrency;

public class Consumer implements Runnable{
    private final ColaSincronica cola;

    public Consumer(ColaSincronica cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(cola.get(i));
            }
        }
    }

