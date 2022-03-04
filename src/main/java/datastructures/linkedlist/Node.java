package datastructures.linkedlist;

public class Node {

  int data; // Place holder for value
  Node next; // Reference to next node in linked list

  // This constructor refers to adding of a node at the end whose reference to next node is null
  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + data +
      ", next=" + next +
      '}';
  }
}
