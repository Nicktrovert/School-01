package HelloWorld.Data.Stundenplan;

public enum Weekday {
    Montag,
    Dienstag,
    Mittwoch,
    Donnerstag,
    Freitag,
    Samstag,
    Sonntag;

    public static Weekday fromInteger(int x){
        return switch(x){
            case 0 -> Montag;
            case 1 -> Dienstag;
            case 2 -> Mittwoch;
            case 3 -> Donnerstag;
            case 4 -> Freitag;
            case 5 -> Samstag;
            case 6 -> Sonntag;
            default -> throw new IllegalArgumentException();
        };
    }
}
