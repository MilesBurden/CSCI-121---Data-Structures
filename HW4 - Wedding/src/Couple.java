public class Couple{
    static Person bride;
    static Person groom;

    public Couple(Person p1, Person p2){
        bride = p1;
        groom = p2;
    }

    public static Person getBride(){
        return(bride);
    }

    public static Person getGroom(){
        return(groom);
    }
}
