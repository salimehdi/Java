class Node {
    int data;
    Node next;
    Node prev;
}

public class prac11 {
    private Node head;

    public prac11() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = null;
        
        if (head != null) {
            head.prev = newNode;
        }
        
        head = newNode;
    }
}

// Example usage:
DoublyLinkedList list = new DoublyLinkedList();
list.add(3);
list.add(2);
list.add(1);
