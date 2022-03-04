package leetcode.linkedlist.easy;

/*
  Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
  It is guaranteed that the node to be deleted is not a tail node in the list.

  Input: head = [4,5,1,9], node = 5
  Output: [4,1,9]
  Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
*/

public class DeleteNodeInALinkedList {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    node.next.next.next.next.next.next = new ListNode(7);
    node.next.next.next.next.next.next.next = new ListNode(8);

    DeleteNodeInALinkedList delete = new DeleteNodeInALinkedList();
    delete.deleteNode(node.next.next);
    delete.printLL(node);
  }

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public void printLL(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.println(current.val);
      current = current.next;
    }
  }
}
