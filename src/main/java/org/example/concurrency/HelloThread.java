package org.example.concurrency;

public class HelloThread extends Thread {
    public void run(){
        System.out.println("Hello from a thread!");
    }
    public static void main(String[] args) {
        System.out.println("Hello forma main!");
        (new HelloThread()).start();
    }
}
