package com.datastructure.linkedlist;

public class LinkedList {
    Node rootNode;
    Node lastNode;

    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private void setRoot(int value){
        rootNode=new Node(value);
        lastNode=rootNode;
    }
    public void addFirst(int value){
        if(rootNode==null){
            setRoot(value);
        }else{
            Node newRootNode=new Node(value);
            newRootNode.next=rootNode;
            rootNode=newRootNode;
        }
    }
    public void addLast(int value){
        if(rootNode==null){
            setRoot(value);
        }else{
            Node newLastNode=new Node(value);
            lastNode.next=newLastNode;
            lastNode=newLastNode;
        }
    }
    public void deleteLast(){
        if(rootNode==null) return;
        Node currentNode =rootNode;
        if(currentNode==lastNode){
            rootNode=null;
            lastNode=null;
        }else{
            while(currentNode.next !=lastNode)
                currentNode=currentNode.next;
            lastNode=currentNode;
            currentNode.next=null;
        }
    }

    public void deleteFirst(){
        if(rootNode ==null)return;
        Node nodeToBeDelete=rootNode;
        rootNode=rootNode.next;
        nodeToBeDelete.next=null;
    }

    public int indexOf(int value){return 0;}

    public int size(){return 0;}

    public void reverse(){
        if(rootNode==null)return;
        Node previousNode= rootNode;
        Node currentNode=previousNode.next;
        while(currentNode !=null){
            Node nextNode=currentNode.next;
            currentNode.next=previousNode;
            if(previousNode==rootNode){
                previousNode.next=null;
                lastNode=previousNode;
            }
            previousNode=currentNode;
            currentNode=nextNode;
        }
        rootNode=previousNode;
    }

    public boolean contains(){return false;}


    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        //System.out.println(linkedList);
        //linkedList.deleteFirst();
        linkedList.addLast(10);
        linkedList.addLast(12);
        //linkedList.deleteLast();
        System.out.println(linkedList);
        linkedList.reverse();
        System.out.println(linkedList);

    }
}

