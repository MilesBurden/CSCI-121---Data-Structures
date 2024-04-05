import java.util.Scanner;
import java.util.Random;

public class Main {
    public enum RPS{
        //Enum stores each possible input and what input it will beat
        ROCK("SCISSORS"), PAPER("ROCK"), SCISSORS("PAPER");
        private final String beats;
        RPS(String beats){
            this.beats = beats;
        }
        public String beats() {return beats;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //While loop keeps it running until stopped
        while(true) {
            //Asks for move input & randomly selects the computer's move
            System.out.println("Input move:");
            String move = sc.nextLine().toUpperCase();
            RPS compMove = RPS.values()[rand.nextInt(3)];
            //Try catch to make sure input is valid
            try {
                System.out.println(move + " vs " + compMove.name());
                //Checks if compMove beats player
                if (compMove.beats().equals(move)) {
                    System.out.println("Comp wins");
                //checks if player beats comp
                } else if (RPS.valueOf(move).beats() == compMove.name()) {
                    System.out.println("Player wins");
                //otherwise prints a tie
                } else {
                    System.out.println("Tie");
                }
            } catch (Exception e){
                System.out.println("Invalid input");
            }
        }
    }
}