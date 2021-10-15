public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        SinglyLinkedList ll = new SinglyLinkedList();   // Instantiate new SinglyLinkedList
        System.out.println("The list is empty: " + ll.isEmpty());   // Should be true
        ll.append("ACARY");   // Append new node to list
        System.out.println("The list is empty: " + ll.isEmpty());   // Should be false
        System.out.println("The length of the linked list is: " + ll.length()); // Should be 1
        ll.append("CARYA");   // Append new node to list
        System.out.println("The length of the linked list is: " + ll.length()); // Should be 2
    }
}
