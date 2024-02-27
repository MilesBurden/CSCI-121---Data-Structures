import java.util.InputMismatchException;
import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args){
        while(true){
            String[] nameArray = {"John","Jack","Mary","Smith","Carl","Suzie","Linus","Charlie","Peggy","Ann",};
            Scanner sc = new Scanner(System.in);
            System.out.println("name to print: ");
            try{
                System.out.println(nameArray[sc.nextInt() - 1]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Input is bigger than the size of the list, or is less than 1");
            }
            catch(InputMismatchException e){
                System.out.println("Input is not an integer");
            }
        }
    }
}