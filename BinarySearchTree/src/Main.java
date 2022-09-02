public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> BST = new BinarySearchTree<>();

        BST.insert(5);
        BST.insert(4);
        BST.insert(199);
        BST.insert(1);
        BST.insert(50);
        BST.insert(75);
        BST.insert(2);

        System.out.println(BST.contains(199));
        System.out.println(BST.contains(2));

        System.out.println(BST.min());

        System.out.println("Pre-Order Traversal:");
        BST.preOrderTraversal();
        System.out.println("\n");

        System.out.println("In-Order Traversal:");
        BST.inOrderTraversal();
        System.out.println("\n");

        System.out.println("Post-Order Traversal:");
        BST.postOrderTraversal();
        System.out.println("\n");

        //BST1();

    }

    public static void BST1() {
        BinarySearchTree<Integer> BST = new BinarySearchTree<>();

        BST.insert(25);
        BST.insert(15);
        BST.insert(10);
        BST.insert(22);
        BST.insert(4);
        BST.insert(12);
        BST.insert(18);
        BST.insert(24);
        BST.insert(50);
        BST.insert(35);
        BST.insert(70);
        BST.insert(31);
        BST.insert(44);
        BST.insert(66);
        BST.insert(90);

        System.out.println("Pre-Order Traversal:");
        BST.preOrderTraversal();
        System.out.println("\n");

        System.out.println("In-Order Traversal:");
        BST.inOrderTraversal();
        System.out.println("\n");

        System.out.println("Post-Order Traversal:");
        BST.postOrderTraversal();
        System.out.println("\n");

    }
}
