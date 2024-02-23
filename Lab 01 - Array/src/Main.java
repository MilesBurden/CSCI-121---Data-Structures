import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] dubArray = new double[20];
        int i = 0;
        for (double x : dubArray) {
            System.out.println("next double [" + (i+1) + "/20]   (enter 99999 to print array)");
            double in = sc.nextDouble();
            
            if (in == 99999) {
                if(dubArray[0]==0.0){
                    System.out.println("No doubles in array");
                }
                else {
                    break;
                }
            }
            else {
                dubArray[i++] = in;
            }
        }

        for (double y : dubArray) {
            System.out.print(y + ", ");
        }
    }
}