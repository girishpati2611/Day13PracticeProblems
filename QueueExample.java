package com.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue is the example of linear data structure which works on the principle of FIRST IN FIRST OUT(FIFO).
        Queue<String>queue=new LinkedList<>();
        queue.add("Virat");
        queue.add("Rohit");
        queue.add("Suryaa");
        queue.add("Shami");

        System.out.println("Elements in the queue before removing are:");
        Iterator<String>iterator= queue.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "=>");
        }
        System.out.println();
            queue.remove();
            queue.remove("Rohit");
            System.out.println("Elements in the queue after removing are:");
            System.out.print(queue);
        System.out.println();

            boolean isEmpty= queue.isEmpty();
            System.out.println("The stack is empty =>"+isEmpty);
            queue.clear();
            System.out.println("The queue is cleared successfully.");
    }
}
