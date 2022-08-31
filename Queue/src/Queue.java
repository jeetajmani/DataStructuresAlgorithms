public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int N;

    public void enqueue(T data) {
        Node<T> tmp = last;
        last = new Node<>(data);

        if (isEmpty()) {
            first = last;
        } else {
            tmp.setNext(last);
        }

        N++;
    }

    public T dequeue() {
        if (!isEmpty()) {
            Node<T> tmp = first;

            first = (first.getNext());

            N--;

            if (isEmpty()) {
                last = null;
            }

            return tmp.getValue();
        }


        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public String toString() {
        String s = "Queue: ";

        Node<T> tmp = this.first;

        while (tmp != null) {
            s += tmp.getValue().toString() + " ";

            tmp = tmp.getNext();
        }

        return s;
    }
}
