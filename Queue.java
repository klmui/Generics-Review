import java.util.NoSuchElementException;

/**
 * Queue implementation
 * 
 * @author Kenneth
 *
 * @param <T> generic type of an item 
 */
public class Queue<T> {
  private Node first;
  private Node last;
  private int size;
  
  private class Node {
    private T item;
    private Node next;
  }
  
  public Queue() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }
  
  /**
   * Returns the node at the front of the line/queue
   * 
   * @return the node at the front of the queue
   */
  public T peek() {
    if (this.size == 0) {
      throw new NoSuchElementException("No elements in the queue");
    } else {
      return first.item;
    }
  }
  
  /**
   * Adds to the front of the line/queue
   * 
   * @param item
   */
  public void enqueue(T item) {
    // Make the node to be added to the queue
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    
    // Add the node to the queue
    if (this.size == 0) {
      this.first = this.last;
    } else {
      oldLast.next = last;
    }
    this.size++;
    
  }
  
  /**
   * Removes from the front of the line/queue
   * 
   * @param item
   */
  public void dequeue() {
    if (this.size == 0) {
      throw new NoSuchElementException("No elements in the queue");
    } else {
      this.first = this.first.next;
      this.size--;
    }
  }
  
}
