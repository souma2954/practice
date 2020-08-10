package com.datastructure.array;

/**
 * Implement sample arraylist functionality using simple array.
 *
 */
public class Array {
    int[] array;
    int currentPointer=0;
    int size;

    public Array(int size) {
        array= new int[size];
        this.size=size;
    }

    public void insert(int val){
        if(currentPointer >= this.size ){
            int[] newArray=new int[this.size*2];
            for(int i=0;i<currentPointer;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
        array[currentPointer]=val;
        currentPointer++;
    }

    public int removeAt(int index){
        if(index > this.size-1) return -1;
        int val=array[index];
        for(int i=index;i<currentPointer;i++){
            array[i]=array[i+1];
        }
        currentPointer--;
        return val;
    }

    public void print(){
        for(int i=0;i<currentPointer;i++)
            System.out.print(array[i]);
        System.out.println();
    }

    public int indexOf(int item){
        for(int i=0;i<currentPointer;i++) if(array[i]==item) return i;
        return -1;
    }

    public void reverse(){}

    public void intersect(){}

    public void insertAt(int pos,int val){}

    public int max() {return 0;}

    public static void main(String[] args) {
        Array arr= new Array(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        arr.print();
        System.out.println(arr.removeAt(100));
        System.out.println(arr.removeAt(2));
        arr.print();
        arr.insert(9);
        arr.print();

        System.out.println(arr.indexOf(5));
    }
}

