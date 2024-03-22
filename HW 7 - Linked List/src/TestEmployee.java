public class TestEmployee {
    public static void main(String[] args) {
        Student chris = new Student("Chris", 19, "CS", 2025);
        Student john = new Student("John", 20, "DS", 2026);
        Student bill = new Student("Bill", 17, "Math", 2027);
        Student mona = new Student("Mona", 18, "Physics", 2034);
        Student tom = new Student("Tom", 18, "Physics", 2034);

//       System.out.println(chris.toString());
//
//       StudentNode chrisNode = new StudentNode(chris);
//       StudentNode johnNode = new StudentNode(john);
//       StudentNode billNode = new StudentNode(bill);
//       StudentNode monaNode = new StudentNode(mona);
//       chrisNode.setNext(johnNode);
//       johnNode.setNext(billNode);
//       billNode.setNext(monaNode);
//       System.out.println("Node 1 =>" + chrisNode.getStudent().getName());
//       System.out.println("Node 2 =>" + chrisNode.getNext().getStudent().getName());
//       System.out.println("Node 3 =>" + johnNode.getNext().getStudent().getName());
//       System.out.println("Node 4 =>" + billNode.getNext().getStudent().getName());


        StudentLinkedList list = new StudentLinkedList();
        list.insertNode(chris);
        list.insertNode(john);
        list.insertNode(bill);
        list.insertNode(mona);
        list.insertNode(tom);
        list.printList();
//        StudentNode foundNode = list.searchNode("Bill");
//        System.out.println(foundNode.getStudent().toString());
//        list.deleteNode("Bill");
//        list.printList();
//        list.insertNode(bill);
//        list.printList();

        //Testing removeAfter();=======================
//        StudentNode removeAfterNode = list.searchNode("Mona");
//        list.removeAfter(removeAfterNode);
//        list.printList();

        //Testing copy();===============================
//        StudentNode copyFromNode = list.searchNode("Chris");
//        StudentLinkedList newList = list.copy(copyFromNode);
//        newList.printList();

        //Testing removeDuplicate();====================
//        StudentNode duplicateNode = list.searchNode("Bill");
//        list.insertNode(bill);
//        list.printList();
//        list.removeDuplicate(duplicateNode, "Bill");
//        list.printList();

        //Testing max();================================
        System.out.println(list.max());
    }
}