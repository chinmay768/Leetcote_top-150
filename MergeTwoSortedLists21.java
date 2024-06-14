public class MergeTwoSortedLists21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode currNode = tempNode;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                currNode.next = l1;
                l1 = l1.next;
            }else {
                currNode.next = l2;
                l2 = l2.next;
            }

            currNode = currNode.next;
        }

        if(l1 != null){
            currNode.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            currNode.next = l2;
            l2 = l2.next;
        }

        return tempNode.next;
    }

    public static void main(String[] args) {

    }
}
