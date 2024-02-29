import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestWedding extends JFrame{
    public static Scanner sc = new Scanner(System.in);
    public TestWedding(){
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a heading with our bride and groom names
        JLabel heading = new JLabel("The wedding of "+  Wedding.couple.groom.getFirstName() +" "+ Wedding.couple.groom.getLastName() +", and "+ Wedding.couple.bride.getFirstName() +" "+ Wedding.couple.bride.getLastName());
        // And another with the date
        JLabel date = new JLabel(String.valueOf(Wedding.date));
        // And location
        JLabel location = new JLabel(Wedding.location);
        // Set in a layout
        setLayout(new GridLayout(3,1));
        add(heading);
        add(date);
        add(location);
    }

    public static void main(String[] args){
        // Scanners take inputs to create 2 person objects
        System.out.println("Input first spouse's first name: ");
        String p1firstname = sc.next();
        System.out.println("Input first spouse's last name: ");
        String p1lastname = sc.next();

        System.out.println("Input second spouse's first name: ");
        String p2firstname = sc.next();
        System.out.println("Input second spouse's last name: ");
        String p2lastname = sc.next();

        Person p1 = new Person(p1firstname, p1lastname);
        Person p2 = new Person(p2firstname, p2lastname);
        // Then they take a date
        System.out.println("Input date of wedding: ");
        String weddingDate = sc.next();

        // Then a string for location
        System.out.println("Input location of wedding: ");
        String dummy = sc.nextLine();  // Dummy string to eat the linebreak left by println
        String weddingLocale = sc.nextLine();

        // Put the two person objects into a couple object, then set a wedding object with
        //     said couple and out location and wedding date
        Couple couple = new Couple(p2, p1);
        try{
            LocalDate.parse(weddingDate);
        }
        catch(Exception e){
            System.out.println("Something went wrong, check your inputs (dates should be yyyy-mm-dd)");
        }
        Wedding wedding = new Wedding(couple, LocalDate.parse(weddingDate), weddingLocale);
        TestWedding example = new TestWedding();
        example.setVisible(true);
    }
}
