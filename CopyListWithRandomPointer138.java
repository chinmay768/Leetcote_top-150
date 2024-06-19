import java.util.*;
public class CopyListWithRandomPointer138 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

     public Node copyRandomList(Node head) {
         Map<Node, Node> nodeMap = new HashMap<>();
         if (head == null) return null;

        Node current = head;
         while (current != null) {
             Node copyNode = new Node(current.val); // Create a new copy node
             nodeMap.put(current, copyNode); // Put mapping between original and copied nodes in the map
             current = current.next; // Move to the next node
         }

        current = head;
         while (current != null) {
             Node copyNode = nodeMap.get(current); // Get copied node
             copyNode.next = nodeMap.getOrDefault(current.next, null); // Set next pointer
             copyNode.random = nodeMap.getOrDefault(current.random, null); // Set random pointer
             current = current.next; // Move to the next node
         }

         return nodeMap.get(head);
     }

    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create new nodes and insert them next to the original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Set the random pointers of the new nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the new nodes from the original nodes
        curr = head;
        Node clonedHead = head.next;
        Node clonedCurr = clonedHead;
        while (clonedCurr.next != null) {
            curr.next = curr.next.next;
            clonedCurr.next = clonedCurr.next.next;
            curr = curr.next;
            clonedCurr = clonedCurr.next;
        }
        curr.next = null;
        clonedCurr.next = null;

        return clonedHead;
    }

    public static void main(String[] args) {

    }
}
