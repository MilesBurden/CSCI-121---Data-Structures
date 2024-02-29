import java.time.LocalDate;

public class Wedding {
    static Couple couple;
    static LocalDate date;
    static String location;

    public Wedding(Couple c, LocalDate d, String l){
        couple = c;
        date = d;
        location = l;
    }

    public static Couple getCouple(){
        return(couple);
    }

    public static LocalDate getDate(){
        return(date);
    }

    public static String getLocation(){
        return(location);
    }
}
