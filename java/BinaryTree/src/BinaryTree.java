public class BinaryTree {
    
    private Node root;
    
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if  (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        System.out.println("Inserted " + data + " on the left of: " + parent.data);
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        System.out.println("Inserted " + data + " on the right of: " + parent.data);
                        return;
                    }
                }
            }
        }
    }
}
