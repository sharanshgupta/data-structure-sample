package datastructures.queue.linkedlist;

public class Queue {
  Node first = null;
  Node last = null;
  int length = 0;

  public String peek() {
    if (this.length > 0) {
      return String.valueOf(this.first.value);
    } else {
      return null;
    }
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (this.length == 0) {
      this.first = newNode;
    } else {
      this.last.next = newNode;
    }
    this.last = newNode;
    this.length++;
  }

  public void dequeue() {
    if (this.length > 0) {
      this.first = this.first.next;

      if (this.length == 1) {
        this.last = null;
      }
      this.length--;
    }
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public static void main(String[] args) {
    Queue myQueue = new Queue();
    System.out.println(myQueue.isEmpty());
    System.out.println(myQueue.peek());
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.dequeue();
    System.out.println(myQueue.peek());
  }
}
