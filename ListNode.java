// Author: Kori Reine
// File name: ListNode.java
// Purpose: Class to create a list node
// Date Last Modified: 5/14/2021

public class ListNode<E> {
    private E item;
    private ListNode<E> next;

    public ListNode(E item) {
        this.item = item;
        next = null;
    }

    public ListNode(E item, ListNode<E> next) {
        this.item = item;
        this.next = next;
    }

    public E getItem() {
        return this.item;
    }

    public ListNode<E> getNext() {
        return this.next;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    // Override toStrign function
    @Override
    public String toString() {
        if (item != null)
            return String.format(((E)item).toString());
        return null;
    }
}

