public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's create a queue!");
        Queue q = new Queue();              // create new queue
        System.out.println(q.isEmpty());    // call isEmpty() method to confirm queue is empty
        q.add(100);                         // call add() method to add node
        System.out.println(q.isEmpty());    // confirms queue is not empty (returns false)
        System.out.println(q.peek());       // call peek() to view first node
        q.add(200);                         // add new node (200)
        q.remove();                         // remove first node (100)
        q.add(300);                         // add new node (300)
        System.out.println(q.peek());       // show current front of queue (200)
    }
}
