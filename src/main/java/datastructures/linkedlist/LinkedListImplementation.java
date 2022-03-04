package datastructures.linkedlist;

// Create Linked List as depicted: 10 -> 5 -> 7

import java.util.Arrays;

public class LinkedListImplementation {

  private Node head;
  private Node tail;
  private int length;

  public LinkedListImplementation(int value) {
    Node node = new Node(value);
    head = node;
    tail = head;
    length = 1;
  }

  private void append(int value) {
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    length++;
  }

  private void prepend(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    length++;
  }

  public void insert(int index, int value) {
    if (index < 0 || index > length) {
      System.err.println("Index Out Of Bounds For Length " + length);
    } else if (index == 0) {
      prepend(value);
    } else if (index == length) {
      append(value);
    } else {
      Node current = head;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      Node newNode = new Node(value);
      newNode.next = current.next;
      current.next = newNode;
      length++;
    }
  }

  public void remove(int index) {
    if (index < 0 || index > length) {
      System.err.println("Index Out Of Bounds For Length " + length);
    } else if (index == 0) {
      head = this.head.next;
      length--;
    } else {
      Node current = head;
      int i;
      for (i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = current.next.next;
      length--;
      if (i == length - 1) {
        tail = current;
      }
    }
  }

  public LinkedListImplementation reverse() {
    LinkedListImplementation reversedList = new LinkedListImplementation(this.head.data);
    Node current = this.head;
    while(current.next != null) {
      reversedList.prepend(current.next.data);
      reversedList.length++;
      current = current.next;
    }
    return reversedList;
  }

  public int[] printList() {
    int[] myList = new int[length];
    Node current = this.head;
    int i = 0;
    while (current != null) {
      myList[i] = current.data;
      current = current.next;
      i++;
    }
    return myList;
  }

  public static void main(String[] args) {

    LinkedListImplementation myList = new LinkedListImplementation(2);
    // Append node
    myList.append(4);
    // Prepend node
    myList.prepend(1);
    // Insert node
    myList.insert(2, 3);
    // Print list
    System.out.println("My list -> " + Arrays.toString(myList.printList()));
    // Reverse List
    LinkedListImplementation reverse = myList.reverse();
    // Print reversed list
    System.out.println("My reversed list -> " + Arrays.toString(reverse.printList()));
    // Remove node
    myList.remove(2);
    // Print updated list
    System.out.println("My updated list -> " + Arrays.toString(myList.printList()));
  }

}

