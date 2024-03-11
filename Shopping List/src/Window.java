import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShoppingCart sList = new ShoppingCart();

        //removes specified item from the list
        JButton remove = new JButton("remove");
        JTextField removeBox = new JTextField("number to remove");
        ActionListener removeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    sList.removeFromList(Integer.valueOf(removeBox.getText()) -1);
                    System.out.println("removed number " + removeBox.getText() + " from the list");
                }
                catch(Exception e1){
                    System.out.println("Invalid input, make sure the input is a number, and is at most the length of the list");
                }
            }
        };

        JTextField name = new JTextField("name");
        JTextField unitPrice = new JTextField("unit price");
        JTextField ammount = new JTextField("amount");

        //Adds specified item to the list, and prints a message so the user knows it did
        JButton add = new JButton("add to list");
        ActionListener confirmListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Item item = new Item(name.getText(), Double.valueOf(unitPrice.getText()));
                    ItemOrder order = new ItemOrder(item, Integer.valueOf(ammount.getText()));
                    sList.addToList(order);
                    System.out.println("added " + name.getText() + " to list");
                }
                catch(Exception e1){
                    System.out.println("Invalid inputs, make sure your price and amount are numbers");
                }
            }
        };

        //Prints the list to the console, separating columns for item name, amount, and price, and price
        //Also prints the total of all items in the list
        JButton print = new JButton("print list");
        ActionListener printListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item Name  |  Item Amount  | Price");
                double total = 0;
                for (ItemOrder i : sList.list) {
                    System.out.print(i.currentItem.itemName);
                    System.out.print("          " + i.itemAmount);
                    System.out.print("              " + i.currentItem.itemPrice);
                    System.out.println();
                    total += (i.currentItem.itemPrice * i.itemAmount);
                }
                System.out.println("Total: " + total);
            }
        };

        add.addActionListener(confirmListener);
        print.addActionListener(printListener);
        remove.addActionListener(removeListener);

        setLayout(new FlowLayout());

        add(removeBox);
        add(remove);

        add(name);
        add(unitPrice);
        add(ammount);
        add(add);
        add(print);
    }


    public static void main(String[] args){
        Window w = new Window();
        w.setVisible(true);
    }
}