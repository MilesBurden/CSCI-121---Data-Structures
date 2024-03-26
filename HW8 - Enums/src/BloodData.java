public class BloodData {
    public String bloodType;
    public String bloodFactor;

    //enum with each blood type
    public enum BloodGroup{
        A("+", "-"), B("+", "-"), AB("+", "-"), O("+", "-");
        private final String positive;
        private final String negative;
        BloodGroup(String positive, String negative){
            this.positive = positive;
            this.negative = negative;
        }
        public String positive() {return positive;}
        public String negative() {return negative;}
    }

    //default constructor
    public BloodData(){
        bloodType = BloodGroup.O.name();
        bloodFactor = BloodGroup.O.positive;
    }

    //overload constructor
    public BloodData(String type, String factor){
        bloodType = BloodGroup.valueOf(type).name();
        //switch statement checks for negative factor input, defaults to positive
        switch(factor){
            case "-":
                bloodFactor = BloodGroup.valueOf(type).negative;
                break;
            default:
                bloodFactor = BloodGroup.valueOf(type).positive;
                break;
        }
    }

    //set and get methods
    public void setType(String type){
        bloodType = type;
    }
    public void setFactor(String factor){
        bloodFactor = factor;
    }

    public String getType(){
        return bloodType;
    }
    public String getFactor(){
        return bloodFactor;
    }

}
