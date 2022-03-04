package leetcode.linkedlist.easy;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void printLL() {
    ListNode current = this;
    while (current != null) {
      System.out.println(current.val);
      current = current.next;
    }
  }
}
