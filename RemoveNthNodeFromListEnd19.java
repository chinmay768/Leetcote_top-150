public class RemoveNthNodeFromListEnd19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int jumps = size - n;

        if(jumps == 0){
            return head.next;
        }

        temp = head;
        for(int i = 1; i <= jumps - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {

    }
}
