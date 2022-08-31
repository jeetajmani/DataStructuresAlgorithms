public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new stack and checking size");
        Stack<Integer> st = new Stack<>();
        System.out.println("Size: " + st.size());
        System.out.println();

        System.out.println("Adding 3 elements and checking size");
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Size: " + st.size());
        System.out.println();

        System.out.println("Printing stack");
        System.out.println(st);
        System.out.println();

        System.out.println("Removing top element and checking size");
        System.out.println(st.pop());
        System.out.println("Size: " + st.size());
        System.out.println();

        System.out.println("Printing stack again");
        System.out.println(st);
        System.out.println();

        System.out.println("Adding 1 more element and checking size\n");
        st.push(99);
        System.out.println("Size: " + st.size());
        System.out.println();

        System.out.println("Printing stack");
        System.out.println(st);
        System.out.println();

    }
}
