public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array List Example:");

        // Create new ArrayList
        ArrayList list = new ArrayList();

        System.out.println("List is empty: " + list.isEmpty());

        // Add Objects
        list.append(1);
        list.append(3);
        list.append(5);
        list.append(7);

        // Verify list is not empty
        System.out.println("List is empty: " + list.isEmpty());

        list.print();       // Show list contents

        list.setFirst();    // Set current to first position
        list.setValue(7);   // Set value at current position
        list.next();        // Move current to next
        list.setValue(5);
        list.next();
        list.setValue(3);
        list.next();
        list.setValue(1);

        // Show length of list
        System.out.println("Length of list: " + list.length());

        // Show list contents
        list.print();
    }
}
