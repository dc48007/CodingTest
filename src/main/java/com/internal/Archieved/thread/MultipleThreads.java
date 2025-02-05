package com.internal.Archieved.thread;

public class MultipleThreads extends Thread{

    private String threadName ;

     MultipleThreads(String threadName){
         this.threadName = threadName;
     }
     public void run(){
         for (int i = 0; i <5 ; i++) {
             System.out.println(threadName +"----"+i);
             try{
                 Thread.sleep(1000);
             }catch (InterruptedException e){
                 e.getLocalizedMessage();
             }
         }
     }

    public static void main(String[] args) {

        MultipleThreads multipleThreads1 =  new MultipleThreads("Thread 1");
        MultipleThreads multipleThreads2 =  new MultipleThreads("Thread 2");
        MultipleThreads multipleThreads3 =  new MultipleThreads("Thread 3");
        multipleThreads1.start();
        multipleThreads2.start();
        multipleThreads3.start();

        try{
            multipleThreads1.join();
            System.out.println(" Thread "+ multipleThreads1.getName()+ " has finished working.");
            multipleThreads2.join();
            System.out.println(" Thread "+ multipleThreads2.getName()+ " has finished working.");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println( "Is "+ multipleThreads3.isAlive());
        System.out.println( "Is "+ multipleThreads2.isAlive());
        System.out.println( "Is "+ multipleThreads1.isAlive());

    }

}
