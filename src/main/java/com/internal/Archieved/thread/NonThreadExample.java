package com.internal.Archieved.thread;

public class NonThreadExample {

        public void execute() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " - " + i);
                try {
                    Thread.sleep(1000);  // Pause the task for 1000 milliseconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        public static void main(String[] args) {
            NonThreadExample task1 = new NonThreadExample();
            NonThreadExample task2 = new NonThreadExample();

            task1.execute();  // Running the first task
            task2.execute();  // Running the second task
        }
    }

