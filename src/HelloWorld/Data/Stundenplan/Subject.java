package HelloWorld.Data.Stundenplan;

public enum Subject {
    Mathemathik,
    Physik,
    Englisch,
    Deutsch,
    Informatik,
    Politik,
    Religion,
    Förderunterricht,
    Sport,
    Kunst,
    Musik,
    Chemie,
    Geschichte,
    Wirtschaft,
    Französisch,
    Spanisch,
    Erdkunde,
    None;

    public static Subject fromInteger(int x){
        return switch(x){
            case 0 -> Mathemathik;
            case 1 -> Physik;
            case 2 -> Englisch;
            case 3 -> Deutsch;
            case 4 -> Informatik;
            case 5 -> Politik;
            case 6 -> Religion;
            case 7 -> Förderunterricht;
            case 8 -> Sport;
            case 9 -> Kunst;
            case 10 -> Musik;
            case 11 -> Chemie;
            case 12 -> Geschichte;
            case 13 -> Wirtschaft;
            case 14 -> Französisch;
            case 15 -> Spanisch;
            case 16 -> Erdkunde;
            default -> throw new IllegalArgumentException();
        };
    }

    public static Subject fromString(String x){
        try{
            Subject s = Subject.valueOf(x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase());
            return s;
        } catch (IllegalArgumentException e){
            return switch (x.toLowerCase()){
                case "ma", "m" -> Subject.Mathemathik;
                case "ph" -> Subject.Physik;
                case "erd", "er" -> Subject.Erdkunde;
                case "spa" -> Subject.Spanisch;
                case "f", "fr", "fran" -> Subject.Französisch;
                case "ws", "w", "wirt" -> Subject.Wirtschaft;
                case "i", "in", "if", "im" -> Subject.Informatik;
                case "fö", "förder" -> Subject.Förderunterricht;
                case "r", "reli", "re", "rel", "rg" -> Subject.Religion;
                case "p", "po", "pol" -> Subject.Politik;
                case "d", "de", "deu" -> Subject.Deutsch;
                case "e", "eng", "en" -> Subject.Englisch;
                case "c", "ch", "che" -> Subject.Chemie;
                case "g", "ge", "ges", "gesch" -> Subject.Geschichte;
                case "k", "ku", "kun" -> Subject.Kunst;
                case "mu", "mus" -> Subject.Musik;
                case "sp", "s", "spo" -> Subject.Sport;
                default -> Subject.None;
            };
        }
    }
}
