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
        //Find the node where node val = val
        //make child nodes with both answers w/ left and right determined by question answer
        //replace current node val with question
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
                //if not the same, recurses down the tree to find the correct node
            } else {
                node.left = insertRecursive(node.left, val, q, a, val2);
                node.right = insertRecursive(node.right, val, q, a, val2);
            }
            return node;
            //try/catch for when you reach an incorrect leaf node
        }catch (NullPointerException e){
            return node;
        }
    }

    // Pre-order traversal
    public void preOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        //First print data of node
        System.out.print(root.val + " ");

        //Then recurse on left node
        preOrderTraversal(root.left);

        //Now recurse on right node
        preOrderTraversal(root.right);
    }

    // In-order traversal
    public void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        //First recurse on left child
        inOrderTraversal(root.left);

        //Then print the data of node
        System.out.print(root.val + " ");

        //Now recurse on right child
        inOrderTraversal(root.right);
    }

    // Post-order traversal
    public void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        //First recurse on left node
        postOrderTraversal(root.left);

        //Then recurse on right node
        postOrderTraversal(root.right);

        //Now deal with the node
        System.out.print(root.val + " ");
    }
}
