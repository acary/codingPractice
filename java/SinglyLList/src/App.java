public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Singly Linked List Example:");
        LList list = new LList();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.print();
        list.length();
    }
}
