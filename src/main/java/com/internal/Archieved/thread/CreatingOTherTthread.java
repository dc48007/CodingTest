package com.internal.Archieved.thread;

import java.util.concurrent.ThreadLocalRandom;

public class CreatingOTherTthread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId()+ " -- main Thread");
        Thread otherThread  =  new Thread(()->{
            System.out.println("New Thread ID: "+ Thread.currentThread().getId());
        });

        otherThread.start();
        System.out.println("main thread ending");


    }
}
