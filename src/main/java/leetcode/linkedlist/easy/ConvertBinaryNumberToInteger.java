package leetcode.linkedlist.easy;

/*
  Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
  Return the decimal value of the number in the linked list.

  Example 1
  Input: head = [1,0,1]
  Output: 5
  Explanation: (101) in base 2 = (5) in base 10

  Example 2
  Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
  Output: 18880
  */

public class ConvertBinaryNumberToInteger {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(0);
    node.next.next = new ListNode(1);

    ConvertBinaryNumberToInteger convert = new ConvertBinaryNumberToInteger();
    System.out.println(convert.getDecimalValue(node));
  }

  public int getDecimalValue(ListNode head) {
    String binaryNumber = "";
    ListNode current = head;
    while(current != null) {
      binaryNumber += current.val;
      current = current.next;
    }
    return Integer.parseInt(binaryNumber, 2);
  }
}
