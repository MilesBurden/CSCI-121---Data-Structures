import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

// Money Converter - Miles Burden 01/21/2024
//
// Simple program that takes a dollar and cents value as input,
// and outputs an equivalent number of quarters, dimes, nickels, and pennies
// (added pennies, and invalid input handling)

public class Main {
    public static void main(String[] args) {
        // While loop to keep it running until manually closed
        while(true){
            // Starts user with a dollar sign to make sure user doesn't input it
            System.out.print("Input: $");
            // Scanners to take an input
            Scanner sc = new Scanner(System.in);
            int money = 0;
            // Try - Catch to make sure the input is a valid double, if not prints error and restarts
            try {
                money = (int) (sc.nextDouble() * 100);
            }
            catch(Exception InputMismatchException){
                System.out.println("Invalid input, please try again");
                continue;
            }
            // In order to calculate each coin value, we take the base input money as an int (double multiplied by 100 for a cents value),
            // We then take the mod of any previous coin values in descending order before dividing the result by the current coin value (it makes more sense as a written equation)
            // penny does not divide by 1 because that would be redundant
            int quart = money / 25;
            int dime = (money % 25) / 10;
            int nickel = ((money % 25) % 10) / 5;
            int penny = ((money % 25) % 10) % 5;
            // Adds the values back together as a dollar value to make sure it has the correct total
            double total = ((nickel * 5) + (dime * 10) + (quart * 25) + penny) / (double) 100;
            // Print statements to show answer
            System.out.println(quart + " quarters, " + dime + " dimes, " + nickel + " nickels, and " + penny + " pennies" + " = $" + total);
    }}
}

