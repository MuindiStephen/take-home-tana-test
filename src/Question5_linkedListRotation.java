class ListNode {
    String val;
    ListNode next;

    ListNode(String val) {
        this.val = val;
        this.next = null;
    }
}
/**
 * Question 5
 * @author MuindiStephen
 * @email stephenmuindi241@gmail.com
 * Created: 21/09/2025 20:15
 */
public class Question5_linkedListRotation {
    public static void main(String[] args) {
        ListNode head = new ListNode("ID_A01");
        head.next = new ListNode("ID_A02");
        head.next.next = new ListNode("ID_A03");
        head.next.next.next = new ListNode("ID_A04");
        head.next.next.next.next = new ListNode("ID_A05");
        head.next.next.next.next.next = new ListNode("ID_A06");

        System.out.print("List to be rotated is :");
        printList(head);

        ListNode rotated = rotateLinkedListElementsToRight(head, 2);

        System.out.print("Rotated list by moving each element in the list n times to the right is: ");
        printList(rotated);
    }

    public static ListNode rotateLinkedListElementsToRight(ListNode head, int n) {
        if (head == null || head.next == null || n == 0) return head;

        // The length
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // an integer n for the n steps
        n = n % length;
        if (n == 0) return head;

        // the new head
        int stepsToNewHead = length - n;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

    /**
     * This utility function will print the list
     * @param head
     */
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println(" -> null");
    }
}
