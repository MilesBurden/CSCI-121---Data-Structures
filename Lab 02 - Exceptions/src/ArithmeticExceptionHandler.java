import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandler {
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Number to square root: ");
            try{
                double x = Math.sqrt(sc.nextDouble());
                System.out.println(x);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input is not a number");
            }
        }
    }
}
