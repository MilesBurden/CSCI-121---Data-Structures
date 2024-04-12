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

        //while loop to run until stopped
        while(true) {
            //if statement checks if node is leaf or not
            if(node.left == null) {
                //if it is, it asks if the objeect is correct, if so allows user to play again
                System.out.print("Is your object: " + node.val + "  y/n: ");
                if (Objects.equals(sc.next(), "y")) {
                    System.out.println("Hooray, I got it right");
                    System.out.print("Would you like to play again? y/n: ");
                    if (!Objects.equals(sc.next(), "y")){
                        break;
                    }
                }
                //if not, asks for the correct object, and a distinguishing question, and the answer for that question, see BinaryTree class for how this is added to the tree
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
                //nicer layout
                System.out.println("=================================================");
                node = tree.root;
            }
            //if node is not leaf, asks the question of the node, answer of y goes left, anything else goes right
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