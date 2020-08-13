package com.datastructure.stack;

import java.util.Arrays;

public class Stack {
    private final int[] data;
    private int count=-1;
    public Stack(int numberOfElements) {
        this.data = new int[numberOfElements];
    }

    public void push(int value){
        if(count<data.length) this.data[++count]=value;
        else throw new ArrayIndexOutOfBoundsException();

    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }else return this.data[count--];
    }
    public int peek(){
        return this.data[count];
    }

    public boolean isEmpty(){
        if(count == -1)return true;
        return false;
    }
    public static void main(String[] args) {
        Stack stack=new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.push(4);
        stack.push(5);
        System.out.println(Arrays.toString(stack.data));
    }
}
