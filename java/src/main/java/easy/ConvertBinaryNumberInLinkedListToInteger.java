package easy;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
      int sum = 0;
      for(ListNode node = head; node != null; node = node.next){
        sum = (sum << 1) + node.val;
      }
      return sum;
  }
}
