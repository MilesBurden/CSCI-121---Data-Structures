public class Person {
    static String firstName;
    static String lastName;

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public static String getFirstName(){
        return(firstName);
    }

    public static String getLastName(){
        return(lastName);
    }
}
