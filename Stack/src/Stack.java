public class Stack<T> {

    private Node<T> top;
    private int N;

    public void push(T data) {
        if (isEmpty()) {
            top = new Node<>(data);
        } else {
            Node<T> tmp = top;

            top = new Node<>(data);

            top.setNext(tmp);

        }

        N++;
    }

    public T pop() {
        if (!isEmpty()) {
            Node<T> tmp = top;

            top = top.getNext();

            N--;

            return tmp.getValue();
        }

        return null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return N;
    }

    public String toString() {
        String s = "Stack: ";

        Node<T> tmp = this.top;

        while (tmp != null) {
            s += tmp.getValue().toString() + " ";

            tmp = tmp.getNext();
        }

        return s;
    }
}
