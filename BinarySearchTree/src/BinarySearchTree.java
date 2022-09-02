public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    // Inserting an element
    public void insert(T data) {
        root = insert(data, root);
    }

    private TreeNode<T> insert(T data, TreeNode<T> tn) {
        if (tn == null) {
            return new TreeNode<>(data);
        }

        if (data.compareTo(tn.getValue()) < 0) {
            tn.setLeft(insert(data, tn.getLeft()));
        } else if (data.compareTo(tn.getValue()) > 0) {
            tn.setRight(insert(data, tn.getRight()));
        }

        return tn;
    }

    // Removing an element
    public void delete(T data) {
        root = delete(data, root);
    }

    private TreeNode<T> delete(T data, TreeNode<T> tn) {
        if (tn == null) {
            return null;
        }

        if (data.compareTo(tn.getValue()) < 0) {
            tn.setLeft(insert(data, tn.getLeft()));
        } else if (data.compareTo(tn.getValue()) > 0) {
            tn.setRight(insert(data, tn.getRight()));
        } else {
            if (tn.getLeft() == null) {
                return tn.getRight();
            } else if (tn.getRight() == null) {
                return tn.getLeft();
            }

            TreeNode<T> t = tn;

            tn = min(t.getRight());

            tn.setRight(deleteMin(t.getRight()));

            tn.setLeft(t.getLeft());

        }

        return tn;
    }

    // Checking if an element is present
    public boolean contains(T data) {
        return contains(data, root);
    }

    private boolean contains(T data, TreeNode<T> tn) {
        if (tn == null) {
            return false;
        } else if (data.compareTo(tn.getValue()) < 0) {
            return contains(data, tn.getLeft());
        } else if (data.compareTo(tn.getValue()) > 0) {
            return contains(data, tn.getRight());
        } else {
            return true;
        }
    }

    // Traversals //

    // Pre-order traversal (root - left child - right child)
    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(TreeNode<T> tn) {
        if (tn == null) {
            return;
        }

        System.out.print(tn.getValue() + " ");

        preOrder(tn.getLeft());
        preOrder(tn.getRight());

    }

    // In-order traversal (left child - root - right child)
    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(TreeNode<T> tn) {
        if (tn == null) {
            return;
        }

        inOrder(tn.getLeft());

        System.out.print(tn.getValue() + " ");

        inOrder(tn.getRight());

    }


    // Post-order traversal (left child - right child - root)
    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(TreeNode<T> tn) {
        if (tn == null) {
            return;
        }

        postOrder(tn.getLeft());
        postOrder(tn.getRight());

        System.out.print(tn.getValue() + " ");

    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeNode<T> min() {
        return min(root);
    }

    private TreeNode<T> min(TreeNode<T> tn){
        if (tn.getLeft() == null) {
            return tn;
        } else {
            return min(tn.getLeft());
        }
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private TreeNode<T> deleteMin(TreeNode<T> tn) {
        if (tn.getLeft() == null) {
            return tn.getRight();
        }

        tn.setLeft(deleteMin(tn.getLeft()));

        return tn;
    }

}
