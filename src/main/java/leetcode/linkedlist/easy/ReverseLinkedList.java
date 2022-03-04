package leetcode.linkedlist.easy;

/*
  Given the head of a singly linked list, reverse the list, and return the reversed list.

  Input: head = [1,2,3,4,5]
  Output: [5,4,3,2,1]
*/

public class ReverseLinkedList {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);

    ReverseLinkedList reverse = new ReverseLinkedList();
    reverse.reverseList(node).printLL();
  }

  public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous= null;
    ListNode temp= null;

    while(current!= null)
    {
      temp =current.next;
      current.next=previous;
      previous=current;
      current=temp;
    }

    return previous;
  }
}
