import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert("computer");
        Scanner sc = new Scanner(System.in);
        String a;
        String q;
        String val2;
        TreeNode node = tree.root;

        while(true) {
            //tree.inOrderTraversal(tree.root);
            if(node.left == null) {
                System.out.print("Is your object: " + node.val + "  y/n: ");
                if (Objects.equals(sc.next(), "y")) {
                    System.out.println("Hooray, I got it right");
                    System.out.print("Would you like to play again? y/n: ");
                    if (!Objects.equals(sc.next(), "y")){
                        break;
                    }
                }
                else {
                    System.out.print("What was your object?:  ");
                    sc.nextLine();
                    val2 = sc.nextLine();
                    System.out.print("Please give a question that distinguishes between your answer and mine:  ");
                    q = sc.nextLine();
                    System.out.print("And what is the answer for your object?  y/n:  ");
                    a = sc.nextLine();
                    tree.insert(node.val, q, a, val2);
                }
                System.out.println("=================================================");
                node = tree.root;
            }
            else{
                System.out.print(node.val + " y/n: ");
                if(Objects.equals(sc.next(), "y")){
                    node = node.left;
                }
                else{
                    node = node.right;
                }
            }
        }
    }
}