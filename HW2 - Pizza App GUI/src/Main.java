import javax.swing.*;
import java.awt.*;

// --------------------------------------------------------------------------------------------------------------------------------------
// Create an application for the BigY Store. The user selects a pizza order from the list, and the app displays the price.
// The customer can select a pizza size of small ($5), medium ($10), large ($15), or super ($20) and one of a variety of toppings.
// There is a $0.50 additional charge for toppings; if the user requests two toppings, the additional cost is $1.
// There is also a deal in which, if a user requests three toppings, the additional cost should be $1.25, not $1.50.
// Max toppings is 3 and there is no additional charge for extra cheese.
// --------------------------------------------------------------------------------------------------------------------------------------

// size + (topping # price)

public class Main {
    public static void main(String[] args) {
        //everything is in the window class
        Window example = new Window();
        example.setVisible(true);
    }
}