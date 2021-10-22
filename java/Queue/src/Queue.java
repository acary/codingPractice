import java.util.NoSuchElementException;

/**
 * A queue implements FIFO (first-in first-out) ordering.
 * It is useful for implementing a cache or breadth-first search, 
 * where adjacent nodes are added to the back of the queue.
 */
public class Queue<T> {                             // Queue class definition

    private static class QueueNode<T> {             // QueueNode class definition is contained within the Queue class
        private T data;                             // `data` of type T holds the queue node's value
        private QueueNode<T> next;                  // `next` points to the next queue node

        public QueueNode(T data) {                  // `data` is exposed publicly
            this.data = data;
        }
    }

    private QueueNode<T> first;                     // `first` points to the first node in the queue
    private QueueNode<T> last;                      // `last` points to the last node in the queue

    /* add() method adds a node to the end queue */
    public void add(T item) {                       // `add()` method takes an `item` of type T
        QueueNode<T> t = new QueueNode<T>(item);    // creates a new node from the passed in `item`
        if (last != null) {                         // if there is a last node...
            last.next = t;                          // assign its `next` as the new node
        }
        last = t;                                   // assign the last node as the new node
        if (first == null) {                        // if there is no first (queue is empty)...
            first = last;                           // first and last are the same node
        }
    }

    /* remove() method removes the first node in the queue */
    public T remove() {
        if (first == null) throw new NoSuchElementException();  // throw exception if there is no first node to remove
        T data = first.data;                        // hold first's data in temporary `data` variable
        first = first.next;                         // assign first to the first's next pointer
        if (first == null) {                        // if the new first is now null, then the queue is empty
            last = null;                            // then last is empty as well
        }
        return data;                                // return the removed node from the temporary `data` variable
    }

    /* peek() method shows the first node's data, if exists */
    public T peek() {
        if (first == null) throw new NoSuchElementException();  // throw exception if there is no first node
        return first.data;                                      // return first's data
    }

    /* isEmpty() method returns true if `first` is null */
    public boolean isEmpty() {                      // public method of type boolean
        return first == null;                       // returns true if first is null
    }
}
