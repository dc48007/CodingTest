package com.internal.Archieved.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    public Queue<Integer> buffer = new LinkedList<>();
    public final int MAX_SIZE = 5;


    public void produce() throws InterruptedException {
        int element =0;
       synchronized (this){
        while(true){
            if(buffer.size()==MAX_SIZE){
                wait();
            }
            buffer.add(element++);
            System.out.println("Produced Element: "+(element-1));
            notify();
            Thread.sleep(10);
        }
       }
    }

public void consumer() throws InterruptedException {
        synchronized (this){
        while(true){
        if(buffer.size()==0){
            wait();
        }
       int value =  buffer.poll();
            System.out.println("Consumed Element: "+value);
            notify();
            Thread.sleep(10);
        }
}
    }

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread prducerThread = new Thread(()->{
            try{
                producerConsumer.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(()->{
            try{
                producerConsumer.consumer();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        prducerThread.start();
        consumerThread.start();
        try{
            prducerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
