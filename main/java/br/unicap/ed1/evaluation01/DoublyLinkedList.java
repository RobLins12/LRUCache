package br.unicap.ed1.evaluation01;

public class DoublyLinkedList {

	private DoublyListNode head;

    public DoublyListNode getHead() {
        return head;
    }

    public void setHead(DoublyListNode head) {
        this.head = head;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }

    public void addFirst(Integer key, Integer value){
        DoublyListNode newhead = new DoublyListNode(key, value ,this.getHead());
        this.setHead(newhead);
    }

    public DoublyListNode search(Integer value){
        DoublyListNode currenttail = this.head;
        while (currenttail != null) {
            if (currenttail.getValue().equals(value)) {
                return currenttail;
            }
            currenttail = currenttail.getNext();
        }
        return null;
    }

    public DoublyListNode SearchLast(){
        DoublyListNode currenttail = this.head;
        while (currenttail.getNext() != null) {
                currenttail = currenttail.getNext();
            }
            return currenttail;
    }

    public Integer searchKey(Integer key){
        DoublyListNode currenttail = this.head;
        while (currenttail != null) {
            if (currenttail.getKey() == key) {
                return currenttail.getValue();
            }
            currenttail = currenttail.getNext();
        }
        return null;
    }

    public int size(){
        DoublyListNode currentNode = this.head;
        int size = 0;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    public boolean isOrdered(boolean ascending){
        int countAsTrue = 0;
        int countAsFalse = 0;
        if (isEmpty()) {
            ascending = true;
            return true;
        }
        DoublyListNode currenttail = this.head;
        while (currenttail.getNext() != null) {
            if (currenttail.getValue() > currenttail.getNext().getValue()) {
                countAsTrue++;
            }
            currenttail = currenttail.getNext();
        }
        currenttail = this.head;
        while (currenttail.getNext() != null) {
            if (currenttail.getValue() < currenttail.getNext().getValue()) {
                countAsFalse++;
            }
            currenttail = currenttail.getNext();
        }
        if (countAsFalse == this.size() - 1) {
            ascending = false;
            return true;
        }
        if (countAsTrue == this.size() - 1) {
            ascending = true;
            return true;
        } else{
            return false;
        }
        
    }

    public void addLast(Integer key, Integer value){
        if (isEmpty()) {
            addFirst(key, value);
        } else {
            DoublyListNode newtail = new DoublyListNode (key ,value ,null);
            DoublyListNode currenttail = this.head;
            while (currenttail.getNext() != null) {
                currenttail = currenttail.getNext();
            }
            currenttail.setNext(newtail);
        }
    }

    public void reverse(){
        DoublyListNode previous = null;  
        DoublyListNode current = this.head;  
        DoublyListNode next = null;  
        while (current != null)  {  
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }   
        this.head = previous;
    }

    public void delete(DoublyListNode node){
        if (isEmpty()) {
            return;
        } if (this.head == node) {
            this.head = this.head.getNext();
        }else {
            DoublyListNode previousNode = this.head;
            while (previousNode.getNext() != node) {
                    previousNode = previousNode.getNext(); 
                }
                previousNode.setNext(node.getNext());
            }
        }
    }