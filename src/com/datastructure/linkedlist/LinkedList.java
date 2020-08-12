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

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        //System.out.println(linkedList);
        linkedList.deleteFirst();
        linkedList.addLast(10);
        linkedList.addLast(12);
        linkedList.deleteLast();
        System.out.println(linkedList);

    }
}

