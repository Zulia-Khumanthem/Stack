public class LinkedList {
    private ListNode head;


    boolean isEmpty() {
        return head == null;
    }

    int headOfTheLinkedList() {
        if (this.isEmpty()) return -1;
        return head.getData();
    }

    // adding new element to the head of the linkedlist
    void addElement(int value) {
        ListNode newNode = new ListNode(value, null);

        if (this.isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    void shiftToNextElement(){
        if(this.isEmpty()) {
            System.out.println("Empty stacked.");
            return;
        }
        head = head.getNext();
    }
}