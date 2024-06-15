public class ReverseLinkedListII92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode currNode = head;

        while(left > 1){
            prev = currNode;
            currNode = currNode.next;
            left--;
            right--;
        }

        ListNode connectionStartNode = prev;
        ListNode connectionEndNode = currNode;

        while(right > 0){
            ListNode nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            right--;
        }

        if(connectionStartNode != null){
            connectionStartNode.next = prev;
        }else {
            head = prev;
        }

        connectionEndNode.next = currNode;

        return head;

    }

    public static void main(String[] args) {

    }
}
