public class RotateList61 {



    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;

        ListNode tail = head;
        int size = 1;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }

        if(k % size == 0) return head;
        k = k % size;

        int jumps = size - k - 1;
        ListNode curr = head;
        while(jumps > 0){
            curr = curr.next;
            jumps--;
        }

        tail.next = head;
        head = curr.next;
        curr.next = null;

        return head;
    }

    public static void main(String[] args) {

    }
}
