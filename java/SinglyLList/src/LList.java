public class LList implements List {    // LList class
    private Link head;                  // Pointer or Reference to list header, first link
    private Link tail;                  // Pointer or Reference to list tail, last link
    protected Link current;             // Pointer or Reference to current link

    public LList() {                    // Constructor
        head = null;
        tail = null;
        current = null;
    }

    public void clear() {
        head.setNext(null);             // Drop access to remaining links
        current = tail = head;          // Reinitialize list
    }

    // Insert Object
    public void insert(Object item) {
        if (current == null) {          // If current is null, insert at head
            head = new Link(item, null);
            tail = head;
            current = head;
        } else {

            while (current.next() != null) {
                current = current.next();
            }
            if (current.next() == null) {
                current.setNext(new Link(item, null));
            }
            if (current == tail) {      // If current is tail, update tail
                tail = current.next();
            }
        }
    }

    // Insert Object at end of list
    public void append(Object item) {
        if (tail == null) {
            tail = new Link(item, null); // Create new link
        } else {
            tail.setNext(new Link(item, null));
            tail = tail.next();
        }
    }

    // Remove and return current Object
    public Object remove() {
        if (!isInList()) {
            return null;
        }

        Object item = current.element(); // Remember item to be removed
        if (tail == current.next()) {
            tail = current;
        }

        current.setNext(current.next().next()); // Remove link from list
        return item;
    }

    // Set current to first position
    public void setFirst() {
        current = head;
    }

    // Move current to next position
    public void next() {
        if (current != null) {
            current = current.next();
        }
    }

    // Move current to previous position
    public void prev() {
        if ((current == null) || (current == head)) {   // No previous Object
            return;
        }

        Link temp = head;   // Start at front of list
        while ((temp !=null) && (temp.next() != current)) { // Search for link
            temp = temp.next();
        }
        current = temp;     // Current now points to previous link
    }

    // Return current length of list
    public int length() {
        int length = 0;   // Counter for number of links
        for (Link temp = head.next(); temp != null; temp = temp.next()) {
            length++;
        }
        System.out.println(length); // Print to console
        return length;
    }

    // Set current to specified position
    public void setPos(int pos) { 
        current = head;
        for (int i = 0; current != null && i < pos; i++) {
            current = current.next();
        }
    }

    // Set current Object's value
    public void setValue(Object item) {
        if (current != null) {
            current.setElement(item);
        }
    }

    // Return current Object's value
    public Object currValue() {
        if (current != null) {
            return current.element();
        } else {
            return null;
        }
    }

    // Return true if list is empty
    public boolean isEmpty() {
        return (head == null);
    }

    // Return true if current is within list
    public boolean isInList() {
        return (current != null) && (current.next() != null);
    }

    // Print out the list's elements
    public void print() {
        if (isEmpty()) {
            System.out.println("()");
        }
        else {
            System.out.print("( ");
            for (setFirst(); isInList(); next()) {
                System.out.print(currValue() + " ");
            }
            System.out.println(")");
        }
    }
}
