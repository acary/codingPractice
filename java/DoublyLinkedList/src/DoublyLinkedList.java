/**
 * A class for a Doubly Linked List in Java.
 * The doubly linked list class holds the node class.
 * The node contains an `item` field to hold the node data,
 * a `previous` field to point to a prior node in the list
 * and a `next` field to point to a future node in the list.
 * A method to add a node to the end of the list
 * and one to print the elements in the list are given.
 */
public class DoublyLinkedList {

    class Node {
        int item;       // item holds node's data
        Node previous;  // previous is pointer to previous node
        Node next;      // next is pointer to next node

        public Node(int item) {
            this.item = item;   // node's data is public through the item field
        }
    }

    Node head = null;   // set head to null initially
    Node tail = null;   // set tail to null initially

    public void addNode(int item) {
        Node newNode = new Node(item);  // create new node from passed in item

        if (head == null) {             // if list is empty
            head = tail = newNode;      // both head and tail are the new node
            head.previous = null;       // set head's previous to null (start of list)
            tail.next = null;           // set tail's next to null (end of list)
        }
        else {
            tail.next = newNode;        // tail's next points to new node
            newNode.previous = tail;    // new node's previous points to prior tail
            tail = newNode;             // tail changes to the new node
            tail.next = null;           // new tail's next is null (end of list)
        }
    }

    public void printNodes() {
        Node current = head;            // set current to head
        if (head == null) {             // check for empty list
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of the doubly linked list:");
        while (current != null) {                   // while we have a current element,
            System.out.print(current.item + " ");   // print the node's data
            current = current.next;                 // and advance the pointer to the next element
        }
    }
}
