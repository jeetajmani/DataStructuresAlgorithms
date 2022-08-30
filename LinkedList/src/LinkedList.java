public class LinkedList<T> {
    private Node<T> head;
    private int length;

    public void insert(T data) {
        // create new node to insert
        Node<T>newNode = new Node<>(data);

        // if the list is empty, add the new node at the head
        // otherwise, traverse through the list and add it at the end
        if (this.head == null) {
            this.head = newNode;
        } else {
            // create a temporary node for traversal
            Node<T> tmp = this.head;

            // traverse through the list until the last node is found
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            // set the last node to point to the new node
            tmp.setNext(newNode);
        }

        this.length += 1;
    }

    public void insertAtHead(T data) {
        // create new node to insert
        Node<T>newNode = new Node<>(data);

        // make the new node point to the previous head of the list
        newNode.setNext(this.head);

        // give the head position to the new node
        this.head = newNode;

        // increment length
        this.length += 1;
    }

/*    public Node<T> getFromIndex(int index) {
        int i = 0;
        Node<T> tmp = this.head;

        while (i <) {

        }
    }*/

/*    public void remove(T data) {
        Node<T> tmp = this.head;

        if (this.head.getValue() == data) {
            removeHead();
        } else {
            while(tmp.getNext() != null) {
                if (tmp.getValue() == data) {

                }
            }
        }
    }*/

    public void removeHead() {
        this.head = this.head.getNext();
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public String toString() {
        String s = "";

        Node<T> tmp = this.head;

        while (tmp != null) {
            s += tmp.getValue().toString() + " ";

            tmp = tmp.getNext();
        }

        return s;
    }

}
