import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static java.lang.Double.parseDouble;

public class Window extends JFrame {
    // setup & setting decimal formatting to have price displayed w/ 2 decimals always
    final int FRAME_WIDTH = 150;
    final int FRAME_HEIGHT = 300;
    static DecimalFormat df = new DecimalFormat("#.00");

    // Creating value arrays to add prices together for each selection
    // IntelliJ refuses to compile unless sizeValue is one-element array. I do not know why.
    static final double[] sizeValue = {5.00};
    static final double[] topValue = {0.00, 0.00, 0.00};
    // Creating a label for the price
    static JLabel price = new JLabel("Total: $" + df.format(sizeValue[0]));
    public static void totalCalc(){
        // checks if all three toppings are charged, and adds the three topping & the size price together, if all three are not $0, divides final topping price by 2
        // this function will be called at the end of eah actionListener
        if (topValue[0] != 0 && topValue[1] != 0 && topValue[2] != 0){
            price.setText("Total: $" + df.format((sizeValue[0] + topValue[0] + topValue[1] + (topValue[2] / 2))));
        }
        else{
            price.setText("Total: $" + df.format(sizeValue[0] + topValue[0] + topValue[1] + topValue[2]));
        }
    }
    public Window() {
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creating arrays to use as dropdown menus, I thought about making it a dictionary for prices, but since every topping is the same price, this is a lot simpler
        String[] sizes = { "Small $5.00", "Medium $10.00", "Large $15.00", "Super $20.00"};
        String[] toppings = { "none", "extra cheese", "mushroom", "anchovies", "pepperoni", "bacon", "pineapple"};

        // JComboBox makes a dropdown menu based on an array.
        JLabel sizeTitle = new JLabel("Size: ");
        JComboBox sizeList = new JComboBox(sizes);

        // These have names corresponding to the array position they need to edit. This is so they can all use the same ActionListner
        JComboBox topping1 = new JComboBox(toppings);
        topping1.setName("0");
        JComboBox topping2 = new JComboBox(toppings);
        topping2.setName("1");
        JComboBox topping3 = new JComboBox(toppings);
        topping3.setName("2");

        JLabel topTitle = new JLabel("Toppings: ");

        // ActionListeners all basically work the same,
        // it checks the selected item and changes the corresponding price value based on the price of the item
        // it then updates the price text to be accurate with the new selection
        ActionListener sizePrice = new ActionListener() {
            public void actionPerformed(ActionEvent sizePrice) {
                JComboBox sizecb = (JComboBox)sizePrice.getSource();
                // instead of hard coding each size to a price, we take the index of the selected size and use it to calculate price
                // this also means that you can add as many sizes as you want, and change the pricing very easily
                String sizeSelect = (String) sizecb.getSelectedItem();
                sizeValue[0] = parseDouble(sizeSelect.substring(sizeSelect.lastIndexOf("$") + 1, sizeSelect.length()));
                totalCalc();
            }
        };

        // only 1 actionlistener for topping menus, making use of JComboBox names in order to
        ActionListener topPrice1 = new ActionListener() {
            public void actionPerformed(ActionEvent topPrice1) {
                JComboBox topcb = (JComboBox)topPrice1.getSource();
                String topSelect = (String)topcb.getSelectedItem();
                String name = topcb.getName();
                // Checks if the topping selected is "none" (default) or "extra cheese" (no charge),
                if (topSelect == "none" || topSelect == "extra cheese") {
                    topValue[(Integer.valueOf(name))] = 0.00;
                }
                else{
                    topValue[(Integer.valueOf(name))] = 0.50;
                }
                totalCalc();
            }
        };

        sizeList.addActionListener(sizePrice);

        topping1.addActionListener(topPrice1);
        topping2.addActionListener(topPrice1);
        topping3.addActionListener(topPrice1);

        // Adding all the components into a layout

        setLayout(new FlowLayout());

        add(sizeTitle);
        add(sizeList);
        add(topTitle);
        add(topping1);
        add(topping2);
        add(topping3);
        add(price);
    }
}