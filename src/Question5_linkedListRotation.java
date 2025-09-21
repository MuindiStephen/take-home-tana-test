
/**
 * Question 5
 * @author MuindiStephen
 * @email stephenmuindi241@gmail.com
 * Created: 21/09/2025 20:15
 */
public class Question5_linkedListRotation {
    public static void main(String[] args) {
        NodeValue head = new NodeValue("ID_A01");
        head.nextValue = new NodeValue("ID_A02");
        head.nextValue.nextValue = new NodeValue("ID_A03");
        head.nextValue.nextValue.nextValue = new NodeValue("ID_A04");
        head.nextValue.nextValue.nextValue.nextValue = new NodeValue("ID_A05");
        head.nextValue.nextValue.nextValue.nextValue.nextValue = new NodeValue("ID_A06");

        System.out.print("List to be rotated is :");
        printList(head);

        NodeValue rotated = rotateLinkedListElementsToRight(head, 2);

        System.out.print("Rotated list by moving each element in the list n times to the right is: ");
        printList(rotated);
    }

    public static NodeValue rotateLinkedListElementsToRight(NodeValue head, int n) {
        if (head == null || head.nextValue == null || n == 0) return head;

        // The length
        int length = 1;
        NodeValue tail = head;
        while (tail.nextValue != null) {
            tail = tail.nextValue;
            length++;
        }

        // an integer n for the n steps
        n = n % length;
        if (n == 0) return head;

        // the new head
        int stepsToNewHead = length - n;
        NodeValue newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.nextValue;
        }

        NodeValue newHead = newTail.nextValue;
        newTail.nextValue = null;
        tail.nextValue = head;

        return newHead;
    }

    /**
     * This utility function will print the list
     * @param head
     */
    public static void printList(NodeValue head) {
        NodeValue curr = head;
        while (curr != null) {
            System.out.print(curr.value);
            if (curr.nextValue != null) System.out.print(" -> ");
            curr = curr.nextValue;
        }
        System.out.println(" -> null");
    }
}

class NodeValue {
    String value;
    NodeValue nextValue;

    NodeValue(String val) {
        this.value = val;
        this.nextValue = null;
    }
}
