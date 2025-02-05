package com.internal.Archieved.thread;

import com.internal.Archieved.Java11.Example;

public class ThreadExample extends Thread{
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId()+" --- "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample();
        ThreadExample threadExample2 = new ThreadExample();
        threadExample1.start();
        threadExample2.start();
    }
}
