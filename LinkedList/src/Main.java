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

        // create new empty linked list with head = null
        LinkedList<Integer> ll2 = new LinkedList<>();

        System.out.println(ll2);
        System.out.println(ll2.getLength());

    }
}
