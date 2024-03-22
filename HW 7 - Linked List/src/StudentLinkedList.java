public class StudentLinkedList {
    private StudentNode head;
    private StudentNode tail;

    public StudentLinkedList(){
        head = null;
        tail = null;
    }

    public void insertNode(Student student){
        StudentNode node = new StudentNode(student);
        if(head == null){
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
    }

    public StudentNode searchNode(String name){
        StudentNode current = head;
        if(!current.getStudent().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getStudent().getName();
                if(sname.equals(name)){
                    System.out.println("Prev    Node => " + current.getStudent().getName());
                    System.out.println("Current Node => " + current.getNext().getStudent().getName());
                    System.out.println("Next Node    => " + current.getNext().getNext().getStudent().getName());
                    return current.getNext();
                }
                else
                    current = current.getNext();
            }
        }
        return current;
    }

    public void deleteNode(String name){
        StudentNode current = head;
        if(!current.getStudent().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getStudent().getName();
                if(sname.equals(name)){
                    System.out.println("Prev    Node => " + current.getStudent().getName());
                    System.out.println("Current Node => " + current.getNext().getStudent().getName());
                    System.out.println("Next Node    => " + current.getNext().getNext().getStudent().getName());
                    current.setNext(current.getNext().getNext());
                    System.out.println("=====================");
                    break;
                }
                else
                    current = current.getNext();
            }
        }
    }


    public void printList(){
        StudentNode current = head;
        System.out.println("========Print Start=============");
        System.out.println(current.getStudent().getName());
        while(current.getNext() != null){
            System.out.println(current.getNext().getStudent().getName());
            current = current.getNext();
        }
        System.out.println("========Print End=============");
    }

    // removeAfter just removes the next item in the list after the given node
    public void removeAfter(StudentNode node){
        deleteNode(node.getNext().getStudent().getName());
    }

    // copies the list starting from the inputted node (searches for node and copies everything after that)
    public StudentLinkedList copy(StudentNode node){
        StudentNode current = node;
        StudentLinkedList list = new StudentLinkedList();
        list.insertNode(current.getStudent());
            while(current.getNext() != null){
                current = current.getNext();
                list.insertNode(current.getStudent());
            }
            return list;
    }

    // Searches through each item and if it finds a node with the same name as the key, ignores it the first time it finds it, and deletes any other isnstances
    public void removeDuplicate(StudentNode node, String key){
        StudentNode current = head;
        boolean found = false;
        while(current.getNext() != null){
            if (current.getStudent().getName() == key){
                if (found) {
                    deleteNode(current.getStudent().getName());
                }
                else{
                    found = true;
                }
            }
            current = current.getNext();
        }
        // checks again for the final item in the list
        if (current.getStudent().getName() == key && found){
            deleteNode(current.getStudent().getName());
        }
    }

    // Finds maximum function (this one looks for age fields because those are the ints I have, but it could be converted
    public int max() {
        StudentNode current = head.getNext();
        int i = current.getStudent().getAge();
        while(current.getNext() != null){
            current = current.getNext();
            if (current.getStudent().getAge() > i){
                i = current.getStudent().getAge();
            }
        }
        return i;
    }

}