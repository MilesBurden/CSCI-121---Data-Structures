import java.util.Objects;

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert elements into the binary tree
    public void insert(String val, String q, String a, String val2) {
        root = insertRecursive(root, val, q, a, val2);
    }

    public void insert(String val){
        root = new TreeNode(val);
    }

    private TreeNode insertRecursive(TreeNode node, String val, String q, String a, String val2) {
        //Take node, comp answer, distinguishing question, answer to question, and human answer
        //Find the node where val = val
        //make child nodes with both answers by question answer
        //replace current node with question
        try {
            if (Objects.equals(val, node.val)) {
                if (Objects.equals(a, "y")) {
                    node.left = new TreeNode(val2);
                    node.right = new TreeNode(val);
                } else if (Objects.equals(a, "n")) {
                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val2);
                }
                node.val = q;
            } else {
                node.left = insertRecursive(node.left, val, q, a, val2);
                node.right = insertRecursive(node.right, val, q, a, val2);
            }
            return node;
        }catch (NullPointerException e){
            return node;
        }
    }

    // Pre-order traversal
    public void preOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // First print data of node
        System.out.print(root.val + " ");

        // Then recur on left subtree
        preOrderTraversal(root.left);

        // Now recur on right subtree
        preOrderTraversal(root.right);
    }

    // In-order traversal
    public void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // First recur on left child
        inOrderTraversal(root.left);

        // Then print the data of node
        System.out.print(root.val + " ");

        // Now recur on right child
        inOrderTraversal(root.right);
    }

    // Post-order traversal
    public void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // First recur on left subtree
        postOrderTraversal(root.left);

        // Then recur on right subtree
        postOrderTraversal(root.right);

        // Now deal with the node
        System.out.print(root.val + " ");
    }
}
