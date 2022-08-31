public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new queue and checking size");
        Queue<Integer> q = new Queue<>();
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Adding 3 elements and checking size");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Printing queue");
        System.out.println(q);
        System.out.println();

        System.out.println("Removing first element and checking size");
        System.out.println(q.dequeue());
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Printing queue again");
        System.out.println(q);
        System.out.println();

        System.out.println("Adding 1 more element and checking size\n");
        q.enqueue(99);
        System.out.println("Size: " + q.size());
        System.out.println();

        System.out.println("Printing queue");
        System.out.println(q);
        System.out.println();

        System.out.println("Removing all elements");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println();

        System.out.println("Trying to dequeue on an empty queue");
        System.out.println(q.dequeue());
        System.out.println();

        System.out.println(q);
    }
}
