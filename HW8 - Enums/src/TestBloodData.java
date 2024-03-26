import java.sql.SQLOutput;
import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input blood type");
        String type = sc.next();
        System.out.println("Input Rh factor");
        String factor = sc.next();

        BloodData testBlood1 = new BloodData();
        BloodData testBlood2 = new BloodData(type, factor);

        System.out.println(testBlood1.getType() + testBlood1.getFactor());
        System.out.println(testBlood2.getType() + testBlood2.getFactor());
        System.out.println("===========================================");

        testBlood1.setFactor(factor);
        testBlood1.setType(type);

        System.out.println(testBlood1.getType() + testBlood1.getFactor());
        System.out.println(testBlood2.getType() + testBlood2.getFactor());
    }
}
