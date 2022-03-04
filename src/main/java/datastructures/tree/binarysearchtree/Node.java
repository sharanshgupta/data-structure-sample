package datastructures.tree.binarysearchtree;

public class Node {

  int value; // Place holder for value
  Node right; // Reference to next node in linked list
  Node left;

  public Node(int value) {
    this.value = value;
    this.right = null;
    this.left = null;
  }
}
