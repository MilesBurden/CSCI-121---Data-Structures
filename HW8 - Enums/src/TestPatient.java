import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient patient1 = new Patient();

        System.out.println("Input patient ID");
        int id1 = sc.nextInt();
        System.out.println("Input patient age");
        int age1 = sc.nextInt();
        System.out.println("Input patient blood type");
        String a = sc.nextLine();
        String type = sc.nextLine();
        System.out.println("Input patient blood Rh factor");
        String factor = sc.nextLine();
        System.out.println("=======================");

        Patient patient2 = new Patient(id1, age1, type, factor);


        System.out.println("Input patient ID");
        int id2 = sc.nextInt();
        System.out.println("Input patient age");
        int age2 = sc.nextInt();
        BloodData blood2 = new BloodData();
        System.out.println("=======================");

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
