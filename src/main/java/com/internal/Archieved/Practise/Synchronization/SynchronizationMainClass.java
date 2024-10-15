package com.internal.Archieved.Practise.Synchronization;
public class SynchronizationMainClass {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable runnable = () -> {
            for (int i = 0; i <100 ; i++)
                counter.increment();
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("final: "+ counter.getCounter());
    }
}
