public class Link {                     // Link class
    private Object element;             // Object stored in the link
    private Link next;                  // Reference to next link

    Link(Object item, Link nextval) {   // Constructor 1, Given Object
        this.element = item;
        this.next = nextval;
    }

    Link(Link nextval) {                // Constructor 2
        this.next = nextval;
    }

    Link next() {                       // Provides access to private data member, next
        return this.next;
    }

    Link setNext(Link nextval) {        // Sets the value of the private data member, next
        this.next = nextval;
        return this;
    }

    Object element() {                  // Provides access to private data member, element
        return this.element;
    }

    Object setElement(Object item) {    // Sets the value of the private data member, element
        this.element = item;
        return this;
    }
}
