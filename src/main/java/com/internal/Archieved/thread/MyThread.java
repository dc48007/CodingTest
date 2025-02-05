package com.internal.Archieved.thread;

import com.internal.Archieved.Practise.Synchronization.Counter;

public class MyThread extends Thread {
    private Counter counterClass;
    public MyThread(Counter counterClass) {
        this.counterClass = counterClass;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counterClass.increment();
            System.out.println("counter of thread :"+Thread.currentThread().getName()+"---"+counterClass.getCounter());
        }
    }
}
