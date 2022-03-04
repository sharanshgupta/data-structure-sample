package datastructures.queue.linkedlist;

public class Node {

  int value; // Place holder for value
  Node next; // Reference to next node in linked list

  // This constructor refers to adding of a node at the end whose reference to next node is null
  public Node(int value) {
    this.value = value;
    this.next = null;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + value +
      ", next=" + next +
      '}';
  }
}
