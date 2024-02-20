import java.util.Scanner;

public class UseDinnerParty {
    static int guests;
    static Party party = new Party();
    static Scanner sc = new Scanner(System.in);

    static DinnerParty dinnerParty = new DinnerParty();

    public static void main(String[] args) {
        System.out.println("Number of party guests:");
        party.setGuests(sc.nextInt());
        System.out.println(party.getGuests() + " guests at this party");
        party.displayInvitation();

        System.out.println("Number of dinner party guests:");
        dinnerParty.setGuests(sc.nextInt());
        System.out.println("Dinner choice: ");
        dinnerParty.dinnerChoice = sc.next();
        System.out.println(dinnerParty.getGuests() + " guests will be having " + dinnerParty.dinnerChoice);
        dinnerParty.displayInvitation();
    }
}
