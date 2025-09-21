public class Question5_LinkedListRotationTest {

    public static void main(String[] args) {
        // I have created objects for our nodes in the linked list
        NodeValue head = new NodeValue("ID_A01");
        head.nextValue = new NodeValue("ID_A02");
        head.nextValue.nextValue = new NodeValue("ID_A03");
        head.nextValue.nextValue.nextValue = new NodeValue("ID_A04");
        head.nextValue.nextValue.nextValue.nextValue = new NodeValue("ID_A05");
        head.nextValue.nextValue.nextValue.nextValue.nextValue = new NodeValue("ID_A06");


        System.out.print("List to be rotated is :");
        Question5_linkedListRotation.printList(head);

        NodeValue rotated = Question5_linkedListRotation.rotateLinkedListElementsToRight(head, 2);

        System.out.println("The Expected outcome shd be: ID_A05 -> ID_A06 -> ID_A01 -> ID_A02 -> ID_A03 -> ID_A04 -> null");

        System.out.print("Rotated list by moving each element in the list n times to the right is: ");
        Question5_linkedListRotation.printList(rotated);
    }
}
