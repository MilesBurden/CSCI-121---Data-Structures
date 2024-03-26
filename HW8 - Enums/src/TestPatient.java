import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient patient1 = new Patient();

        System.out.println("Input patient ID");
        String id1 = sc.nextLine();
        System.out.println("Input patient age");
        String age1 = sc.nextLine();
        System.out.println("Input patient blood type");
        String type = sc.nextLine();
        System.out.println("Input patient blood Rh factor");
        String factor = sc.nextLine();
        System.out.println("=======================");

        Patient patient2 = null;
        try {
            patient2 = new Patient(Integer.valueOf(id1), Integer.valueOf(age1), type, factor);
        } catch (Exception e) {
            System.out.println("Invalid inputs");
        }

        int id2 = 0;
        int age2 = 0;
        try {
            System.out.println("Input patient ID");
            id2 = sc.nextInt();
            System.out.println("Input patient age");
            age2 = sc.nextInt();
            System.out.println("=======================");
        } catch (Exception e) {
            System.out.println("Invalid inputs");
        }
        BloodData blood2 = new BloodData();

        Patient patient3 = new Patient(id2, age2, blood2.getType(), blood2.getFactor());

        System.out.println("Patient 1");
        System.out.print("ID: " + patient1.id);
        System.out.print(", age: " + patient1.age);
        System.out.println(", blood type: " + patient1.getBlood().getType() + patient1.getBlood().getFactor());
        System.out.println("=======================");

        System.out.println("Patient 2");
        System.out.print("ID: " + patient2.id);
        System.out.print(", age: " + patient2.age);
        System.out.println(", blood type: " + patient2.getBlood().getType() + patient2.getBlood().getFactor());
        System.out.println("=======================");

        System.out.println("Patient 3");
        System.out.print("ID: " + patient3.id);
        System.out.print(", age: " + patient3.age);
        System.out.println(", blood type: " + patient3.getBlood().getType() + patient3.getBlood().getFactor());
        System.out.println("=======================");

    }
}
