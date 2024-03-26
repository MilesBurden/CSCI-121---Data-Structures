public class BloodData {
    public String bloodType;
    public String bloodFactor;

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

    public BloodData(){
        bloodType = BloodGroup.O.name();
        bloodFactor = BloodGroup.O.positive;
    }

    public BloodData(String type, String factor){
        bloodType = BloodGroup.valueOf(type).name();
        switch(factor){
            case "-":
                bloodFactor = BloodGroup.valueOf(type).negative;
                break;
            default:
                bloodFactor = BloodGroup.valueOf(type).positive;
                break;
        }
    }

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
