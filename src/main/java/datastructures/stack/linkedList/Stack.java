package datastructures.stack.linkedList;

import java.util.Arrays;

public class Stack {

  Node top;
  Node bottom;
  int length;

  public Stack(int value) {
    Node node = new Node(value);
    top = bottom = node;
    length = 1;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      top = newNode;
      bottom = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    this.length++;
  }

  public void pop() {
    if (length > 0) {
      top = top.next;
      if (length == 1) {
        bottom = null;
      }
      length--;
    }
  }

  public String peek() {
    if (length > 0) {
      return String.valueOf(top.value);
    } else {
      return null;
    }
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public String getLastElement() {
    if (length > 0) {
      return String.valueOf(bottom.value);
    }
    return null;
  }

  public int[] printList() {
    int[] myList = new int[length];
    Node current = this.top;
    int i = 0;
    while (current != null) {
      myList[i] = current.value;
      current = current.next;
      i++;
    }
    return myList;
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);
    // Push
    stack.push(2);
    stack.push(4);
    // Print stack
    System.out.println(Arrays.toString(stack.printList()));
    // Peek
    System.out.println(stack.peek());
    // Check length of stack
    System.out.println("Length of stack -> " + stack.length);
    // Pop
    stack.pop();
    // Print stack
    System.out.println(Arrays.toString(stack.printList()));
    //Check length of stack
    System.out.println("Length of stack -> " + stack.length);
    // Check if stack is empty
    System.out.println(stack.isEmpty());
    // Get last element
    System.out.println(stack.getLastElement());
  }
}
