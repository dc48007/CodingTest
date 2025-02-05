package com.internal.Archieved.thread;

import com.internal.Archieved.Practise.Synchronization.Counter;

public class SychronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new MyThread(counter);
        Thread t2= new MyThread(counter);
        t1.start();
        t1.join();
        t2.start();
        System.out.println(counter.getCounter());
        t1.join();
        System.out.println("status of thread: "+ t1.getState()+ "---"+ t2.getState());




    }
}
