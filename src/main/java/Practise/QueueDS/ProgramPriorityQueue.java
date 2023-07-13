package Practise.QueueDS;
import org.junit.Assert;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProgramPriorityQueue {



    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>(2);
        stringQueue.offer("Deepa");
        stringQueue.offer("hadipa");
        System.out.println(stringQueue.offer("manis"));
        stringQueue.forEach(System.out::println);
        System.out.println(stringQueue.peek());
      //  System.out.println("element removed--" + stringQueue.poll());
        System.out.println("=======================after=================");
        for (String s : stringQueue) {

                stringQueue.remove();

        }
        System.out.println(stringQueue);
    }
}
