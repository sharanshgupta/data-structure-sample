package leetcode.linkedlist.easy;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
*/

public class MiddleOfTheLinkedList {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    node.next.next.next.next.next.next = new ListNode(7);
    node.next.next.next.next.next.next.next = new ListNode(8);

    MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();
    System.out.println(middle.middleNode(node).val);
  }

  public ListNode middleNode(ListNode head) {
    ListNode current = head;
    int counter = 0;

    while (current != null) {
      counter++;
      current = current.next;
    }

    current = head;
    boolean isEven = counter%2 == 0 ? true : false;
    for(int j = 1; j < counter/2 + 1; j++) {
      current = current.next;
    }
    return current;
  }
}
