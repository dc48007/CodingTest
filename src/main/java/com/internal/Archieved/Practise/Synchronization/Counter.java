package com.internal.Archieved.Practise.Synchronization;
public class Counter {

    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
