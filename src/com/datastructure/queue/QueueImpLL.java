package com.datastructure.queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class QueueImpLL {

    private LinkedList<Integer> queue;
    public QueueImpLL() {
        this.queue = new LinkedList<Integer>();
    }
    public void enQueue(int val){
        queue.add(val);
    }
    public int deQueue(){
        if(queue.isEmpty()) throw new IllegalStateException();
        return queue.getFirst();
    }

    public static void main(String[] args) {
        QueueImpLL queue= new QueueImpLL();

        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(9);

        System.out.println(queue.deQueue());
    }

}
