public class App {
    public static <T> void main(String[] args) throws Exception {
        System.out.println("Creating a Stack...");
        Stack s = new Stack();
        s.push(100);
        s.push(200);
        s.push(300);
        System.out.println("The current top is: " + s.peek());
        s.pop();
        System.out.println("The current top is: " + s.peek());
        s.pop();
        s.pop();
        System.out.println("The current stack is empty: " + s.isEmpty());
    }
}
