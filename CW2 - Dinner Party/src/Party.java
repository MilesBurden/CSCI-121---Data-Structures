public class Party {
    static int guests;
    public static void setGuests(int i){
        guests = i;
    }
    public static int getGuests(){
        return guests;
    }
    public static void displayInvitation(){
        System.out.println("Please come to my party!");
    }
}
