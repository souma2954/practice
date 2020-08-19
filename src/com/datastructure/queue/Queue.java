package com.datastructure.queue;

import java.util.Arrays;

public class Queue {

    private int[] data;
    private int rearPos=0;
    private int frontPos=0;
    private int count;

    public Queue(int size) {
        this.data = new int[size];
    }

    public void enQueue(int val){
        if(isFull()) {
            throw new IllegalArgumentException();
        }else{
            data[rearPos] = val;
            rearPos=(rearPos+1) % data.length;
            count++;
        }
    }

    public boolean isEmpty(){
        if(count==0)return true;
        return false;
    }

    public boolean isFull(){
        if(count==data.length) return true;
        return false;
    }

    public int deQueue(){
        if(!isEmpty()){
            int val=data[frontPos];
            data[frontPos]=0;
            frontPos=(frontPos+1)%data.length;
            count--;
            return val;
        }
        return -1;
    }

    public int peek(){
        if(!isEmpty()) return data[frontPos];
        return -1;
    }

    public String printItems(){
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        Queue q= new Queue(4);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.printItems());
        System.out.println(q.deQueue());
        q.enQueue(6);
        System.out.println(q.deQueue());
        q.enQueue(7);
        System.out.println(q.peek());
        q.deQueue();
        q.deQueue();
        q.enQueue(8);
        System.out.println(q.printItems());
    }

}
