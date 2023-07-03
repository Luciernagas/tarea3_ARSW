package org.example.concurrency;

public class Producer implements Runnable{
    private final ColaSincronica cola;

    public Producer(ColaSincronica cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
                cola.put(i);
            }
        }
    }
