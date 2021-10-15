/**
 * Singly Linked List in Java
 */
public class SinglyLinkedList {

    private Node head; // Head is the first or root node

    public boolean isEmpty() {
        return length() == 0; // isEmpty() method returns true if list length is 0
    }

    public void append(String data) { // append() method adds new node from data
        if (head == null) { 
            head = new Node(data);    // if list has no head, new node becomes the head
            return;
        }
        tail().next = new Node(data); // otherwise, find end of list and set new node as tail's next
    }

    private Node tail() {
        Node tail = head;   // Start at root

        // Iterate through list until last element found and return it
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public int length() {
        int length = 0;         // Initialize counter
        Node current = head;    // Set current variable to root
        // Increment counter for each traversal to next node
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    private static class Node {
        private Node next;      // Pointer to next
        private String data;    // Element's data field

        public Node(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }

    public static void main(String[] args) {
    
    }
}