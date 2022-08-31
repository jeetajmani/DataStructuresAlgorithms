public class Main {
    public static void main(String[] args) {

        // create new empty linked list with head = null
        LinkedList<Integer> ll = new LinkedList<>();

        // insert nodes
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);

        ll.insertAtHead(0);

        System.out.println(ll);
        System.out.println(ll.getLength());

/*        // create new empty linked list with head = null
        LinkedList<Integer> ll2 = new LinkedList<>();

        System.out.println(ll2);
        System.out.println(ll2.getLength());
        System.out.println();*/


        System.out.println("Testing find method");
        System.out.println("Find 1: " + ll.find(1));
        System.out.println("Find 99: " + ll.find(99));
        System.out.println("Find null: " + ll.find(null));
        System.out.println();

        System.out.println("Testing delete method");
        System.out.println(ll);
        ll.delete(1);
        System.out.println("Delete element at first index and print list: " + ll);
        ll.delete(2);
        System.out.println("Delete element at second index and print list: " + ll);
        ll.delete(10);
        System.out.println("Delete element at tenth index and print list: " + ll);

    }

    // Sedgewick Exercises


}
