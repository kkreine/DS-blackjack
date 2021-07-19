// Author: Kori Reine
// File name: LinkedStack.java
// Purpose: Class to create a linked stack
// Date Last Modified: 5/14/2021

public class LinkedStack<E> implements Stack<E> {
    // The top ListNode in the Stack
    private ListNode<E> top;

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }
    
    public E peek() {
        if (isEmpty())
            throw new RuntimeException();
        return top.getItem();
    }

    public E pop() {
        if (isEmpty())
            throw new RuntimeException();
        E result = top.getItem();
        top = top.getNext();
        return result;
    }

    public void push(E target) {
        top = new ListNode<E>(target, top);
    }

    public void swap(int index1, int index2) {
        int i;
        ListNode<E> node1 = top;
        ListNode<E> node2 = top;

        for (i = 0; i < index1; i++) {
            if (node1 == null) {
                return;
            }
            node1 = node1.getNext();
        }
        for (i = 1; i < index2; i++) {
            if (node2 == null) {
                return;
            }
            node2 = node2.getNext();
        }
        E temp;
        temp = node1.getItem();
        node1.setItem(node2.getItem());
        node2.setItem(temp);
    }

    // Override toString function
    @Override
    public String toString() {
        ListNode<E> current = top;
        String returnStr = "";
        int i = 1;
        while (current != null) {
            returnStr += i + ":" + current.toString()  + " ";
            current = current.getNext();
            i++;
        }
        return returnStr;
    }
}