

class ArrayList implements List {
    private static final int defaultSize = 10;  // Default size of array

    private int msize;              // Maximum size of array
    private int numInList;          // Actual number of Objects in list
    private int curr;               // Position of current Object
    private Object[] listArray;     // Array of Objects

    // Constructor: default size
    ArrayList() {
        setup(defaultSize);
    }

    // Constructor: user-specified size
    ArrayList(int size) {
        setup(size);
    }

    private void setup(int size) {
        msize = size;
        numInList = 0;
        curr = -1;
        listArray = new Object[msize];  // Create listArray
    }

    public void clear() {               // Remove all Objects from list
        numInList = 0;
        curr = -1;
    }

    public void insert(Object item) {
        if (numInList == msize) {
            System.out.println("List is full");
            return;
        }
        else if (numInList == 0) {
            listArray[0] = item;
            numInList++;
            curr = 0;
        }
        else {
            for (int i = numInList; i > curr; i--) {   // Shift Objects right
                listArray[i] = listArray[i - 1];
            }
            listArray[curr + 1] = item;                // Insert item at current position
            numInList++;                               // Increment list size
            curr++;                                    // Increment current position
        }
    }

    public void append(Object item) {
        if (numInList == msize) {
            System.out.println("List is full");
            return;
        }
        else if (numInList == 0) {
            listArray[0] = item;
            numInList++;
            curr = 0;
        }
        else {
            listArray[numInList] = item;        // Insert item at tail
            numInList++;                        // Increment number of Objects
            curr++;
        }
    }

    public Object remove() {
        if (numInList == 0) {
            System.out.println("List is empty");
            return null;
        }
        else if (curr == -1) {
            System.out.println("No current object");
            return null;
        }
        else {
            Object temp = listArray[curr];              // Hold removed Object
            for (int i = curr; i < numInList; i++) {    // Shift Objects left
                listArray[i] = listArray[i + 1];
            }
            numInList--;                                // Decrement list size
            curr--;                                     // Decrement current position
            return temp;                                // Return removed Object
        }
    }

    public void setFirst() {
        curr = 0;               // Set current position to first element
    }

    public void prev() {        // Move curr to previous position
        if (curr == 0) {
            System.out.println("No previous item");
        }
        else {
            curr--;
        }
    }

    public void next() {        // Move curr to next position
        if (curr == numInList - 1) {
            System.out.println("No next item");
        }
        else {
            curr++;
        }
    }

    public int length() {
        return numInList;               // Return number of Objects
    }

    public void setPos(int pos) {
        if (pos < 0 || pos >= numInList) {
            System.out.println("Position out of range");
        }
        else {
            curr = pos;                 // Set current position
        }
    }

    public void setValue(Object item) {
        if (numInList == 0) {
            System.out.println("List is empty");
        }
        else if (curr == -1) {
            System.out.println("No current object");
        }
        else {
            listArray[curr] = item;     // Set current Object's value
        }
    }

    public Object currValue() {
        if (numInList == 0) {
            System.out.println("List is empty");
            return null;
        }
        else if (curr == -1) {
            System.out.println("No current object");
            return null;
        }
        else {
            return listArray[curr];     // Return current Object's value
        }
    }

    public boolean isEmpty() {
        return numInList == 0;          // Return true if list is empty
    }

    public boolean isInList() {
        return curr != -1;              // Return true if curr is in list
    }

    public void print() {
        if (numInList == 0) {
            System.out.println("List is empty");
        }
        else {
            for (int i = 0; i < numInList; i++) {   // Loop through list
                System.out.println(listArray[i]);   // Print Object value for each position
            }
        }
    }
}