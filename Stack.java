// Author: Kori Reine
// File name: Stack.java
// Purpose: Interface to create a last-in, first-out stack.
// Date Last Modified: 5/14/2021

public interface Stack<E> {
  // Return true if this Stack is empty.
  public boolean isEmpty();

  // Return the top item on this Stack, but do not modify the Stack.
  // @throws RuntimeException if this Stack is empty.
  public E peek();

  // Remove and return the top item on this Stack.
  // @throws RuntimeException if this Stack is empty.
  public E pop();

  // Add target to the top of this Stack.
  public void push(E target);
}