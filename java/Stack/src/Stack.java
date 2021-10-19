import java.util.EmptyStackException;

/** 
 * The Stack data structure uses LIFO (last-in first-out) ordering.
 * Useful often in recursive algorithms, you can push temporary data
 * onto the stack, and remove them when backtracking.
 */
public class Stack<T> {                                     // Stack uses type variable, T, (a non-primitive class, interface, array or another type variable)

    private static class StackNode<T> {                     // StackNode defines the node for use in the Stack
        private T data;                                     // `data` field holds the node's data as type T
        private StackNode<T> next;                          // `next` field points to the next node as type StackNode

        public StackNode(T data) {                          // StackNode publicly exposes its data field as `this.data`
            this.data = data;
        }
    }

    private StackNode<T> top;                               // `top` field points to the Stack's top node and is private

    public T pop() {                                        // `pop()` method removes the top node and returns it
        if (top == null) throw new EmptyStackException();   // if the stack is empty, there is no top
        T item = top.data;                                  // `item` holds the top's data temporarily
        top = top.next;                                     // `top` becomes the node of the initial top's `next` field
        return item;                                        // `item` is returned to the caller
    }

    public void push(T item) {                              // `push()` method takes an `item` of type T and returns nothing
        StackNode<T> t = new StackNode<T>(item);            // we create a new StackNode with the item passed into the method
        t.next = top;                                       // the new node's `next` field is the current top
        top = t;                                            // `top` is now the new node
    }

    public T peek() {                                       // `peek()` method returns the data of the top node and is of type T
        if (top == null) throw new EmptyStackException();   // if the stack is empty, there is no top
        return top.data;                                    // return the data of the top node
    }

    public boolean isEmpty() {                              // `isEmpty()` boolean returns `true` if the stack is empty
        return top == null;                                 // if the stack is empty, then top is equal to `null`
    }
}