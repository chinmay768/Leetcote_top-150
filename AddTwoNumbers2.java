public class AddTwoNumbers2 {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode currNode = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = 0, val2 = 0;
            if(l1 != null) val1 = l1.val;
            if(l2 != null) val2 = l2.val;
            int sum = val1 + val2 + carry;

            carry = sum / 10;

            currNode.next = new ListNode(sum % 10);

            currNode = currNode.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};

    }
}
