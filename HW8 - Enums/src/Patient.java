public class Patient {
    public int id;
    public int age;
    public BloodData blood;

    public Patient(){
        id = 0;
        age = 0;
        blood = new BloodData();
    }

    public Patient( int idA, int ageA, String bloodType, String bloodFactor){
        id = idA;
        age = ageA;
        blood = new BloodData(bloodType, bloodFactor);
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public BloodData getBlood(){
        return blood;
    }
}
