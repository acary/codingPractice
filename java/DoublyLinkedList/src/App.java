public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Creating a doubly linked list...");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(100);
        dll.addNode(200);
        dll.addNode(300);
        dll.addNode(400);
        dll.addNode(500);
        dll.printNodes();
    }
}
